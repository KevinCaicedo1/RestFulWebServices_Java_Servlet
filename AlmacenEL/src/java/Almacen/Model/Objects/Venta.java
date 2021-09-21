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
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v"),
    @NamedQuery(name = "Venta.findByCodigocliente", query = "SELECT v FROM Venta v WHERE v.ventaPK.codigocliente = :codigocliente"),
    @NamedQuery(name = "Venta.findByCodigoventa", query = "SELECT v FROM Venta v WHERE v.ventaPK.codigoventa = :codigoventa"),
    @NamedQuery(name = "Venta.findByFechaventa", query = "SELECT v FROM Venta v WHERE v.fechaventa = :fechaventa"),
    @NamedQuery(name = "Venta.findByTotalventa", query = "SELECT v FROM Venta v WHERE v.totalventa = :totalventa"),
    @NamedQuery(name = "Venta.findByImpuestoventa", query = "SELECT v FROM Venta v WHERE v.impuestoventa = :impuestoventa"),
    @NamedQuery(name = "Venta.findByDescuentoventa", query = "SELECT v FROM Venta v WHERE v.descuentoventa = :descuentoventa")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VentaPK ventaPK;
    @Column(name = "FECHAVENTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaventa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTALVENTA")
    private BigDecimal totalventa;
    @Column(name = "IMPUESTOVENTA")
    private BigDecimal impuestoventa;
    @Column(name = "DESCUENTOVENTA")
    private BigDecimal descuentoventa;
    @JoinColumn(name = "CODIGOCLIENTE", referencedColumnName = "CODIGOCLIENTE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(name = "CODIGOEMPLEADO", referencedColumnName = "CODIGOEMPLEADO")
    @ManyToOne(optional = false)
    private Empleado codigoempleado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "venta")
    private Collection<Detalleventa> detalleventaCollection;

    public Venta() {
    }

    public Venta(VentaPK ventaPK) {
        this.ventaPK = ventaPK;
    }

    public Venta(String codigocliente, String codigoventa) {
        this.ventaPK = new VentaPK(codigocliente, codigoventa);
    }

    public VentaPK getVentaPK() {
        return ventaPK;
    }

    public void setVentaPK(VentaPK ventaPK) {
        this.ventaPK = ventaPK;
    }

    public Date getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    public BigDecimal getTotalventa() {
        return totalventa;
    }

    public void setTotalventa(BigDecimal totalventa) {
        this.totalventa = totalventa;
    }

    public BigDecimal getImpuestoventa() {
        return impuestoventa;
    }

    public void setImpuestoventa(BigDecimal impuestoventa) {
        this.impuestoventa = impuestoventa;
    }

    public BigDecimal getDescuentoventa() {
        return descuentoventa;
    }

    public void setDescuentoventa(BigDecimal descuentoventa) {
        this.descuentoventa = descuentoventa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getCodigoempleado() {
        return codigoempleado;
    }

    public void setCodigoempleado(Empleado codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    @XmlTransient
    public Collection<Detalleventa> getDetalleventaCollection() {
        return detalleventaCollection;
    }

    public void setDetalleventaCollection(Collection<Detalleventa> detalleventaCollection) {
        this.detalleventaCollection = detalleventaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ventaPK != null ? ventaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.ventaPK == null && other.ventaPK != null) || (this.ventaPK != null && !this.ventaPK.equals(other.ventaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.Venta[ ventaPK=" + ventaPK + " ]";
    }
    
}
