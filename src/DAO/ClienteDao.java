
package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Msv Wangley
 */
public class ClienteDao implements Dao<Cliente>{

    @Override
    public Cliente get(int id) {
        Connection conexao = FactoryConnection.getConnection();
        try{
            PreparedStatement sentenca = conexao.prepareStatement("SELECT * FROM cliente WHERE id=?");
            sentenca.setInt(1, id);
            ResultSet resultado = sentenca.executeQuery();
            resultado.next();
            
            String nome = resultado.getString("nome");
            String email = resultado.getString("email");
            String telefone= resultado.getString("telefone");
            String  endereco= resultado.getString("endereco");
            
            Cliente cliente = new Cliente(id, nome, email, telefone, endereco);
            
            resultado.close();
            sentenca.close();
            conexao.close();
            return cliente;
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Cliente> getAll() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Connection conexao = FactoryConnection.getConnection();
        
        Statement sentenca;
        try{
            sentenca = conexao.createStatement();
            ResultSet resultado = sentenca.executeQuery("SELECT * FROM cliente");
            
            while(resultado.next()){
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String email = resultado.getString("email");
                String telefone = resultado.getString("telefone");
                String endereco = resultado.getString("endereco");
                
                Cliente cliente = new Cliente(id, nome, email, telefone, endereco);
                
                clientes.add(cliente);
            }
            resultado.close();
            sentenca.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return clientes;
    }

    @Override
    public void save(Cliente cliente) { //incluir um novo cliente
        Connection conexao = FactoryConnection.getConnection();
        try {
            PreparedStatement sentenca = conexao.prepareStatement("INSERT INTO cliente(nome, email, telefone, endereco) values(?, ?, ?, ?)");
            
            sentenca.setString(1, cliente.getNome());
            sentenca.setString(2, cliente.getEmail());
            sentenca.setString(3, cliente.getTelefone());
            sentenca.setString(4, cliente.getEndereco());
            
            sentenca.execute();
            
            sentenca.close();
            conexao.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Cliente cliente) {
        Connection conexao = FactoryConnection.getConnection();
        try {
            PreparedStatement sentenca = conexao.prepareStatement("UPDATE cliente SET nome = ?, email = ?,"
                    + "telefone = ?, endereco =? WHERE id =?");
            
            sentenca.setString(1,cliente.getNome());
            sentenca.setString(2, cliente.getEmail());
            sentenca.setString(3, cliente.getTelefone());
            sentenca.setString(4, cliente.getEndereco());
            sentenca.setInt(5, cliente.getId());
            
            sentenca.execute();
            
            sentenca.close();
            conexao.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Cliente cliente) {
        int id = cliente.getId();
        Connection conexao = FactoryConnection.getConnection();
        try {
            PreparedStatement sentenca = conexao.prepareStatement("DELETE  FROM cliente WHERE id=?");
            
            sentenca.setInt(1, id);
            sentenca.execute();
            
            sentenca.close();;
            conexao.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
