/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Model.Objects;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Kevin Caicedo
 */
@Embeddable
public class ProductosbodegaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGOPRODUCTO")
    private String codigoproducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGOPRODUCTOSBODEGA")
    private String codigoproductosbodega;

    public ProductosbodegaPK() {
    }

    public ProductosbodegaPK(String codigoproducto, String codigoproductosbodega) {
        this.codigoproducto = codigoproducto;
        this.codigoproductosbodega = codigoproductosbodega;
    }

    public String getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(String codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public String getCodigoproductosbodega() {
        return codigoproductosbodega;
    }

    public void setCodigoproductosbodega(String codigoproductosbodega) {
        this.codigoproductosbodega = codigoproductosbodega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoproducto != null ? codigoproducto.hashCode() : 0);
        hash += (codigoproductosbodega != null ? codigoproductosbodega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductosbodegaPK)) {
            return false;
        }
        ProductosbodegaPK other = (ProductosbodegaPK) object;
        if ((this.codigoproducto == null && other.codigoproducto != null) || (this.codigoproducto != null && !this.codigoproducto.equals(other.codigoproducto))) {
            return false;
        }
        if ((this.codigoproductosbodega == null && other.codigoproductosbodega != null) || (this.codigoproductosbodega != null && !this.codigoproductosbodega.equals(other.codigoproductosbodega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.ProductosbodegaPK[ codigoproducto=" + codigoproducto + ", codigoproductosbodega=" + codigoproductosbodega + " ]";
    }
    
}
