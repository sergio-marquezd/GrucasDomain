/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import com.rubik.Base.DocumentObjectBase;

/**
 *
 * @author GRUCAS
 */
public class CabotOperacion extends DocumentObjectBase {
    
    String folio;
    Boolean modificacion_plan;
    String tipo_exportacion;
    String planeacion_cabot;

    public CabotOperacion() {
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Boolean getModificacion_plan() {
        return modificacion_plan;
    }

    public void setModificacion_plan(Boolean modificacion_plan) {
        this.modificacion_plan = modificacion_plan;
    }

    public String getTipo_exportacion() {
        return tipo_exportacion;
    }

    public void setTipo_exportacion(String tipo_exportacion) {
        this.tipo_exportacion = tipo_exportacion;
    }

    public String getPlaneacion_cabot() {
        return planeacion_cabot;
    }

    public void setPlaneacion_cabot(String planeacion_cabot) {
        this.planeacion_cabot = planeacion_cabot;
    }
    
}