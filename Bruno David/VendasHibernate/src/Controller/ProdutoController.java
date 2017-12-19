/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.bean.Produto;
import Model.dao.ProdutoDao;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class ProdutoController {
    
    public void Menu(){
        Scanner sc= new Scanner(System.in);
        String valormenu;
        valormenu=JOptionPane.showInputDialog(null, "Digite o menu desejado \n"
                + "1- Cadastrar produto \n"
                + "2- Atualizar produto \n"
                + "3- Deletar produto ");
        
        
        switch(Integer.parseInt(valormenu)){
                case 1: cadastrarproduto();
                break;
//                case 2: atualizarusuario();
//                break;
//                case 4: deletarusuario();
//                break;
            }
        
            
      
        
    } // fim funcao menu
    
    public void cadastrarproduto(){
        Produto produtobean = new Produto();
        
        produtobean.setNomeproduto(JOptionPane.showInputDialog(null, "Digite o nome do produto"));
        produtobean.setValorproduto(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto")));
        
        ProdutoDao produtodao = new ProdutoDao();
        produtodao.cadastrarproduto(produtobean);
        
    }
    
    //
}
