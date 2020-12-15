/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.converter;

import com.example.testspringpractica.entity.FacturaDetalle;
import com.example.testspringpractica.model.response.FacturaDetalleResponse;
import com.example.testspringpractica.model.response.ProductoResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author LBRITEZ
 */
@Component
public class FacturaDetalleConverter {
    public FacturaDetalleResponse entityToModel(FacturaDetalle entity){
        FacturaDetalleResponse facturaDetalleResponse = new FacturaDetalleResponse();
        facturaDetalleResponse.setCantidad(entity.getCantidad());
        facturaDetalleResponse.setProductoResponse(new ProductoResponse(entity.getCodigoProducto().getCodigoProducto(),entity.getCodigoProducto().getProductoDescripcion()));
        facturaDetalleResponse.setMontoTotal(entity.getMontoTotal());
        facturaDetalleResponse.setPrecioUnitario(entity.getPrecioUnitario());
        return facturaDetalleResponse;
    }
    
    public List<FacturaDetalleResponse> entitisToModels(List<FacturaDetalle> entities){
        List<FacturaDetalleResponse> listFacturaDetalleResponse = new ArrayList();
        for (FacturaDetalle entity : entities) {
            listFacturaDetalleResponse.add(entityToModel(entity));
        }
        return listFacturaDetalleResponse;
    }
}
