/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.bean.Vendidos;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author bruno
 */
public class VendidosDao {
     private SessionFactory conexao;
    
    public VendidosDao(){
      conexao= new Configuration().configure().buildSessionFactory();
    }
    
    
    // funcao dao cadastrar vendas
    public void cadastrarvendas(Vendidos vendidos){
       Session session;
       session = conexao.openSession();
       Transaction tx= null;
       try{
           
        tx= session.beginTransaction();
        session.save(vendidos);
        tx.commit();
         JOptionPane.showMessageDialog(null, "Cadastro inserido com suceso");
       }catch(HibernateException ex){
          if (tx!=null) tx.rollback();
         ex.printStackTrace();
       }finally{
           session.close();
       }
        
        
    } // fim funcao dao cadastrar vendas
    
    
    
 

}
