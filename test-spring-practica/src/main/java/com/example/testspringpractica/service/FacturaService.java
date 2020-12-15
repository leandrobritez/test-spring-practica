/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.service;

import com.example.testspringpractica.model.response.FacturaResponse;
import java.util.List;

/**
 *
 * @author LBRITEZ
 */
public interface FacturaService {
    public List<FacturaResponse> gellAllFactura();
}
