
package DAO;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ClienteDao dao = new ClienteDao();
        
        boolean terminar = false;
        int opcao = 0;
        
        do{
            System.out.println("==============================");
            System.out.println("1 - Lista");
            System.out.println("2 - Incluir");
            System.out.println("3 - Editar");
            System.out.println("4 - Remover");
            System.out.println("5 - Sair");
            System.out.print("=> ");
            opcao = Integer.parseInt(leitor.nextLine());
            System.out.println("===========================");
            
            switch(opcao){
                case 1:{
                    List<Cliente> clientes = dao.getAll();
                    for (Cliente cliente:clientes) {
                        System.out.println(cliente);
                    }
                    break;
                }
                case 2:{ //cadastrar novo Cliente
                    int id = 0;
                    System.out.print("Nome: ");
                    String nome = leitor.nextLine();
                    System.out.print("Email: ");
                    String email = leitor.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = leitor.nextLine();
                    System.out.print("Endereco:  ");
                    String endereco = leitor.nextLine();
                    
                    Cliente clienteNovo = new Cliente(id, nome, email, telefone, endereco);
                    
                    dao.save(clienteNovo);
                    System.out.println("Cadastrado com sucesso novo cliente");
                    
                    break;
                }
                case 3:{ //Editar cliente
                    System.out.print("Informe o ID: ");
                    int id = Integer.parseInt(leitor.nextLine());
                    Cliente clienteEdicao = dao.get(id);
                    
                    System.out.println(clienteEdicao);
                    
                    if(clienteEdicao != null){
                        System.out.print("Novo nome: ");
                        String nome = leitor.nextLine();
                        System.out.print("Novo Email: ");
                        String email = leitor.nextLine();
                        System.out.print("Novo telefone: ");
                        String telefone = leitor.nextLine();
                        System.out.print("Novo endereco: ");
                        String endereco = leitor.nextLine();
                        
                        Cliente clienteAtualizado = new Cliente(id, nome, email, telefone, endereco);
                        
                        dao.update(clienteAtualizado);
                        System.out.println("Atualizado com sucesso!");
                    }
                    else{
                        System.out.println("Cliente "+id+" nao encontrado");
                    }
                    break;
                }
                case 4:{ //deletar um registro
                    System.out.println("Informe o ID: ");
                    int id = Integer.parseInt(leitor.nextLine());
                    Cliente cliente = new Cliente(id, "", "", "", "");
                    
                    dao.delete(cliente);
                    System.out.println("Deletado com sucesso!");
                    
                    break;
                } 
                case 5:{
                    System.out.println("Programa finalizado com sucesso!");
                    terminar = true;
                    break;
                }
                default:{
                    System.out.println("Operacao invalida, tente novamente!!!");
                    break;
                }
            }
            
        }while(!terminar);
    }
}
