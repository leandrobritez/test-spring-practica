/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.service;

import com.example.testspringpractica.converter.FacturaConverter;
import com.example.testspringpractica.entity.Factura;
import com.example.testspringpractica.model.response.FacturaResponse;
import com.example.testspringpractica.repository.FacturaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LBRITEZ
 */
@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;
    
    @Autowired
    private FacturaConverter facturaConverter;

    @Override
    public List<FacturaResponse> gellAllFactura() {
        Iterable<Factura> invoice = facturaRepository.findAll();   
        return facturaConverter.entitiesToModels((List<Factura>) invoice);
        
    }

}
