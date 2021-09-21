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
@Table(name = "bodega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bodega.findAll", query = "SELECT b FROM Bodega b"),
    @NamedQuery(name = "Bodega.findByCodigobodega", query = "SELECT b FROM Bodega b WHERE b.codigobodega = :codigobodega"),
    @NamedQuery(name = "Bodega.findByNombrebodega", query = "SELECT b FROM Bodega b WHERE b.nombrebodega = :nombrebodega"),
    @NamedQuery(name = "Bodega.findByDireccionbodega", query = "SELECT b FROM Bodega b WHERE b.direccionbodega = :direccionbodega"),
    @NamedQuery(name = "Bodega.findByFonobodega", query = "SELECT b FROM Bodega b WHERE b.fonobodega = :fonobodega")})
public class Bodega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "CODIGOBODEGA")
    private String codigobodega;
    @Size(max = 16)
    @Column(name = "NOMBREBODEGA")
    private String nombrebodega;
    @Size(max = 32)
    @Column(name = "DIRECCIONBODEGA")
    private String direccionbodega;
    @Size(max = 16)
    @Column(name = "FONOBODEGA")
    private String fonobodega;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigobodega")
    private Collection<Productosbodega> productosbodegaCollection;

    public Bodega() {
    }

    public Bodega(String codigobodega) {
        this.codigobodega = codigobodega;
    }

    public String getCodigobodega() {
        return codigobodega;
    }

    public void setCodigobodega(String codigobodega) {
        this.codigobodega = codigobodega;
    }

    public String getNombrebodega() {
        return nombrebodega;
    }

    public void setNombrebodega(String nombrebodega) {
        this.nombrebodega = nombrebodega;
    }

    public String getDireccionbodega() {
        return direccionbodega;
    }

    public void setDireccionbodega(String direccionbodega) {
        this.direccionbodega = direccionbodega;
    }

    public String getFonobodega() {
        return fonobodega;
    }

    public void setFonobodega(String fonobodega) {
        this.fonobodega = fonobodega;
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
        hash += (codigobodega != null ? codigobodega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bodega)) {
            return false;
        }
        Bodega other = (Bodega) object;
        if ((this.codigobodega == null && other.codigobodega != null) || (this.codigobodega != null && !this.codigobodega.equals(other.codigobodega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bodega{" + "nombrebodega=" + nombrebodega + ", direccionbodega=" + direccionbodega + ", fonobodega=" + fonobodega + '}';
    }

   

    
    
}
