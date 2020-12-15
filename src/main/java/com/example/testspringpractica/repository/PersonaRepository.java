/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.repository;

import com.example.testspringpractica.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LBRITEZ
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {
//    @Override
//    @Query
//    List<Persona> findAll();
}
