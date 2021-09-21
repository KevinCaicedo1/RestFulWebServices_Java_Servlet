/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kevin Caicedo
 */
@Entity
@Table(name = "tienda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tienda.findAll", query = "SELECT t FROM Tienda t"),
    @NamedQuery(name = "Tienda.findByCodigociudad", query = "SELECT t FROM Tienda t WHERE t.tiendaPK.codigociudad = :codigociudad"),
    @NamedQuery(name = "Tienda.findByCodigotienda", query = "SELECT t FROM Tienda t WHERE t.tiendaPK.codigotienda = :codigotienda"),
    @NamedQuery(name = "Tienda.findByNombretienda", query = "SELECT t FROM Tienda t WHERE t.nombretienda = :nombretienda"),
    @NamedQuery(name = "Tienda.findByDirecciontienda", query = "SELECT t FROM Tienda t WHERE t.direcciontienda = :direcciontienda"),
    @NamedQuery(name = "Tienda.findByFonotienda", query = "SELECT t FROM Tienda t WHERE t.fonotienda = :fonotienda")})
public class Tienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TiendaPK tiendaPK;
    @Size(max = 32)
    @Column(name = "NOMBRETIENDA")
    private String nombretienda;
    @Size(max = 32)
    @Column(name = "DIRECCIONTIENDA")
    private String direcciontienda;
    @Size(max = 16)
    @Column(name = "FONOTIENDA")
    private String fonotienda;
    @JoinColumn(name = "CODIGOCIUDAD", referencedColumnName = "CODIGOCIUDAD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ciudad ciudad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tienda")
    private Collection<Productostienda> productostiendaCollection;

    public Tienda() {
    }

    public Tienda(TiendaPK tiendaPK) {
        this.tiendaPK = tiendaPK;
    }

    public Tienda(String codigociudad, String codigotienda) {
        this.tiendaPK = new TiendaPK(codigociudad, codigotienda);
    }

    public TiendaPK getTiendaPK() {
        return tiendaPK;
    }

    public void setTiendaPK(TiendaPK tiendaPK) {
        this.tiendaPK = tiendaPK;
    }

    public String getNombretienda() {
        return nombretienda;
    }

    public void setNombretienda(String nombretienda) {
        this.nombretienda = nombretienda;
    }

    public String getDirecciontienda() {
        return direcciontienda;
    }

    public void setDirecciontienda(String direcciontienda) {
        this.direcciontienda = direcciontienda;
    }

    public String getFonotienda() {
        return fonotienda;
    }

    public void setFonotienda(String fonotienda) {
        this.fonotienda = fonotienda;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @XmlTransient
    public Collection<Productostienda> getProductostiendaCollection() {
        return productostiendaCollection;
    }

    public void setProductostiendaCollection(Collection<Productostienda> productostiendaCollection) {
        this.productostiendaCollection = productostiendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tiendaPK != null ? tiendaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tienda)) {
            return false;
        }
        Tienda other = (Tienda) object;
        if ((this.tiendaPK == null && other.tiendaPK != null) || (this.tiendaPK != null && !this.tiendaPK.equals(other.tiendaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.Tienda[ tiendaPK=" + tiendaPK + " ]";
    }
    
}
