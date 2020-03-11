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
public class AgenteAduanal extends ObjectBase {
    
    String nombre;
    String patente;

    public AgenteAduanal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
     @Override
    public String toString() {
        return patente + " " + nombre;
    }

}