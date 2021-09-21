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
public class VentaPK implements Serializable {

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

    public VentaPK() {
    }

    public VentaPK(String codigocliente, String codigoventa) {
        this.codigocliente = codigocliente;
        this.codigoventa = codigoventa;
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
        hash += (codigocliente != null ? codigocliente.hashCode() : 0);
        hash += (codigoventa != null ? codigoventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaPK)) {
            return false;
        }
        VentaPK other = (VentaPK) object;
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
        return "Almacen.Model.Objects.VentaPK[ codigocliente=" + codigocliente + ", codigoventa=" + codigoventa + " ]";
    }
    
}
