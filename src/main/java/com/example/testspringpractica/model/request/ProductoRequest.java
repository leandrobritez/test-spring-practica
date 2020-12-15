/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.model.request;

import java.io.Serializable;

/**
 *
 * @author LBRITEZ
 */
public class ProductoRequest implements Serializable {
    private String productoDescripcion;

    public ProductoRequest(String productoDescripcion) {
        this.productoDescripcion = productoDescripcion;
    }

    public ProductoRequest() {
    }

    public String getProductoDescripcion() {
        return productoDescripcion;
    }

    public void setProductoDescripcion(String productoDescripcion) {
        this.productoDescripcion = productoDescripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "productoDescripcion=" + productoDescripcion + '}';
    }
    
}
