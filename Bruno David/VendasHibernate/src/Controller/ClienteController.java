/*

 */
package Controller;

import Model.bean.Cliente;
import Model.dao.ClienteDao;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class ClienteController {
    
    public void Menu(){
        Scanner sc= new Scanner(System.in);
        String valormenu;
        valormenu=JOptionPane.showInputDialog(null, "Digite o menu desejado \n"
                + "1- Cadastrar Usuário \n"
                + "2- Atualizar Usuários \n"
                + "4- Deletar Usuários");
        
        
        switch(Integer.parseInt(valormenu)){
                case 1: cadastrarusuario();
                break;
                case 2: atualizarusuario();
                break;
                case 4: deletarusuario();
                break;
            }
        
            
      
        
    } // fim funcao menu
    
    
    
    
    

        // função controller cadastrar usuario
    public void cadastrarusuario(){
        Cliente clientebean= new Cliente();
        
        clientebean.setNomecliente(JOptionPane.showInputDialog(null, "Digite o nome do cliente"));
        clientebean.setNascimento(JOptionPane.showInputDialog(null, "Digite a data de nascimento"));
        clientebean.setTelefone(JOptionPane.showInputDialog(null, "Digite o numero de telefone"));
        
        ClienteDao clientedao= new ClienteDao();
        clientedao.cadastrarcliente(clientebean);
        
    } // fim funcao controller
    
    
    
    // atualizar usuario | controller
    public void atualizarusuario(){
         Cliente clientebean= new Cliente();
         clientebean.setIdcliente(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id a ser consultado")));
         clientebean.setNomecliente(JOptionPane.showInputDialog(null, "Digite o nome a ser mudado"));
         clientebean.setNascimento(JOptionPane.showInputDialog(null, "Digite a data de nascimento a ser mudado"));
         clientebean.setTelefone(JOptionPane.showInputDialog(null, "Digite o novo numero de telefone"));
         
         ClienteDao clientedao = new ClienteDao();
         clientedao.atualizacliente(clientebean);
    } // fim atualizar usuario | controller
    
    
    
    
    
    // deletar usuario | controller
    public void deletarusuario(){
        Cliente clientebean= new Cliente();
        clientebean.setIdcliente(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do usuario que deseja deletar")));
        int result = JOptionPane.showConfirmDialog(null, 
   "Você tem certeza que deseja deletar o usuario"+clientebean.getIdcliente()+"?",null, JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION) {
            ClienteDao clientedao = new ClienteDao();
            clientedao.deletarusuario(clientebean);
        } 
    }
    
    
    
}
