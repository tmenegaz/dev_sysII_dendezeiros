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
import bean.ClienteBean;
import util.HibernateUtil;

/**
 *
 * @author Marcos
 */
public class ClienteDao {

    private Session sessao = null;
    private Transaction tx = null;

    public ClienteDao() {
    }

    public void Salvar(ClienteBean cliente) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            tx = sessao.beginTransaction();
            sessao.save(cliente);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }
    }

    public void Excluir(ClienteBean cliente) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            tx = sessao.beginTransaction();
            sessao.delete(cliente);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!!!");
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }
    }

    public void listarAll() {

        List<ClienteBean> list = null;
        sessao = HibernateUtil.getSessionFactory().openSession();
        tx = sessao.beginTransaction();

        list = sessao.createQuery("from Cliente").list();
        tx.commit();

        for (ClienteBean cliente : list) {
            System.out.println("Cliente: " + cliente.getNomeC());
        }
        sessao.close();

    }

    public List<ClienteBean> listar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        List<ClienteBean> clientes = new ArrayList();
        try {
            Query consulta = sessao.createQuery("from Cliente");
            clientes = consulta.list();
        } catch (RuntimeException ex) {
            throw ex;

        } finally {
            sessao.close();
        }
        return clientes;
    }
}
