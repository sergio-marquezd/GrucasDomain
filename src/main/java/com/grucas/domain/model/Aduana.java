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
public class Aduana extends ObjectBase {

    String no_aduana;
    String nombre;
    String tipo_aduana;
    Integer agente_id;
    String agente;
    String patente;
    Integer agente2_id;
    String agente2;
    String patente2;
    Integer agente3_id;
    String agente3;
    String patente3;
    
    Integer id_cliente_aduana;
    String contacto_nombre;
    String contacto_email;
    
    //unidad_id
    //cliente_id
    //activo

    public Aduana() {
        agente_id = 0;
        agente = "";
        patente = "";
        agente2_id = 0;
        agente2 = "";
        patente2 = "";
        agente3_id = 0;
        agente3 = "";
        patente3 = "";
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

    public Integer getAgente2_id() {
        return agente2_id;
    }

    public void setAgente2_id(Integer agente2_id) {
        this.agente2_id = agente2_id;
    }

    public String getAgente2() {
        return agente2;
    }

    public void setAgente2(String agente2) {
        this.agente2 = agente2;
    }

    public String getPatente2() {
        return patente2;
    }

    public void setPatente2(String patente2) {
        this.patente2 = patente2;
    }

    public Integer getAgente3_id() {
        return agente3_id;
    }

    public void setAgente3_id(Integer agente3_id) {
        this.agente3_id = agente3_id;
    }

    public String getAgente3() {
        return agente3;
    }

    public void setAgente3(String agente3) {
        this.agente3 = agente3;
    }

    public String getPatente3() {
        return patente3;
    }

    public void setPatente3(String patente3) {
        this.patente3 = patente3;
    }

    public String getTipo_aduana() {
        return tipo_aduana;
    }

    public void setTipo_aduana(String tipo_aduana) {
        this.tipo_aduana = tipo_aduana;
    }

    public Integer getId_cliente_aduana() {
        return id_cliente_aduana;
    }

    public void setId_cliente_aduana(Integer id_cliente_aduana) {
        this.id_cliente_aduana = id_cliente_aduana;
    }

    public String getContacto_nombre() {
        return contacto_nombre;
    }

    public void setContacto_nombre(String contacto_nombre) {
        this.contacto_nombre = contacto_nombre;
    }

    public String getContacto_email() {
        return contacto_email;
    }

    public void setContacto_email(String contacto_email) {
        this.contacto_email = contacto_email;
    }
    
    @Override
    public String toString() {
        return no_aduana + " " + nombre;
    }

}
