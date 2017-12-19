/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.bean.Vendedor;
import Model.dao.VendedorDao;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class VendedorController {
     public void Menu(){
        Scanner sc= new Scanner(System.in);
        String valormenu;
        valormenu=JOptionPane.showInputDialog(null, "Digite o menu desejado \n"
                + "1- Cadastrar vendedor \n"
                + "2- Atualizar vendedor \n"
                + "3- Listar vendedor ");
        
        
        switch(Integer.parseInt(valormenu)){
                case 1: cadastrarvendedor();
                break;
//                case 2: atualizarusuario();
//                break;
//                case 4: deletarusuario();
//                break;
            }
        
            
      
        
    } // fim funcao menu
     
     
     public void cadastrarvendedor(){
         Vendedor vendendorbean= new Vendedor();
         vendendorbean.setNomevendedor(JOptionPane.showInputDialog(null, "Digite o nome do vendedor"));
         
         VendedorDao vendedordao = new VendedorDao();
         vendedordao.cadastrarvendedor(vendendorbean);
         
         
     }
}
