/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.bean.Cliente;
import Model.bean.Produto;
import Model.bean.Vendedor;
import Model.bean.Vendidos;
import Model.dao.VendidosDao;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class VendidosController {
    
    public void Menu(){
       
        String valormenu;
        valormenu=JOptionPane.showInputDialog(null, "Digite o menu desejado \n"
                + "1- Cadastrar venda \n"
                + "2- Listar vendas ");
        
        
        switch(Integer.parseInt(valormenu)){
                case 1: cadastrarvenda();
                break;
                case 2: listarvendas();
                break;
//                case 4: deletarusuario();
//                break;
            }
        
            
      
        
    } // fim funcao menu
    
    public void cadastrarvenda(){
        Vendidos vendidosbean = new Vendidos();
        
       
       Cliente clientebean = new Cliente();
       clientebean.setCpf(JOptionPane.showInputDialog(null, "Digite o cpf do usuário"));
        
        vendidosbean.setCliente(clientebean);
        
        
        Produto produtobean = new Produto();
        produtobean.setIdproduto(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do produto")));
        
        vendidosbean.setProduto(produtobean);
        
        
        Vendedor vendedorbean  = new Vendedor();
        
        vendedorbean.setIdnomevendendor(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do vendedor")));
        
        vendidosbean.setVendedor(vendedorbean);
        
        VendidosDao vendidosdao= new VendidosDao();
        vendidosdao.cadastrarvendas(vendidosbean);
        
        
        
    }
    
    
    public void listarvendas(){
        
    }
}
