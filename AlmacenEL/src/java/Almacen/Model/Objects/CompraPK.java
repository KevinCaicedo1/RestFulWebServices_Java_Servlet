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
public class CompraPK implements Serializable {

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

    public CompraPK() {
    }

    public CompraPK(String codigoproveedor, String codigocompra) {
        this.codigoproveedor = codigoproveedor;
        this.codigocompra = codigocompra;
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
        hash += (codigoproveedor != null ? codigoproveedor.hashCode() : 0);
        hash += (codigocompra != null ? codigocompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompraPK)) {
            return false;
        }
        CompraPK other = (CompraPK) object;
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
        return "Almacen.Model.Objects.CompraPK[ codigoproveedor=" + codigoproveedor + ", codigocompra=" + codigocompra + " ]";
    }
    
}
