/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import bean.VendedorBean;
import util.HibernateUtil;

/**
 *
 * @author Marcos
 */
public class VendedorDao {

    private Session sessao = null;
    private Transaction tx = null;

    public void Salvar(VendedorBean vendedor) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            tx = sessao.beginTransaction();
            sessao.save(vendedor);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!!");
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }
    }
        public void Excluir(VendedorBean vendedor) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            tx = sessao.beginTransaction();
            sessao.delete(vendedor);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!!!");
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }
    }
    

    public void listarAll() {

        try {
            List<VendedorBean> list;
            sessao = HibernateUtil.getSessionFactory().openSession();
            tx = sessao.beginTransaction();
            list = sessao.createQuery("from Vendedor").list();
            tx.commit();

            list.forEach((vendedor) -> {
                System.out.println("Vendedor: " + vendedor.getNomeV());
            });
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }

    }
    
        public List<VendedorBean> listar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        List<VendedorBean> vendedores = new ArrayList();
        try {
            Query consulta = sessao.createQuery("from Vendedor");
            vendedores = consulta.list();
        } catch (RuntimeException ex) {
            throw ex;

        } finally {
            sessao.close();
        }
        return vendedores;
    }

}
