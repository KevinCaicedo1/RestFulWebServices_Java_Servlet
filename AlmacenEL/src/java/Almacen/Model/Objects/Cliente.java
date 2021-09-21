/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kevin Caicedo
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCodigocliente", query = "SELECT c FROM Cliente c WHERE c.codigocliente = :codigocliente"),
    @NamedQuery(name = "Cliente.findByCedulacliente", query = "SELECT c FROM Cliente c WHERE c.cedulacliente = :cedulacliente"),
    @NamedQuery(name = "Cliente.findByNombrecliente", query = "SELECT c FROM Cliente c WHERE c.nombrecliente = :nombrecliente"),
    @NamedQuery(name = "Cliente.findByFonocliente", query = "SELECT c FROM Cliente c WHERE c.fonocliente = :fonocliente"),
    @NamedQuery(name = "Cliente.findByDireccioncliente", query = "SELECT c FROM Cliente c WHERE c.direccioncliente = :direccioncliente"),
    @NamedQuery(name = "Cliente.findByEmailcliente", query = "SELECT c FROM Cliente c WHERE c.emailcliente = :emailcliente")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGOCLIENTE")
    private String codigocliente;
    @Size(max = 10)
    @Column(name = "CEDULACLIENTE")
    private String cedulacliente;
    @Size(max = 32)
    @Column(name = "NOMBRECLIENTE")
    private String nombrecliente;
    @Size(max = 16)
    @Column(name = "FONOCLIENTE")
    private String fonocliente;
    @Size(max = 32)
    @Column(name = "DIRECCIONCLIENTE")
    private String direccioncliente;
    @Size(max = 32)
    @Column(name = "EMAILCLIENTE")
    private String emailcliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Collection<Venta> ventaCollection;

    public Cliente() {
    }

    public Cliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }

    public String getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getFonocliente() {
        return fonocliente;
    }

    public void setFonocliente(String fonocliente) {
        this.fonocliente = fonocliente;
    }

    public String getDireccioncliente() {
        return direccioncliente;
    }

    public void setDireccioncliente(String direccioncliente) {
        this.direccioncliente = direccioncliente;
    }

    public String getEmailcliente() {
        return emailcliente;
    }

    public void setEmailcliente(String emailcliente) {
        this.emailcliente = emailcliente;
    }

    @XmlTransient
    public Collection<Venta> getVentaCollection() {
        return ventaCollection;
    }

    public void setVentaCollection(Collection<Venta> ventaCollection) {
        this.ventaCollection = ventaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigocliente != null ? codigocliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codigocliente == null && other.codigocliente != null) || (this.codigocliente != null && !this.codigocliente.equals(other.codigocliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.Cliente[ codigocliente=" + codigocliente + " ]";
    }
    
}
