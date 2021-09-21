/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByCodigoempleado", query = "SELECT e FROM Empleado e WHERE e.codigoempleado = :codigoempleado"),
    @NamedQuery(name = "Empleado.findByNombreempleado", query = "SELECT e FROM Empleado e WHERE e.nombreempleado = :nombreempleado"),
    @NamedQuery(name = "Empleado.findByCedulaempleado", query = "SELECT e FROM Empleado e WHERE e.cedulaempleado = :cedulaempleado"),
    @NamedQuery(name = "Empleado.findByFonoempleado", query = "SELECT e FROM Empleado e WHERE e.fonoempleado = :fonoempleado"),
    @NamedQuery(name = "Empleado.findByPorcentajecomisionempleado", query = "SELECT e FROM Empleado e WHERE e.porcentajecomisionempleado = :porcentajecomisionempleado"),
    @NamedQuery(name = "Empleado.findBySueldobaseempleado", query = "SELECT e FROM Empleado e WHERE e.sueldobaseempleado = :sueldobaseempleado")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "CODIGOEMPLEADO")
    private String codigoempleado;
    @Size(max = 32)
    @Column(name = "NOMBREEMPLEADO")
    private String nombreempleado;
    @Size(max = 10)
    @Column(name = "CEDULAEMPLEADO")
    private String cedulaempleado;
    @Size(max = 16)
    @Column(name = "FONOEMPLEADO")
    private String fonoempleado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJECOMISIONEMPLEADO")
    private BigDecimal porcentajecomisionempleado;
    @Column(name = "SUELDOBASEEMPLEADO")
    private BigDecimal sueldobaseempleado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoempleado")
    private Collection<Venta> ventaCollection;

    public Empleado() {
    }

    public Empleado(String codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    public String getCodigoempleado() {
        return codigoempleado;
    }

    public void setCodigoempleado(String codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    public String getNombreempleado() {
        return nombreempleado;
    }

    public void setNombreempleado(String nombreempleado) {
        this.nombreempleado = nombreempleado;
    }

    public String getCedulaempleado() {
        return cedulaempleado;
    }

    public void setCedulaempleado(String cedulaempleado) {
        this.cedulaempleado = cedulaempleado;
    }

    public String getFonoempleado() {
        return fonoempleado;
    }

    public void setFonoempleado(String fonoempleado) {
        this.fonoempleado = fonoempleado;
    }

    public BigDecimal getPorcentajecomisionempleado() {
        return porcentajecomisionempleado;
    }

    public void setPorcentajecomisionempleado(BigDecimal porcentajecomisionempleado) {
        this.porcentajecomisionempleado = porcentajecomisionempleado;
    }

    public BigDecimal getSueldobaseempleado() {
        return sueldobaseempleado;
    }

    public void setSueldobaseempleado(BigDecimal sueldobaseempleado) {
        this.sueldobaseempleado = sueldobaseempleado;
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
        hash += (codigoempleado != null ? codigoempleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.codigoempleado == null && other.codigoempleado != null) || (this.codigoempleado != null && !this.codigoempleado.equals(other.codigoempleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.Empleado[ codigoempleado=" + codigoempleado + " ]";
    }
    
}
