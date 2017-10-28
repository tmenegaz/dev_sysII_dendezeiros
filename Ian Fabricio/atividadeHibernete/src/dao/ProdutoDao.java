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
import bean.ProdutoBean;
import util.HibernateUtil;

/**
 *
 * @author Marcos
 */
public class ProdutoDao {

    private Session sessao = null;
    private Transaction tx = null;

    public void Salvar(ProdutoBean produto) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            tx = sessao.beginTransaction();
            sessao.save(produto);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!!");
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }
    }
    
        public void Excluir(ProdutoBean produto) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            tx = sessao.beginTransaction();
            sessao.delete(produto);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!!!");
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }
    }

    public void listarAll() {

        try {
            List<ProdutoBean> list;
            sessao = HibernateUtil.getSessionFactory().openSession();
            tx = sessao.beginTransaction();
            list = sessao.createQuery("from Produto").list();
            tx.commit();

            list.forEach((produto) -> {
                System.out.println("Produto: " + produto.getNomeP());
            });
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }

    }
    
    public List<ProdutoBean> listar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        List<ProdutoBean> produtos = new ArrayList();
        try {
            Query consulta = sessao.createQuery("from Produto");
            produtos = consulta.list();
        } catch (RuntimeException ex) {
            throw ex;

        } finally {
            sessao.close();
        }
        return produtos;
    }
}
