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
public class TiendaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGOCIUDAD")
    private String codigociudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODIGOTIENDA")
    private String codigotienda;

    public TiendaPK() {
    }

    public TiendaPK(String codigociudad, String codigotienda) {
        this.codigociudad = codigociudad;
        this.codigotienda = codigotienda;
    }

    public String getCodigociudad() {
        return codigociudad;
    }

    public void setCodigociudad(String codigociudad) {
        this.codigociudad = codigociudad;
    }

    public String getCodigotienda() {
        return codigotienda;
    }

    public void setCodigotienda(String codigotienda) {
        this.codigotienda = codigotienda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigociudad != null ? codigociudad.hashCode() : 0);
        hash += (codigotienda != null ? codigotienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiendaPK)) {
            return false;
        }
        TiendaPK other = (TiendaPK) object;
        if ((this.codigociudad == null && other.codigociudad != null) || (this.codigociudad != null && !this.codigociudad.equals(other.codigociudad))) {
            return false;
        }
        if ((this.codigotienda == null && other.codigotienda != null) || (this.codigotienda != null && !this.codigotienda.equals(other.codigotienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen.Model.Objects.TiendaPK[ codigociudad=" + codigociudad + ", codigotienda=" + codigotienda + " ]";
    }
    
}
