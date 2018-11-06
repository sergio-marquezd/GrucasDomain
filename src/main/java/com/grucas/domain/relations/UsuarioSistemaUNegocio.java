/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.relations;

/**
 *
 * @author GrucasDev
 */
public class UsuarioSistemaUNegocio {
    
    Integer id;
    Integer usuario_id;
    Integer clave_sistema;
    String sistema;
    Integer unidad_negocio_id;
    String unidad_negocio;

    public UsuarioSistemaUNegocio() {
        id = 0;
        usuario_id = 0;
        clave_sistema = 0;
        sistema = "";
        unidad_negocio_id = 0;
        unidad_negocio = "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Integer getClave_sistema() {
        return clave_sistema;
    }

    public void setClave_sistema(Integer clave_sistema) {
        this.clave_sistema = clave_sistema;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public Integer getUnidad_negocio_id() {
        return unidad_negocio_id;
    }

    public void setUnidad_negocio_id(Integer unidad_negocio_id) {
        this.unidad_negocio_id = unidad_negocio_id;
    }

    public String getUnidad_negocio() {
        return unidad_negocio;
    }

    public void setUnidad_negocio(String unidad_negocio) {
        this.unidad_negocio = unidad_negocio;
    }
    
}