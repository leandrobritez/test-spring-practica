/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.service;

import com.example.testspringpractica.converter.PersonaConverter;
import com.example.testspringpractica.entity.Persona;
import com.example.testspringpractica.model.response.PersonaResponse;
import com.example.testspringpractica.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LBRITEZ
 */
@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    
    @Autowired PersonaConverter personaConverter;
    
    
    @Override
    public List<PersonaResponse> getAll() {
        Iterable<Persona> people = personaRepository.findAll();
        return personaConverter.entitiesToModels((List<Persona>) people);
    }

    @Override
    public PersonaResponse getById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonaResponse updateById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
