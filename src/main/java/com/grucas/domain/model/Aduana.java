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
public class Aduana extends ObjectBase{
    
    String no_aduana;
    String nombre;
    Integer agente_id;
    String agente;
    String patente;

    public Aduana() {
    }

    public String getNo_aduana() {
        return no_aduana;
    }

    public void setNo_aduana(String no_aduana) {
        this.no_aduana = no_aduana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAgente_id() {
        return agente_id;
    }

    public void setAgente_id(Integer agente_id) {
        this.agente_id = agente_id;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Aduana: " + no_aduana;
    }
    
}