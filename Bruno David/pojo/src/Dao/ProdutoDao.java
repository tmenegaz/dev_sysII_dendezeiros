
package Dao;

import Conexao.Conexao;
import bean.ProdutoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutoDao {
    
  Connection conexao = null;
    PreparedStatement stm = null;
    
    
     public ProdutoDao(){
        conexao = Conexao.getConnection();
    }    
        
    public void cadastrarProduto(ProdutoBean produto){
        String sql = "insert into produto(nomeProd) values (?)";
        
        try {

            stm = conexao.prepareCall(sql);
            stm.setString(1, produto.getNomeProd());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
            
            pesquisarProduto(produto);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro"+ex.getMessage());
            throw new RuntimeException("Erro ao realizar cadastro: " + ex.getMessage());
        }
    }  
    
    public void pesquisarProduto(ProdutoBean produto){
        
            
            String sql = "select * from produto where nomeProd = ?";
        
            try {
                stm = conexao.prepareStatement(sql);
                stm.setString(1, produto.getNomeProd());
                ResultSet rs = stm.executeQuery();

                if(rs.next()){
                    produto.setIdProd(rs.getInt("idProd"));
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao pesquisar Produto!");
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
   
    public void excluirProduto(ProdutoBean produto){
        String sql = "delete from produto where nomeProd = ?";
        
        try {

            stm = conexao.prepareCall(sql);
            stm.setString(1, produto.getNomeProd());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro"+ex.getMessage());
            throw new RuntimeException("Erro ao realizar exclusão: " + ex.getMessage());
        }
    }
    
}
