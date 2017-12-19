
package Conexao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexao {
    
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String  CAMINHO = "jdbc:mysql://localhost/venda";
    private static String USUARIO = "root";
    private static String SENHA = "";
    public Connection con;
    
    public static Connection getConnection(){
        
        try {
            
            Class.forName(DRIVER);
            return DriverManager.getConnection(CAMINHO, USUARIO, SENHA);   
        } catch (java.lang.ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro ao realizar conexão com o banco:  "+ex.getMessage());
           //JOptionPane.showMessageDialog(null,"Erro:  "+ ex.getMessage());
        }
    
      
  }
}
