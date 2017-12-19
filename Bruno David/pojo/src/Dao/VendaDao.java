/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Conexao.Conexao;
import bean.ClienteBean;
import bean.ProdutoBean;
import bean.VendaBean;
import bean.VendedorBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VendaDao {
    
    Connection conexao = null;
    PreparedStatement stm = null;
    
    ClienteDao client = new ClienteDao();
    ClienteBean cliente = new ClienteBean();
    
    ProdutoDao prod = new ProdutoDao();
    ProdutoBean produto = new ProdutoBean();
    
    VendedorDao vende = new VendedorDao();
    VendedorBean vendedor = new VendedorBean();
    
    
    public VendaDao(){
        conexao = Conexao.getConnection();
    }
    
    public void cadastrarVenda(VendaBean venda){
        String sql = "insert into _venda( idCliente, idVendedor, idProd) values(?,?,?)";
        ClienteDao dao = new ClienteDao();
        try {
                   
                    
                    stm = conexao.prepareStatement(sql);
                    stm.setInt(1, venda.getIdCliente());
                    stm.setInt(2, venda.getIdVendedor());
                    stm.setInt(3, venda.getIdProd());

                    stm.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Cadastrada");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
