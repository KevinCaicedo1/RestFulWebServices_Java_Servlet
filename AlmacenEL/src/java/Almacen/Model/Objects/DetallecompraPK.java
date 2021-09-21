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
public class DetallecompraPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGODETALLECOMPRA")
    private String codigodetallecompra;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGOPROVEEDOR")
    private String codigoproveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGOCOMPRA")
    private String codigocompra;

    public DetallecompraPK() {
    }

    public DetallecompraPK(String codigodetallecompra, String codigoproducto, String codigoproductosbodega, String codigoproveedor, String codigocompra) {
        this.codigodetallecompra = codigodetallecompra;
        this.codigoproducto = codigoproducto;
        this.codigoproductosbodega = codigoproductosbodega;
        this.codigoproveedor = codigoproveedor;
        this.codigocompra = codigocompra;
    }

    public String getCodigodetallecompra() {
        return codigodetallecompra;
    }

    public void setCodigodetallecompra(String codigodetallecompra) {
        this.codigodetallecompra = codigodetallecompra;
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

    public String getCodigoproveedor() {
        return codigoproveedor;
    }

    public void setCodigoproveedor(String codigoproveedor) {
        this.codigoproveedor = codigoproveedor;
    }

    public String getCodigocompra() {
        return codigocompra;
    }

    public void setCodigocompra(String codigocompra) {
        this.codigocompra = codigocompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigodetallecompra != null ? codigodetallecompra.hashCode() : 0);
        hash += (codigoproducto != null ? codigoproducto.hashCode() : 0);
        hash += (codigoproductosbodega != null ? codigoproductosbodega.hashCode() : 0);
        hash += (codigoproveedor != null ? codigoproveedor.hashCode() : 0);
        hash += (codigocompra != null ? codigocompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallecompraPK)) {
            return false;
        }
        DetallecompraPK other = (DetallecompraPK) object;
        if ((this.codigodetallecompra == null && other.codigodetallecompra != null) || (this.codigodetallecompra != null && !this.codigodetallecompra.equals(other.codigodetallecompra))) {
            return false;
        }
        if ((this.codigoproducto == null && other.codigoproducto != null) || (this.codigoproducto != null && !this.codigoproducto.equals(other.codigoproducto))) {
            return false;
        }
        if ((this.codigoproductosbodega == null && other.codigoproductosbodega != null) || (this.codigoproductosbodega != null && !this.codigoproductosbodega.equals(other.codigoproductosbodega))) {
            return false;
        }
        if ((this.codigoproveedor == null && other.codigoproveedor != null) || (this.codigoproveedor != null && !this.codigoproveedor.equals(other.codigoproveedor))) {
            return false;
        }
        if ((this.codigocompra == null && other.codigocompra != null) || (this.codigocompra != null && !this.codigocompra.equals(other.codigocompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.DetallecompraPK[ codigodetallecompra=" + codigodetallecompra + ", codigoproducto=" + codigoproducto + ", codigoproductosbodega=" + codigoproductosbodega + ", codigoproveedor=" + codigoproveedor + ", codigocompra=" + codigocompra + " ]";
    }
    
}
