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
public class TipoDeDocumento {

    Integer id;
    Integer clasificacion_id;
    String clasificacion;
    String tipo_documento;
    String mimetypes;
    Boolean referencia_global;

    public TipoDeDocumento() {
        id = 0;
        clasificacion_id = 0;
        tipo_documento = "";
        mimetypes = "";
        referencia_global = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClasificacion_id() {
        return clasificacion_id;
    }

    public void setClasificacion_id(Integer clasificacion_id) {
        this.clasificacion_id = clasificacion_id;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getMimetypes() {
        return mimetypes;
    }

    public void setMimetypes(String mimetypes) {
        this.mimetypes = mimetypes;
    }

    public Boolean getReferencia_global() {
        return referencia_global;
    }

    public void setReferencia_global(Boolean referencia_global) {
        this.referencia_global = referencia_global;
    }

    @Override
    public String toString() {
        return tipo_documento;
    }

}
