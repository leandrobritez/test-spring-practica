/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.model.response;

/**
 *
 * @author LBRITEZ
 */
public class ProductoResponse {
    private Integer codigoProducto;
    private String productoDescripcion;

    public ProductoResponse() {
    }

    public ProductoResponse(Integer codigoProducto, String productoDescripcion) {
        this.codigoProducto = codigoProducto;
        this.productoDescripcion = productoDescripcion;
    }

    public Integer getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getProductoDescripcion() {
        return productoDescripcion;
    }

    public void setProductoDescripcion(String productoDescripcion) {
        this.productoDescripcion = productoDescripcion;
    }
    
}
