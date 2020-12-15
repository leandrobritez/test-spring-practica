/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.model.request;

import com.example.testspringpractica.entity.Producto;
import java.io.Serializable;

/**
 *
 * @author LBRITEZ
 */
public class FacturaDetalleRequest implements Serializable {

    private double montoTotal;
    private double precioUnitario;
    private int cantidad;

    private FacturaRequest facturas;
    private Producto codigoProducto;

    public FacturaDetalleRequest(double montoTotal, double precioUnitario, int cantidad, FacturaRequest facturas, Producto codigoProducto) {
        this.montoTotal = montoTotal;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.facturas = facturas;
        this.codigoProducto = codigoProducto;
    }

    public FacturaDetalleRequest() {
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

    public FacturaRequest getFacturas() {
        return facturas;
    }

    public void setFacturas(FacturaRequest facturas) {
        this.facturas = facturas;
    }

    public Producto getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Producto codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

}
