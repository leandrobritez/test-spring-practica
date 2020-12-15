/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author LBRITEZ
 */
@Embeddable
public class FacturadetallePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "codigo_factura_detalle")
    private int codigoFacturaDetalle;
    @Basic(optional = false)
    @Column(name = "codigo_factura")
    private int codigoFactura;

    public FacturadetallePK() {
    }

    public FacturadetallePK(int codigoFacturaDetalle, int codigoFactura) {
        this.codigoFacturaDetalle = codigoFacturaDetalle;
        this.codigoFactura = codigoFactura;
    }

    public int getCodigoFacturaDetalle() {
        return codigoFacturaDetalle;
    }

    public void setCodigoFacturaDetalle(int codigoFacturaDetalle) {
        this.codigoFacturaDetalle = codigoFacturaDetalle;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigoFacturaDetalle;
        hash += (int) codigoFactura;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturadetallePK)) {
            return false;
        }
        FacturadetallePK other = (FacturadetallePK) object;
        if (this.codigoFacturaDetalle != other.codigoFacturaDetalle) {
            return false;
        }
        if (this.codigoFactura != other.codigoFactura) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.testspringpractica.entity.FacturadetallePK[ codigoFacturaDetalle=" + codigoFacturaDetalle + ", codigoFactura=" + codigoFactura + " ]";
    }
    
}
