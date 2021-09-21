/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kevin Caicedo
 */
@Entity
@Table(name = "productosbodega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productosbodega.findAll", query = "SELECT p FROM Productosbodega p"),
    @NamedQuery(name = "Productosbodega.findByCodigoproducto", query = "SELECT p FROM Productosbodega p WHERE p.productosbodegaPK.codigoproducto = :codigoproducto"),
    @NamedQuery(name = "Productosbodega.findByCodigoproductosbodega", query = "SELECT p FROM Productosbodega p WHERE p.productosbodegaPK.codigoproductosbodega = :codigoproductosbodega"),
    @NamedQuery(name = "Productosbodega.findByCantidadproductobodega", query = "SELECT p FROM Productosbodega p WHERE p.cantidadproductobodega = :cantidadproductobodega"),
    @NamedQuery(name = "Productosbodega.findByCantidadminimaproducto", query = "SELECT p FROM Productosbodega p WHERE p.cantidadminimaproducto = :cantidadminimaproducto"),
    @NamedQuery(name = "Productosbodega.findByPrecioproductobodega", query = "SELECT p FROM Productosbodega p WHERE p.precioproductobodega = :precioproductobodega"),
    @NamedQuery(name = "Productosbodega.findByFechaexistenciaproducto", query = "SELECT p FROM Productosbodega p WHERE p.fechaexistenciaproducto = :fechaexistenciaproducto")})
public class Productosbodega implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductosbodegaPK productosbodegaPK;
    @Column(name = "CANTIDADPRODUCTOBODEGA")
    private Integer cantidadproductobodega;
    @Column(name = "CANTIDADMINIMAPRODUCTO")
    private Integer cantidadminimaproducto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIOPRODUCTOBODEGA")
    private BigDecimal precioproductobodega;
    @Column(name = "FECHAEXISTENCIAPRODUCTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaexistenciaproducto;
    @JoinColumn(name = "CODIGOBODEGA", referencedColumnName = "CODIGOBODEGA")
    @ManyToOne(optional = false)
    private Bodega codigobodega;
    @JoinColumn(name = "CODIGOPRODUCTO", referencedColumnName = "CODIGOPRODUCTO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productosbodega")
    private Collection<Detallecompra> detallecompraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productosbodega")
    private Collection<Salidaproductos> salidaproductosCollection;

    public Productosbodega() {
    }

    public Productosbodega(ProductosbodegaPK productosbodegaPK) {
        this.productosbodegaPK = productosbodegaPK;
    }

    public Productosbodega(String codigoproducto, String codigoproductosbodega) {
        this.productosbodegaPK = new ProductosbodegaPK(codigoproducto, codigoproductosbodega);
    }

    public ProductosbodegaPK getProductosbodegaPK() {
        return productosbodegaPK;
    }

    public void setProductosbodegaPK(ProductosbodegaPK productosbodegaPK) {
        this.productosbodegaPK = productosbodegaPK;
    }

    public Integer getCantidadproductobodega() {
        return cantidadproductobodega;
    }

    public void setCantidadproductobodega(Integer cantidadproductobodega) {
        this.cantidadproductobodega = cantidadproductobodega;
    }

    public Integer getCantidadminimaproducto() {
        return cantidadminimaproducto;
    }

    public void setCantidadminimaproducto(Integer cantidadminimaproducto) {
        this.cantidadminimaproducto = cantidadminimaproducto;
    }

    public BigDecimal getPrecioproductobodega() {
        return precioproductobodega;
    }

    public void setPrecioproductobodega(BigDecimal precioproductobodega) {
        this.precioproductobodega = precioproductobodega;
    }

    public Date getFechaexistenciaproducto() {
        return fechaexistenciaproducto;
    }

    public void setFechaexistenciaproducto(Date fechaexistenciaproducto) {
        this.fechaexistenciaproducto = fechaexistenciaproducto;
    }

    public Bodega getCodigobodega() {
        return codigobodega;
    }

    public void setCodigobodega(Bodega codigobodega) {
        this.codigobodega = codigobodega;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @XmlTransient
    public Collection<Detallecompra> getDetallecompraCollection() {
        return detallecompraCollection;
    }

    public void setDetallecompraCollection(Collection<Detallecompra> detallecompraCollection) {
        this.detallecompraCollection = detallecompraCollection;
    }

    @XmlTransient
    public Collection<Salidaproductos> getSalidaproductosCollection() {
        return salidaproductosCollection;
    }

    public void setSalidaproductosCollection(Collection<Salidaproductos> salidaproductosCollection) {
        this.salidaproductosCollection = salidaproductosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productosbodegaPK != null ? productosbodegaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productosbodega)) {
            return false;
        }
        Productosbodega other = (Productosbodega) object;
        if ((this.productosbodegaPK == null && other.productosbodegaPK != null) || (this.productosbodegaPK != null && !this.productosbodegaPK.equals(other.productosbodegaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.Productosbodega[ productosbodegaPK=" + productosbodegaPK + " ]";
    }
    
}
