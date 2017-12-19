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
public class Vendedor {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idnomevendendor;
    private String nomevendedor;

   

    /**
     * @return the idnomevendendor
     */
    public int getIdnomevendendor() {
        return idnomevendendor;
    }

    /**
     * @param idnomevendendor the idnomevendendor to set
     */
    public void setIdnomevendendor(int idnomevendendor) {
        this.idnomevendendor = idnomevendendor;
    }

    /**
     * @return the nomevendedor
     */
    public String getNomevendedor() {
        return nomevendedor;
    }

    /**
     * @param nomevendedor the nomevendedor to set
     */
    public void setNomevendedor(String nomevendedor) {
        this.nomevendedor = nomevendedor;
    }

  
   
}
