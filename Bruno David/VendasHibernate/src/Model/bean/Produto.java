/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author bruno
 */
@Entity
public class Produto {

    
    private String nomeproduto;
    private double valorproduto;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idproduto;

   

    /**
     * @return the nomeproduto
     */
    public String getNomeproduto() {
        return nomeproduto;
    }

    /**
     * @param nomeproduto the nomeproduto to set
     */
    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    /**
     * @return the valorproduto
     */
    public double getValorproduto() {
        return valorproduto;
    }

    /**
     * @param valorproduto the valorproduto to set
     */
    public void setValorproduto(double valorproduto) {
        this.valorproduto = valorproduto;
    }

    /**
     * @return the idproduto
     */
    public int getIdproduto() {
        return idproduto;
    }

    /**
     * @param idproduto the idproduto to set
     */
    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

   
}
