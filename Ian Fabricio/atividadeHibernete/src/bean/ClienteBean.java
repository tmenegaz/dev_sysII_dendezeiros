/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name="cliente")
public class ClienteBean implements Serializable {

    @Id
    @GeneratedValue
    private int id_Cliente;
    private String nomeC;

    @OneToMany(mappedBy = "clientes")
    private Set<VendaBean> vendas;

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }

    public Set<VendaBean> getVendas() {
        return vendas;
    }

    public void setVendas(Set<VendaBean> vendas) {
        this.vendas = vendas;
    }

    
}
