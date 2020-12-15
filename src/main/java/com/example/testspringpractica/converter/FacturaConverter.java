/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.converter;

import com.example.testspringpractica.entity.Factura;
import com.example.testspringpractica.model.response.FacturaResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author LBRIT EZ
 */
@Component
public class FacturaConverter {
    @Autowired 
    private FacturaDetalleConverter facturaDetalleConverter;
    public FacturaResponse entityToModel(Factura entity) {
        FacturaResponse facturaResponse = new FacturaResponse();
        facturaResponse.setCodigoPersona(entity.getCodigoPersona());
        facturaResponse.setFacturaDetalleList(facturaDetalleConverter.entitisToModels(entity.getFacturadetalleList()));
        facturaResponse.setFechaFactura(entity.getFechaFactura());
        facturaResponse.setMontoTotal(entity.getMontoTotal());
        facturaResponse.setMontoFactura10(entity.getMontoFactura10());
        facturaResponse.setMontoFactuta5(entity.getMontoFactuta5());
        return facturaResponse;
    }
    
    public List<FacturaResponse> entitiesToModels(List<Factura> entities){
        List<FacturaResponse> facturaResponseList = new ArrayList();
        for (Factura entity : entities) {
            facturaResponseList.add(entityToModel(entity));
        }
        return facturaResponseList;
    }
}
