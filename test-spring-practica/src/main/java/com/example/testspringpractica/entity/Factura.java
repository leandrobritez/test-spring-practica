/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LBRITEZ
 */
@Entity
@Table(name = "facturas")
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_factura")
    private Integer codigoFactura;
    @Basic(optional = false)
    @Column(name = "fecha_factura")
    @Temporal(TemporalType.DATE)
    private Date fechaFactura;
    @Basic(optional = false)
    @Column(name = "numero_factura")
    private String numeroFactura;
    @Basic(optional = false)
    @Column(name = "monto_total")
    private double montoTotal;
    @Basic(optional = false)
    @Column(name = "monto_factuta_5")
    private double montoFactuta5;
    @Basic(optional = false)
    @Column(name = "monto_factura_10")
    private double montoFactura10;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturas")
    private List<FacturaDetalle> facturadetalleList;
    @JoinColumn(name = "codigo_persona", referencedColumnName = "codigo_persona")
    @ManyToOne(optional = false)
    private Persona codigoPersona;

    public Factura() {
    }

    public Factura(Integer codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Factura(Integer codigoFactura, Date fechaFactura, String numeroFactura, double montoTotal, double montoFactuta5, double montoFactura10) {
        this.codigoFactura = codigoFactura;
        this.fechaFactura = fechaFactura;
        this.numeroFactura = numeroFactura;
        this.montoTotal = montoTotal;
        this.montoFactuta5 = montoFactuta5;
        this.montoFactura10 = montoFactura10;
    }

    public Integer getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(Integer codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getMontoFactuta5() {
        return montoFactuta5;
    }

    public void setMontoFactuta5(double montoFactuta5) {
        this.montoFactuta5 = montoFactuta5;
    }

    public double getMontoFactura10() {
        return montoFactura10;
    }

    public void setMontoFactura10(double montoFactura10) {
        this.montoFactura10 = montoFactura10;
    }

    @XmlTransient
    public List<FacturaDetalle> getFacturadetalleList() {
        return facturadetalleList;
    }

    public void setFacturadetalleList(List<FacturaDetalle> facturadetalleList) {
        this.facturadetalleList = facturadetalleList;
    }

    public Persona getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(Persona codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoFactura != null ? codigoFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.codigoFactura == null && other.codigoFactura != null) || (this.codigoFactura != null && !this.codigoFactura.equals(other.codigoFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.testspringpractica.entity.Facturas[ codigoFactura=" + codigoFactura + " ]";
    }
    
}
