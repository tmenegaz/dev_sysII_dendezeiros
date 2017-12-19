
package Dao;

import Conexao.Conexao;
import bean.ClienteBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClienteDao {
    
    Connection conexao = null;
    PreparedStatement stm = null;
    
    
    
     public ClienteDao(){
        conexao = Conexao.getConnection();
    }    
        
    public void cadastrarCliente(ClienteBean cliente){
        String sql = "insert into cliente(nomeCliente) values (?)";
        
        try {

            stm = conexao.prepareCall(sql);
            stm.setString(1, cliente.getNomeCliente());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
            
            pesquisarCliente(cliente);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro"+ex.getMessage());
            throw new RuntimeException("Erro ao realizar cadastro: " + ex.getMessage());
        }
    }
    
    public void pesquisarCliente(ClienteBean cliente){
        
            
            String sql = "select * from cliente where nomeCliente = ?";
        
            try {
                stm = conexao.prepareStatement(sql);
                stm.setString(1, cliente.getNomeCliente());
                ResultSet rs = stm.executeQuery();

                if(rs.next()){
                    cliente.setIdCliente(rs.getInt("idCliente"));
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao encontrar cliente!");
                }
                
                if((conexao != null) && (stm != null)){
                    conexao.close();
                    stm.close();
                }else{
                    JOptionPane.showMessageDialog(null, "erro ao fechar conexao e preparedStatement");
                }
                
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage());
            }    
    }
   
    public void excluirCliente(ClienteBean cliente){
        String sql = "delete from cliente where nomeCliente = ?";
        
        try {
            
            stm = conexao.prepareCall(sql);
            stm.setString(1, cliente.getNomeCliente());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro"+ex.getMessage());
            //throw new RuntimeException("Erro ao realizar exclusão: " + ex.getMessage());
        }
    }
    
  
}
