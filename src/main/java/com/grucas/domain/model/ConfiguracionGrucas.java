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
public class ConfiguracionGrucas {
    
    Integer id;
    String mes;
    Integer anio;
    Integer consecutivo_sd;

    public ConfiguracionGrucas() { 
        id = 0;
        mes = "";
        anio = 0;
        consecutivo_sd = 0;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getConsecutivo_sd() {
        return consecutivo_sd;
    }

    public void setConsecutivo_sd(Integer consecutivo) {
        this.consecutivo_sd = consecutivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}