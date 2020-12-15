/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.converter;

import com.example.testspringpractica.entity.Producto;
import com.example.testspringpractica.model.response.ProductoResponse;
import org.springframework.stereotype.Component;

/**
 *
 * @author LBRITEZ
 */
@Component
public class ProductoConverter {
    public ProductoResponse entityToModel(Producto entity){
        ProductoResponse productoResponse = new ProductoResponse();
        productoResponse.setCodigoProducto(entity.getCodigoProducto());
        productoResponse.setProductoDescripcion(entity.getProductoDescripcion());
        return productoResponse;
    }
}
