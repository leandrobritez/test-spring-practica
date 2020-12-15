/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.model.request;

import com.example.testspringpractica.entity.Persona;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author LBRITEZ
 */
public class FacturaRequest implements Serializable {

    private Date fechaFactura;
    private String numeroFactura;
    private double montoTotal;
    private double montoFactuta5;
    private double montoFactura10;
    private Persona codigoPersona;
    private List<FacturaDetalleRequest> facturaDetalleList;

    public FacturaRequest(Date fechaFactura, String numeroFactura, double montoTotal, double montoFactuta5, double montoFactura10, Persona codigoPersona, List<FacturaDetalleRequest> facturaDetalleList) {
        this.fechaFactura = fechaFactura;
        this.numeroFactura = numeroFactura;
        this.montoTotal = montoTotal;
        this.montoFactuta5 = montoFactuta5;
        this.montoFactura10 = montoFactura10;
        this.codigoPersona = codigoPersona;
        this.facturaDetalleList = facturaDetalleList;
    }

    public FacturaRequest() {
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

    public Persona getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(Persona codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public List<FacturaDetalleRequest> getFacturaDetalleList() {
        return facturaDetalleList;
    }

    public void setFacturaDetalleList(List<FacturaDetalleRequest> facturaDetalleList) {
        this.facturaDetalleList = facturaDetalleList;
    }

}
