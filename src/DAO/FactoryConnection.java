
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Msv Wangley
 */
public class FactoryConnection {
    public static Connection getConnection(){
        String url = "jdbc:postgresql://localhost:5433/Conexao_DAO";
        String usuario = "postgres";
	String password = "wangleymsv";
        
        try {
            Connection conexao =DriverManager.getConnection(url, usuario, password);
            return conexao;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
