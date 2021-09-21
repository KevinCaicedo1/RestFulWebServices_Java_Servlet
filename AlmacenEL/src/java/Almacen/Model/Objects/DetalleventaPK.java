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
public class DetalleventaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGODETALLEVENTA")
    private String codigodetalleventa;
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
    @Column(name = "CODIGOSALIDAPRODUCTO")
    private String codigosalidaproducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGOPRODUCTOTIENDA")
    private String codigoproductotienda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGOCLIENTE")
    private String codigocliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGOVENTA")
    private String codigoventa;

    public DetalleventaPK() {
    }

    public DetalleventaPK(String codigodetalleventa, String codigoproducto, String codigoproductosbodega, String codigosalidaproducto, String codigoproductotienda, String codigocliente, String codigoventa) {
        this.codigodetalleventa = codigodetalleventa;
        this.codigoproducto = codigoproducto;
        this.codigoproductosbodega = codigoproductosbodega;
        this.codigosalidaproducto = codigosalidaproducto;
        this.codigoproductotienda = codigoproductotienda;
        this.codigocliente = codigocliente;
        this.codigoventa = codigoventa;
    }

    public String getCodigodetalleventa() {
        return codigodetalleventa;
    }

    public void setCodigodetalleventa(String codigodetalleventa) {
        this.codigodetalleventa = codigodetalleventa;
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

    public String getCodigosalidaproducto() {
        return codigosalidaproducto;
    }

    public void setCodigosalidaproducto(String codigosalidaproducto) {
        this.codigosalidaproducto = codigosalidaproducto;
    }

    public String getCodigoproductotienda() {
        return codigoproductotienda;
    }

    public void setCodigoproductotienda(String codigoproductotienda) {
        this.codigoproductotienda = codigoproductotienda;
    }

    public String getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }

    public String getCodigoventa() {
        return codigoventa;
    }

    public void setCodigoventa(String codigoventa) {
        this.codigoventa = codigoventa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigodetalleventa != null ? codigodetalleventa.hashCode() : 0);
        hash += (codigoproducto != null ? codigoproducto.hashCode() : 0);
        hash += (codigoproductosbodega != null ? codigoproductosbodega.hashCode() : 0);
        hash += (codigosalidaproducto != null ? codigosalidaproducto.hashCode() : 0);
        hash += (codigoproductotienda != null ? codigoproductotienda.hashCode() : 0);
        hash += (codigocliente != null ? codigocliente.hashCode() : 0);
        hash += (codigoventa != null ? codigoventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleventaPK)) {
            return false;
        }
        DetalleventaPK other = (DetalleventaPK) object;
        if ((this.codigodetalleventa == null && other.codigodetalleventa != null) || (this.codigodetalleventa != null && !this.codigodetalleventa.equals(other.codigodetalleventa))) {
            return false;
        }
        if ((this.codigoproducto == null && other.codigoproducto != null) || (this.codigoproducto != null && !this.codigoproducto.equals(other.codigoproducto))) {
            return false;
        }
        if ((this.codigoproductosbodega == null && other.codigoproductosbodega != null) || (this.codigoproductosbodega != null && !this.codigoproductosbodega.equals(other.codigoproductosbodega))) {
            return false;
        }
        if ((this.codigosalidaproducto == null && other.codigosalidaproducto != null) || (this.codigosalidaproducto != null && !this.codigosalidaproducto.equals(other.codigosalidaproducto))) {
            return false;
        }
        if ((this.codigoproductotienda == null && other.codigoproductotienda != null) || (this.codigoproductotienda != null && !this.codigoproductotienda.equals(other.codigoproductotienda))) {
            return false;
        }
        if ((this.codigocliente == null && other.codigocliente != null) || (this.codigocliente != null && !this.codigocliente.equals(other.codigocliente))) {
            return false;
        }
        if ((this.codigoventa == null && other.codigoventa != null) || (this.codigoventa != null && !this.codigoventa.equals(other.codigoventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.DetalleventaPK[ codigodetalleventa=" + codigodetalleventa + ", codigoproducto=" + codigoproducto + ", codigoproductosbodega=" + codigoproductosbodega + ", codigosalidaproducto=" + codigosalidaproducto + ", codigoproductotienda=" + codigoproductotienda + ", codigocliente=" + codigocliente + ", codigoventa=" + codigoventa + " ]";
    }
    
}
