/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.model.response;

import com.example.testspringpractica.entity.Producto;
import com.example.testspringpractica.model.request.FacturaRequest;
import java.io.Serializable;

/**
 *
 * @author LBRITEZ
 */
public class FacturaDetalleResponse implements Serializable{
    private double montoTotal;
    private double precioUnitario;
    private int cantidad;
    private ProductoResponse productoResponse;

    public FacturaDetalleResponse(double montoTotal, double precioUnitario, int cantidad, FacturaRequest facturas, ProductoResponse productoResponse) {
        this.montoTotal = montoTotal;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.productoResponse = productoResponse;
    }

    public FacturaDetalleResponse() {
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


    public ProductoResponse getProductoResponse() {
        return productoResponse;
    }

    public void setProductoResponse(ProductoResponse productoResponse) {
        this.productoResponse = productoResponse;
    }
}
