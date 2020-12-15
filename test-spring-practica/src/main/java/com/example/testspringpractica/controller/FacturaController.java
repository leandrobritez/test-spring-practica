/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.controller;

import com.example.testspringpractica.model.response.FacturaResponse;
import com.example.testspringpractica.service.FacturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LBRITEZ
 */
@RestController
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private FacturaService serviceFactura;

    @GetMapping(value = "/viewall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllFactura() {
        try {
            List<FacturaResponse> response = serviceFactura.gellAllFactura();
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
        }
        return null;
    }
}
