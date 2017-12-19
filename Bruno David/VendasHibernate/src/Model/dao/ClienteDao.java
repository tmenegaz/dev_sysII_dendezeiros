/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;
import org.hibernate.Session;
import Model.bean.Cliente;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author bruno
 */
public class ClienteDao {
    
    private SessionFactory conexao;
    
    public ClienteDao(){
      conexao= new Configuration().configure().buildSessionFactory();
    }
    
    
    // funcao dao cadastrar cliente
    public void cadastrarcliente(Cliente clientebean){
       Session session;
       session = conexao.openSession();
       Transaction tx= null;
       try{
           
        tx= session.beginTransaction();
        session.save(clientebean);
        tx.commit();
         JOptionPane.showMessageDialog(null, "Cadastro inserido com suceso");
       }catch(HibernateException ex){
          if (tx!=null) tx.rollback();
         ex.printStackTrace();
       }finally{
           session.close();
       }
        
        
    } // fim funcao dao cadastrar cliente
    
    
    
    //Atualizar cliente | Dao
    public void atualizacliente(Cliente clientebean){
       Session session;
       session = conexao.openSession();
       Transaction tx= null;
      try{
       tx= session.beginTransaction();
         session.update(clientebean); 
         tx.commit();
         JOptionPane.showMessageDialog(null, "Dados atualizados com suceso");
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      } // fim finally
    } // fim atualizar cliente | Dao
    
    
    
    // deletar usuario | Dao
    public void deletarusuario(Cliente clientebean){
        Session session;
       session = conexao.openSession();
       Transaction tx= null;
      try{
       tx= session.beginTransaction();
         session.delete(clientebean); 
         tx.commit();
         JOptionPane.showMessageDialog(null, "Usuário excluido com suceso");
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      } // fim finally
      
    } // Deletar usuario | Dao
}
