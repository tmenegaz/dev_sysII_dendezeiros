/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendashibernate;

import Controller.ClienteController;
import Controller.ProdutoController;
import Controller.VendedorController;
import Controller.VendidosController;
import Model.bean.Cliente;
import Model.dao.ClienteDao;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String valormenu;
        valormenu=JOptionPane.showInputDialog(null, "Digite o menu desejado \n"
                + "1- Gerenciar Clientes \n"
                + "2- Gerenciar Produtos \n"
                + "3- Gerenciar Vendendor \n"
                + "4- Gerenciar Vendas");
                
        
        
            ClienteController clientecontrol = new ClienteController();
            ProdutoController produtocontrol = new ProdutoController();
            VendedorController vendedorcontrol = new VendedorController();
            VendidosController vendidoscontrol = new VendidosController();
            
            switch(Integer.parseInt(valormenu)){
                case 1: clientecontrol.Menu();
                break;
                
                case 2: produtocontrol.Menu();
                break;
                
                case 3: vendedorcontrol.Menu();
                break;
                
                case 4: vendidoscontrol.Menu();
                break;
            }
            
        
        
    }
    
}
