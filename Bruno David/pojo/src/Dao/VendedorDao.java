
package Dao;

import Conexao.Conexao;
import bean.VendedorBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VendedorDao {
    
    
  Connection conexao = null;
    PreparedStatement stm = null;
    
    
     public VendedorDao(){
        conexao = Conexao.getConnection();
    }    
        
    public void cadastrarVendedor(VendedorBean vendedor){
        String sql = "insert into vendedor(nome) values (?)";
        
        try {

            stm = conexao.prepareCall(sql);
            stm.setString(1, vendedor.getNome());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vendedor(a) cadastrado(a) com sucesso");
            
            pesquisarVendedor(vendedor);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "erro"+ex.getMessage());
            throw new RuntimeException("Erro ao realizar cadastro: " + ex.getMessage());
        }
    }
    
    public void pesquisarVendedor(VendedorBean vendedor){
        
            
            String sql = "select * from vendedor where nome = ?";
        
            try {
                stm = conexao.prepareStatement(sql);
                stm.setString(1, vendedor.getNome());
                ResultSet rs = stm.executeQuery();

                if(rs.next()){
                    vendedor.setIdVendedor(rs.getInt("idVendedor"));
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao pesquisar  Vendedor!");
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
   
    public void excluirVendedor(VendedorBean vendedor){
        String sql = "delete from vendedor where nome = ?";
        
        try {

            stm = conexao.prepareCall(sql);
            stm.setString(1, vendedor.getNome());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vendedor excluído com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro"+ex.getMessage());
            throw new RuntimeException("Erro ao realizar exclusão: " + ex.getMessage());
        }
    }
    

}
