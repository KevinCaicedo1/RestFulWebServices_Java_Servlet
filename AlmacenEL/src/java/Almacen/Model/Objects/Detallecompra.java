/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "detallecompra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallecompra.findAll", query = "SELECT d FROM Detallecompra d"),
    @NamedQuery(name = "Detallecompra.findByCodigodetallecompra", query = "SELECT d FROM Detallecompra d WHERE d.detallecompraPK.codigodetallecompra = :codigodetallecompra"),
    @NamedQuery(name = "Detallecompra.findByCodigoproducto", query = "SELECT d FROM Detallecompra d WHERE d.detallecompraPK.codigoproducto = :codigoproducto"),
    @NamedQuery(name = "Detallecompra.findByCodigoproductosbodega", query = "SELECT d FROM Detallecompra d WHERE d.detallecompraPK.codigoproductosbodega = :codigoproductosbodega"),
    @NamedQuery(name = "Detallecompra.findByCodigoproveedor", query = "SELECT d FROM Detallecompra d WHERE d.detallecompraPK.codigoproveedor = :codigoproveedor"),
    @NamedQuery(name = "Detallecompra.findByCodigocompra", query = "SELECT d FROM Detallecompra d WHERE d.detallecompraPK.codigocompra = :codigocompra"),
    @NamedQuery(name = "Detallecompra.findByCantidadcompraproducto", query = "SELECT d FROM Detallecompra d WHERE d.cantidadcompraproducto = :cantidadcompraproducto"),
    @NamedQuery(name = "Detallecompra.findByPrecioproductocompra", query = "SELECT d FROM Detallecompra d WHERE d.precioproductocompra = :precioproductocompra")})
public class Detallecompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallecompraPK detallecompraPK;
    @Column(name = "CANTIDADCOMPRAPRODUCTO")
    private Integer cantidadcompraproducto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIOPRODUCTOCOMPRA")
    private BigDecimal precioproductocompra;
    @JoinColumns({
        @JoinColumn(name = "CODIGOPROVEEDOR", referencedColumnName = "CODIGOPROVEEDOR", insertable = false, updatable = false),
        @JoinColumn(name = "CODIGOCOMPRA", referencedColumnName = "CODIGOCOMPRA", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Compra compra;
    @JoinColumns({
        @JoinColumn(name = "CODIGOPRODUCTO", referencedColumnName = "CODIGOPRODUCTO", insertable = false, updatable = false),
        @JoinColumn(name = "CODIGOPRODUCTOSBODEGA", referencedColumnName = "CODIGOPRODUCTOSBODEGA", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Productosbodega productosbodega;

    public Detallecompra() {
    }

    public Detallecompra(DetallecompraPK detallecompraPK) {
        this.detallecompraPK = detallecompraPK;
    }

    public Detallecompra(String codigodetallecompra, String codigoproducto, String codigoproductosbodega, String codigoproveedor, String codigocompra) {
        this.detallecompraPK = new DetallecompraPK(codigodetallecompra, codigoproducto, codigoproductosbodega, codigoproveedor, codigocompra);
    }

    public DetallecompraPK getDetallecompraPK() {
        return detallecompraPK;
    }

    public void setDetallecompraPK(DetallecompraPK detallecompraPK) {
        this.detallecompraPK = detallecompraPK;
    }

    public Integer getCantidadcompraproducto() {
        return cantidadcompraproducto;
    }

    public void setCantidadcompraproducto(Integer cantidadcompraproducto) {
        this.cantidadcompraproducto = cantidadcompraproducto;
    }

    public BigDecimal getPrecioproductocompra() {
        return precioproductocompra;
    }

    public void setPrecioproductocompra(BigDecimal precioproductocompra) {
        this.precioproductocompra = precioproductocompra;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Productosbodega getProductosbodega() {
        return productosbodega;
    }

    public void setProductosbodega(Productosbodega productosbodega) {
        this.productosbodega = productosbodega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallecompraPK != null ? detallecompraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallecompra)) {
            return false;
        }
        Detallecompra other = (Detallecompra) object;
        if ((this.detallecompraPK == null && other.detallecompraPK != null) || (this.detallecompraPK != null && !this.detallecompraPK.equals(other.detallecompraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.Detallecompra[ detallecompraPK=" + detallecompraPK + " ]";
    }
    
}
