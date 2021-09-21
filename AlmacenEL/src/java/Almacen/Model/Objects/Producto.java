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
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByCodigoproducto", query = "SELECT p FROM Producto p WHERE p.codigoproducto = :codigoproducto"),
    @NamedQuery(name = "Producto.findByNombreproducto", query = "SELECT p FROM Producto p WHERE p.nombreproducto = :nombreproducto"),
    @NamedQuery(name = "Producto.findByMarcaproducto", query = "SELECT p FROM Producto p WHERE p.marcaproducto = :marcaproducto"),
    @NamedQuery(name = "Producto.findByModeloproducto", query = "SELECT p FROM Producto p WHERE p.modeloproducto = :modeloproducto"),
    @NamedQuery(name = "Producto.findByGarantiamesesproducto", query = "SELECT p FROM Producto p WHERE p.garantiamesesproducto = :garantiamesesproducto")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGOPRODUCTO")
    private String codigoproducto;
    @Size(max = 32)
    @Column(name = "NOMBREPRODUCTO")
    private String nombreproducto;
    @Size(max = 16)
    @Column(name = "MARCAPRODUCTO")
    private String marcaproducto;
    @Size(max = 32)
    @Column(name = "MODELOPRODUCTO")
    private String modeloproducto;
    @Column(name = "GARANTIAMESESPRODUCTO")
    private Integer garantiamesesproducto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private Collection<Productosbodega> productosbodegaCollection;

    public Producto() {
    }

    public Producto(String codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public String getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(String codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getMarcaproducto() {
        return marcaproducto;
    }

    public void setMarcaproducto(String marcaproducto) {
        this.marcaproducto = marcaproducto;
    }

    public String getModeloproducto() {
        return modeloproducto;
    }

    public void setModeloproducto(String modeloproducto) {
        this.modeloproducto = modeloproducto;
    }

    public Integer getGarantiamesesproducto() {
        return garantiamesesproducto;
    }

    public void setGarantiamesesproducto(Integer garantiamesesproducto) {
        this.garantiamesesproducto = garantiamesesproducto;
    }

    @XmlTransient
    public Collection<Productosbodega> getProductosbodegaCollection() {
        return productosbodegaCollection;
    }

    public void setProductosbodegaCollection(Collection<Productosbodega> productosbodegaCollection) {
        this.productosbodegaCollection = productosbodegaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoproducto != null ? codigoproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.codigoproducto == null && other.codigoproducto != null) || (this.codigoproducto != null && !this.codigoproducto.equals(other.codigoproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.Producto[ codigoproducto=" + codigoproducto + " ]";
    }
    
}
