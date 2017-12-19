/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name="venda")
public class VendaBean implements Serializable {

 //   @Id
 //   private int id_venda;
    @Id
    @ManyToOne
    private ProdutoBean produtos;
    
    @Id
    @ManyToOne
    private ClienteBean clientes;
    
    @Id
    @ManyToOne
    private VendedorBean vendedores;

//    public int getId_venda() {
//        return id_venda;
//    }
//
//    public void setId_venda(int id_venda) {
//        this.id_venda = id_venda;
//    }

    public ProdutoBean getProdutos() {
        return produtos;
    }

    public void setProdutos(ProdutoBean produtos) {
        this.produtos = produtos;
    }

    public ClienteBean getClientes() {
        return clientes;
    }

    public void setClientes(ClienteBean clientes) {
        this.clientes = clientes;
    }

    public VendedorBean getVendedores() {
        return vendedores;
    }

    public void setVendedores(VendedorBean vendedores) {
        this.vendedores = vendedores;
    }
    
    

}
