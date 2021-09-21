/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kevin Caicedo
 */
@Entity
@Table(name = "detalleventa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detalleventa.findAll", query = "SELECT d FROM Detalleventa d"),
    @NamedQuery(name = "Detalleventa.findByCodigodetalleventa", query = "SELECT d FROM Detalleventa d WHERE d.detalleventaPK.codigodetalleventa = :codigodetalleventa"),
    @NamedQuery(name = "Detalleventa.findByCodigoproducto", query = "SELECT d FROM Detalleventa d WHERE d.detalleventaPK.codigoproducto = :codigoproducto"),
    @NamedQuery(name = "Detalleventa.findByCodigoproductosbodega", query = "SELECT d FROM Detalleventa d WHERE d.detalleventaPK.codigoproductosbodega = :codigoproductosbodega"),
    @NamedQuery(name = "Detalleventa.findByCodigosalidaproducto", query = "SELECT d FROM Detalleventa d WHERE d.detalleventaPK.codigosalidaproducto = :codigosalidaproducto"),
    @NamedQuery(name = "Detalleventa.findByCodigoproductotienda", query = "SELECT d FROM Detalleventa d WHERE d.detalleventaPK.codigoproductotienda = :codigoproductotienda"),
    @NamedQuery(name = "Detalleventa.findByCodigocliente", query = "SELECT d FROM Detalleventa d WHERE d.detalleventaPK.codigocliente = :codigocliente"),
    @NamedQuery(name = "Detalleventa.findByCodigoventa", query = "SELECT d FROM Detalleventa d WHERE d.detalleventaPK.codigoventa = :codigoventa"),
    @NamedQuery(name = "Detalleventa.findByCantidadproductoventa", query = "SELECT d FROM Detalleventa d WHERE d.cantidadproductoventa = :cantidadproductoventa")})
public class Detalleventa implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleventaPK detalleventaPK;
    @Column(name = "CANTIDADPRODUCTOVENTA")
    private Integer cantidadproductoventa;
    @JoinColumns({
        @JoinColumn(name = "CODIGOPRODUCTO", referencedColumnName = "CODIGOPRODUCTO", insertable = false, updatable = false),
        @JoinColumn(name = "CODIGOPRODUCTOSBODEGA", referencedColumnName = "CODIGOPRODUCTOSBODEGA", insertable = false, updatable = false),
        @JoinColumn(name = "CODIGOSALIDAPRODUCTO", referencedColumnName = "CODIGOSALIDAPRODUCTO", insertable = false, updatable = false),
        @JoinColumn(name = "CODIGOPRODUCTOTIENDA", referencedColumnName = "CODIGOPRODUCTOTIENDA", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Productostienda productostienda;
    @JoinColumns({
        @JoinColumn(name = "CODIGOCLIENTE", referencedColumnName = "CODIGOCLIENTE", insertable = false, updatable = false),
        @JoinColumn(name = "CODIGOVENTA", referencedColumnName = "CODIGOVENTA", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Venta venta;

    public Detalleventa() {
    }

    public Detalleventa(DetalleventaPK detalleventaPK) {
        this.detalleventaPK = detalleventaPK;
    }

    public Detalleventa(String codigodetalleventa, String codigoproducto, String codigoproductosbodega, String codigosalidaproducto, String codigoproductotienda, String codigocliente, String codigoventa) {
        this.detalleventaPK = new DetalleventaPK(codigodetalleventa, codigoproducto, codigoproductosbodega, codigosalidaproducto, codigoproductotienda, codigocliente, codigoventa);
    }

    public DetalleventaPK getDetalleventaPK() {
        return detalleventaPK;
    }

    public void setDetalleventaPK(DetalleventaPK detalleventaPK) {
        this.detalleventaPK = detalleventaPK;
    }

    public Integer getCantidadproductoventa() {
        return cantidadproductoventa;
    }

    public void setCantidadproductoventa(Integer cantidadproductoventa) {
        this.cantidadproductoventa = cantidadproductoventa;
    }

    public Productostienda getProductostienda() {
        return productostienda;
    }

    public void setProductostienda(Productostienda productostienda) {
        this.productostienda = productostienda;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleventaPK != null ? detalleventaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalleventa)) {
            return false;
        }
        Detalleventa other = (Detalleventa) object;
        if ((this.detalleventaPK == null && other.detalleventaPK != null) || (this.detalleventaPK != null && !this.detalleventaPK.equals(other.detalleventaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.Detalleventa[ detalleventaPK=" + detalleventaPK + " ]";
    }
    
}
