/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import bean.ClienteBean;
import bean.ProdutoBean;
import bean.VendaBean;
import bean.VendedorBean;
import util.HibernateUtil;

/**
 *
 * @author Marcos
 */
public class VendaDao {
    private Session sessao = null;
    private Transaction tx = null;

    public void Salvar(VendedorBean vendedor, ProdutoBean produto, ClienteBean cliente) {
        try {
            
            VendaBean venda = new VendaBean();
            venda.setClientes(cliente);
            venda.setProdutos(produto);
            venda.setVendedores(vendedor);
            sessao = HibernateUtil.getSessionFactory().openSession();
            tx = sessao.beginTransaction();
            sessao.save(venda);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Venda cadastrada!");
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }
    }

//    public void listarAll() {
//
//        try {
//            List<Venda> list;
//            sessao = HibernateUtil.getSessionFactory().openSession();
//            tx = sessao.beginTransaction();
//            list = sessao.createQuery("from Venda").list();
//            tx.commit();
//
//            list.forEach((venda) -> {
//                System.out.println("Cliente: " + venda.getClientes().getNomeC() + " Produto: " + venda.getProdutos().getNomeP());
//            });
//        } catch (HibernateException e) {
//
//        } finally {
//            sessao.close();
//        }
//
//    }
}
