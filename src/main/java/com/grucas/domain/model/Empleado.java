/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import com.rubik.Base.ObjectBase;

/**
 *
 * @author GrucasDev
 */
public class Empleado extends ObjectBase{
    
    String clave_empleado;
    String nombre;
    String apellido_paterno;
    String apellido_materno;
    
    String email;
    Boolean autorizador;

    public Empleado() {
    }

    public Empleado(String clave_empleado, String nombre, String apellido_paterno, String apellido_materno, String email, Boolean autorizador) {
        this.clave_empleado = clave_empleado;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.email = email;
        this.autorizador = autorizador;
    }

    public String getClave_empleado() {
        return clave_empleado;
    }

    public void setClave_empleado(String clave_empleado) {
        this.clave_empleado = clave_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAutorizador() {
        return autorizador;
    }

    public void setAutorizador(Boolean autorizador) {
        this.autorizador = autorizador;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido_paterno + " " + apellido_materno;
    }
    
}