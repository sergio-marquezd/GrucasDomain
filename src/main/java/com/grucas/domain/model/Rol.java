/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

/**
 *
 * @author GrucasDev
 */
public class Rol {
    
    Integer id;
    Integer sistema_id;
    String nombre;

    public Rol() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSistema_id() {
        return sistema_id;
    }

    public void setSistema_id(Integer sistema_id) {
        this.sistema_id = sistema_id;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}