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
@Table(name = "proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p"),
    @NamedQuery(name = "Proveedor.findByCodigoproveedor", query = "SELECT p FROM Proveedor p WHERE p.codigoproveedor = :codigoproveedor"),
    @NamedQuery(name = "Proveedor.findByNombreproveedor", query = "SELECT p FROM Proveedor p WHERE p.nombreproveedor = :nombreproveedor"),
    @NamedQuery(name = "Proveedor.findByDireccionproveedo", query = "SELECT p FROM Proveedor p WHERE p.direccionproveedo = :direccionproveedo"),
    @NamedQuery(name = "Proveedor.findByFonoproveedor", query = "SELECT p FROM Proveedor p WHERE p.fonoproveedor = :fonoproveedor")})
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGOPROVEEDOR")
    private String codigoproveedor;
    @Size(max = 32)
    @Column(name = "NOMBREPROVEEDOR")
    private String nombreproveedor;
    @Size(max = 32)
    @Column(name = "DIRECCIONPROVEEDO")
    private String direccionproveedo;
    @Size(max = 16)
    @Column(name = "FONOPROVEEDOR")
    private String fonoproveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedor")
    private Collection<Compra> compraCollection;

    public Proveedor() {
    }

    public Proveedor(String codigoproveedor) {
        this.codigoproveedor = codigoproveedor;
    }

    public String getCodigoproveedor() {
        return codigoproveedor;
    }

    public void setCodigoproveedor(String codigoproveedor) {
        this.codigoproveedor = codigoproveedor;
    }

    public String getNombreproveedor() {
        return nombreproveedor;
    }

    public void setNombreproveedor(String nombreproveedor) {
        this.nombreproveedor = nombreproveedor;
    }

    public String getDireccionproveedo() {
        return direccionproveedo;
    }

    public void setDireccionproveedo(String direccionproveedo) {
        this.direccionproveedo = direccionproveedo;
    }

    public String getFonoproveedor() {
        return fonoproveedor;
    }

    public void setFonoproveedor(String fonoproveedor) {
        this.fonoproveedor = fonoproveedor;
    }

    @XmlTransient
    public Collection<Compra> getCompraCollection() {
        return compraCollection;
    }

    public void setCompraCollection(Collection<Compra> compraCollection) {
        this.compraCollection = compraCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoproveedor != null ? codigoproveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.codigoproveedor == null && other.codigoproveedor != null) || (this.codigoproveedor != null && !this.codigoproveedor.equals(other.codigoproveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.Proveedor[ codigoproveedor=" + codigoproveedor + " ]";
    }
    
}
