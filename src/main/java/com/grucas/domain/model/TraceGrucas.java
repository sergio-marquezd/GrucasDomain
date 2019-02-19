/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import java.util.Date;

/**
 *
 * @author GrucasDev
 */
public class TraceGrucas {
    
    Integer id;
    Date fecha_elaboracion;
    Integer document_id;
    String folio;
    Integer usario_id;
    String usuario;
    String tipo_documento;
    String estado;
    String observaciones;
    
    public TraceGrucas() { 
        id = 0;
        fecha_elaboracion = null;
        document_id = 0;
        folio = "";
        usario_id = 0;
        usuario = "";
        tipo_documento = "";
        estado = "";
        observaciones = "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public void setFecha_elaboracion(Date fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }

    public Integer getDocument_id() {
        return document_id;
    }

    public void setDocument_id(Integer document_id) {
        this.document_id = document_id;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Integer getUsario_id() {
        return usario_id;
    }

    public void setUsario_id(Integer usario_id) {
        this.usario_id = usario_id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}