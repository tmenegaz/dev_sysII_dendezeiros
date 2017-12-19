package bean;

import java.util.Objects;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vendedor")
public class VendedorBean implements java.io.Serializable {

    @Id
    @GeneratedValue
    private int id_Vendedor;
    private String nomeV;

    @OneToMany(mappedBy = "vendedores")
    private Set<VendaBean> vendas;

    public int getId_Vendedor() {
        return id_Vendedor;
    }

    public void setId_Vendedor(int id_Vendedor) {
        this.id_Vendedor = id_Vendedor;
    }

    public String getNomeV() {
        return nomeV;
    }

    public void setNomeV(String nomeV) {
        this.nomeV = nomeV;
    }

    public Set<VendaBean> getVendas() {
        return vendas;
    }

    public void setVendas(Set<VendaBean> vendas) {
        this.vendas = vendas;
    }
    
    

}
