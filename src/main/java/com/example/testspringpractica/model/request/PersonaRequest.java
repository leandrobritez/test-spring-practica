/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.model.request;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author LBRITEZ
 */
public class PersonaRequest implements Serializable {

    private String nombre;
    private String apellido;
    private String password;
    private Date fechaCreacion;

    public PersonaRequest(String nombre, String apellido, String password, Date fechaCreacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.fechaCreacion = fechaCreacion;
    }

    public PersonaRequest() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "PersonaRequest{" + "nombre=" + nombre + ", apellido=" + apellido + ", password=" + password + ", fechaCreacion=" + fechaCreacion + '}';
    }

}
