/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kevin Caicedo
 */
@Entity
@Table(name = "salidaproductos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salidaproductos.findAll", query = "SELECT s FROM Salidaproductos s"),
    @NamedQuery(name = "Salidaproductos.findByCodigoproducto", query = "SELECT s FROM Salidaproductos s WHERE s.salidaproductosPK.codigoproducto = :codigoproducto"),
    @NamedQuery(name = "Salidaproductos.findByCodigoproductosbodega", query = "SELECT s FROM Salidaproductos s WHERE s.salidaproductosPK.codigoproductosbodega = :codigoproductosbodega"),
    @NamedQuery(name = "Salidaproductos.findByCodigosalidaproducto", query = "SELECT s FROM Salidaproductos s WHERE s.salidaproductosPK.codigosalidaproducto = :codigosalidaproducto"),
    @NamedQuery(name = "Salidaproductos.findByFechasalidaproducto", query = "SELECT s FROM Salidaproductos s WHERE s.fechasalidaproducto = :fechasalidaproducto"),
    @NamedQuery(name = "Salidaproductos.findByCantidadsalidaproducto", query = "SELECT s FROM Salidaproductos s WHERE s.cantidadsalidaproducto = :cantidadsalidaproducto")})
public class Salidaproductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalidaproductosPK salidaproductosPK;
    @Column(name = "FECHASALIDAPRODUCTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechasalidaproducto;
    @Column(name = "CANTIDADSALIDAPRODUCTO")
    private Integer cantidadsalidaproducto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salidaproductos")
    private Collection<Productostienda> productostiendaCollection;
    @JoinColumns({
        @JoinColumn(name = "CODIGOPRODUCTO", referencedColumnName = "CODIGOPRODUCTO", insertable = false, updatable = false),
        @JoinColumn(name = "CODIGOPRODUCTOSBODEGA", referencedColumnName = "CODIGOPRODUCTOSBODEGA", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Productosbodega productosbodega;

    public Salidaproductos() {
    }

    public Salidaproductos(SalidaproductosPK salidaproductosPK) {
        this.salidaproductosPK = salidaproductosPK;
    }

    public Salidaproductos(String codigoproducto, String codigoproductosbodega, String codigosalidaproducto) {
        this.salidaproductosPK = new SalidaproductosPK(codigoproducto, codigoproductosbodega, codigosalidaproducto);
    }

    public SalidaproductosPK getSalidaproductosPK() {
        return salidaproductosPK;
    }

    public void setSalidaproductosPK(SalidaproductosPK salidaproductosPK) {
        this.salidaproductosPK = salidaproductosPK;
    }

    public Date getFechasalidaproducto() {
        return fechasalidaproducto;
    }

    public void setFechasalidaproducto(Date fechasalidaproducto) {
        this.fechasalidaproducto = fechasalidaproducto;
    }

    public Integer getCantidadsalidaproducto() {
        return cantidadsalidaproducto;
    }

    public void setCantidadsalidaproducto(Integer cantidadsalidaproducto) {
        this.cantidadsalidaproducto = cantidadsalidaproducto;
    }

    @XmlTransient
    public Collection<Productostienda> getProductostiendaCollection() {
        return productostiendaCollection;
    }

    public void setProductostiendaCollection(Collection<Productostienda> productostiendaCollection) {
        this.productostiendaCollection = productostiendaCollection;
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
        hash += (salidaproductosPK != null ? salidaproductosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salidaproductos)) {
            return false;
        }
        Salidaproductos other = (Salidaproductos) object;
        if ((this.salidaproductosPK == null && other.salidaproductosPK != null) || (this.salidaproductosPK != null && !this.salidaproductosPK.equals(other.salidaproductosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.Salidaproductos[ salidaproductosPK=" + salidaproductosPK + " ]";
    }
    
}
