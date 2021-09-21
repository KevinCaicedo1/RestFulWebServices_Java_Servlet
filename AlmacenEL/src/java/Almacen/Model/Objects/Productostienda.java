/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kevin Caicedo
 */
@Entity
@Table(name = "productostienda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productostienda.findAll", query = "SELECT p FROM Productostienda p"),
    @NamedQuery(name = "Productostienda.findByCodigoproducto", query = "SELECT p FROM Productostienda p WHERE p.productostiendaPK.codigoproducto = :codigoproducto"),
    @NamedQuery(name = "Productostienda.findByCodigoproductosbodega", query = "SELECT p FROM Productostienda p WHERE p.productostiendaPK.codigoproductosbodega = :codigoproductosbodega"),
    @NamedQuery(name = "Productostienda.findByCodigosalidaproducto", query = "SELECT p FROM Productostienda p WHERE p.productostiendaPK.codigosalidaproducto = :codigosalidaproducto"),
    @NamedQuery(name = "Productostienda.findByCodigoproductotienda", query = "SELECT p FROM Productostienda p WHERE p.productostiendaPK.codigoproductotienda = :codigoproductotienda"),
    @NamedQuery(name = "Productostienda.findByCantidadproductotienda", query = "SELECT p FROM Productostienda p WHERE p.cantidadproductotienda = :cantidadproductotienda"),
    @NamedQuery(name = "Productostienda.findByPreciounitarioventa", query = "SELECT p FROM Productostienda p WHERE p.preciounitarioventa = :preciounitarioventa")})
public class Productostienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductostiendaPK productostiendaPK;
    @Column(name = "CANTIDADPRODUCTOTIENDA")
    private Integer cantidadproductotienda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIOUNITARIOVENTA")
    private BigDecimal preciounitarioventa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productostienda")
    private Collection<Detalleventa> detalleventaCollection;
    @JoinColumns({
        @JoinColumn(name = "CODIGOPRODUCTO", referencedColumnName = "CODIGOPRODUCTO", insertable = false, updatable = false),
        @JoinColumn(name = "CODIGOPRODUCTOSBODEGA", referencedColumnName = "CODIGOPRODUCTOSBODEGA", insertable = false, updatable = false),
        @JoinColumn(name = "CODIGOSALIDAPRODUCTO", referencedColumnName = "CODIGOSALIDAPRODUCTO", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Salidaproductos salidaproductos;
    @JoinColumns({
        @JoinColumn(name = "CODIGOCIUDAD", referencedColumnName = "CODIGOCIUDAD"),
        @JoinColumn(name = "CODIGOTIENDA", referencedColumnName = "CODIGOTIENDA")})
    @ManyToOne(optional = false)
    private Tienda tienda;

    public Productostienda() {
    }

    public Productostienda(ProductostiendaPK productostiendaPK) {
        this.productostiendaPK = productostiendaPK;
    }

    public Productostienda(String codigoproducto, String codigoproductosbodega, String codigosalidaproducto, String codigoproductotienda) {
        this.productostiendaPK = new ProductostiendaPK(codigoproducto, codigoproductosbodega, codigosalidaproducto, codigoproductotienda);
    }

    public ProductostiendaPK getProductostiendaPK() {
        return productostiendaPK;
    }

    public void setProductostiendaPK(ProductostiendaPK productostiendaPK) {
        this.productostiendaPK = productostiendaPK;
    }

    public Integer getCantidadproductotienda() {
        return cantidadproductotienda;
    }

    public void setCantidadproductotienda(Integer cantidadproductotienda) {
        this.cantidadproductotienda = cantidadproductotienda;
    }

    public BigDecimal getPreciounitarioventa() {
        return preciounitarioventa;
    }

    public void setPreciounitarioventa(BigDecimal preciounitarioventa) {
        this.preciounitarioventa = preciounitarioventa;
    }

    @XmlTransient
    public Collection<Detalleventa> getDetalleventaCollection() {
        return detalleventaCollection;
    }

    public void setDetalleventaCollection(Collection<Detalleventa> detalleventaCollection) {
        this.detalleventaCollection = detalleventaCollection;
    }

    public Salidaproductos getSalidaproductos() {
        return salidaproductos;
    }

    public void setSalidaproductos(Salidaproductos salidaproductos) {
        this.salidaproductos = salidaproductos;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productostiendaPK != null ? productostiendaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productostienda)) {
            return false;
        }
        Productostienda other = (Productostienda) object;
        if ((this.productostiendaPK == null && other.productostiendaPK != null) || (this.productostiendaPK != null && !this.productostiendaPK.equals(other.productostiendaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.Productostienda[ productostiendaPK=" + productostiendaPK + " ]";
    }
    
}
