/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.model.response;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author LBRITEZ
 */
public class PersonaResponse implements Serializable{
    private Integer codigoPersona;
    private String nombre;
    private String apellido;
    private String password;
    private Date fechaCreacion;
    private String usuarioLogin;

    public PersonaResponse() {
    }

    public PersonaResponse(Integer codigoPersona, String nombre, String apellido, String password, Date fechaCreacion, String usuarioLogin) {
        this.codigoPersona = codigoPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.fechaCreacion = fechaCreacion;
        this.usuarioLogin = usuarioLogin;
    }

    public Integer getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(Integer codigoPersona) {
        this.codigoPersona = codigoPersona;
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

    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public void getCodigoPersona(Integer codigoPersona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
