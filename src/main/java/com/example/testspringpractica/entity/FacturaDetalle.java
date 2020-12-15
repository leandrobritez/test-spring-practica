/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LBRITEZ
 */
@Entity
@Table(name = "facturadetalle")
public class FacturaDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacturadetallePK facturadetallePK;
    @Basic(optional = false)
    @Column(name = "monto_total")
    private double montoTotal;
    @Basic(optional = false)
    @Column(name = "precio_unitario")
    private double precioUnitario;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @JoinColumn(name = "codigo_factura", referencedColumnName = "codigo_factura", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Factura facturas;
    @JoinColumn(name = "codigo_producto", referencedColumnName = "codigo_producto")
    @ManyToOne(optional = false)
    private Producto codigoProducto;

    public FacturaDetalle() {
    }

    public FacturaDetalle(FacturadetallePK facturadetallePK) {
        this.facturadetallePK = facturadetallePK;
    }

    public FacturaDetalle(FacturadetallePK facturadetallePK, double montoTotal, double precioUnitario, int cantidad) {
        this.facturadetallePK = facturadetallePK;
        this.montoTotal = montoTotal;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public FacturaDetalle(int codigoFacturaDetalle, int codigoFactura) {
        this.facturadetallePK = new FacturadetallePK(codigoFacturaDetalle, codigoFactura);
    }

    public FacturadetallePK getFacturadetallePK() {
        return facturadetallePK;
    }

    public void setFacturadetallePK(FacturadetallePK facturadetallePK) {
        this.facturadetallePK = facturadetallePK;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Factura getFacturas() {
        return facturas;
    }

    public void setFacturas(Factura facturas) {
        this.facturas = facturas;
    }

    public Producto getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Producto codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facturadetallePK != null ? facturadetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaDetalle)) {
            return false;
        }
        FacturaDetalle other = (FacturaDetalle) object;
        if ((this.facturadetallePK == null && other.facturadetallePK != null) || (this.facturadetallePK != null && !this.facturadetallePK.equals(other.facturadetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.testspringpractica.entity.Facturadetalle[ facturadetallePK=" + facturadetallePK + " ]";
    }
    
}
