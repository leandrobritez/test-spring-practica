/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.converter;

import com.example.testspringpractica.entity.Persona;
import com.example.testspringpractica.model.response.PersonaResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LBRITEZ
 */
public class PersonaConverter {
    
    public PersonaResponse entityToModel(Persona entity){
        PersonaResponse personaResponse = new PersonaResponse();
        personaResponse.setNombre(entity.getNombre());
        personaResponse.setApellido(entity.getApellido());
        personaResponse.setUsuarioLogin(entity.getUsuarioLogin());        
        return personaResponse;
    }
    
    public List<PersonaResponse> entitiesToModels(List<Persona> entities){
        List<PersonaResponse> personaResponseList = new ArrayList();
        for (Persona entity : entities) {
            personaResponseList.add(entityToModel(entity));
        }
        return personaResponseList;
    }
    
}
