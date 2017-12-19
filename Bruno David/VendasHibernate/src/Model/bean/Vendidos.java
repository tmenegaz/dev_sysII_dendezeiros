/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author bruno
 */
@Entity
public class Vendidos {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idvendidos;
    
    
    @ManyToOne
    @JoinColumn(name="idcliente", nullable=false)
    private Cliente cliente;
    
    
    
    @ManyToOne
    @JoinColumn(name="idproduto", nullable=false)
    private Produto produto;
    
    
    @ManyToOne
    @JoinColumn(name="idnomevendendor", nullable=false)
    private Vendedor vendedor;
    
    public Vendidos() {}

    /**
     * @return the idvendidos
     */
    public int getIdvendidos() {
        return idvendidos;
    }

    /**
     * @param idvendidos the idvendidos to set
     */
    public void setIdvendidos(int idvendidos) {
        this.idvendidos = idvendidos;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    
}
