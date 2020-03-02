/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import com.rubik.Base.ObjectBase;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author GrucasDev
 */
public class ContenedorOperaciones extends ObjectBase {
    String folio;
    LocalDateTime hora_llegadaBuque;
    LocalDateTime hora_salidaBuque;
    Boolean modificacion_plan;
    Date fecha_modificacionPlan;
    Integer numero_modificaciones;
    
    
    public ContenedorOperaciones(){
        folio = "";
        hora_llegadaBuque=null;
        hora_salidaBuque=null;
        modificacion_plan=false;
        fecha_modificacionPlan=null;
        numero_modificaciones =0;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public LocalDateTime getHora_llegadaBuque() {
        return hora_llegadaBuque;
    }

    public void setHora_llegadaBuque(LocalDateTime hora_llegadaBuque) {
        this.hora_llegadaBuque = hora_llegadaBuque;
    }

    public LocalDateTime getHora_salidaBuque() {
        return hora_salidaBuque;
    }

    public void setHora_salidaBuque(LocalDateTime hora_salidaBuque) {
        this.hora_salidaBuque = hora_salidaBuque;
    }

    public Boolean getModificacion_plan() {
        return modificacion_plan;
    }

    public void setModificacion_plan(Boolean modificacion_plan) {
        this.modificacion_plan = modificacion_plan;
    }

    public Date getFecha_modificacionPlan() {
        return fecha_modificacionPlan;
    }

    public void setFecha_modificacionPlan(Date fecha_modificacionPlan) {
        this.fecha_modificacionPlan = fecha_modificacionPlan;
    }

    public Integer getNumero_modificaciones() {
        return numero_modificaciones;
    }

    public void setNumero_modificaciones(Integer numero_modificaciones) {
        this.numero_modificaciones = numero_modificaciones;
    }
    
    
    
}
