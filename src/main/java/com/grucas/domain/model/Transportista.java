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
public class Transportista extends ObjectBase {

    String nombre;

    public Transportista(String nombre) {
        this.nombre = nombre;
    }
    
    public Transportista() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}