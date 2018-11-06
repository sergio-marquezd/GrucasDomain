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
public class UsuarioSistema {
    
    Integer id;
    Integer usuario_id;
    Integer clave_sistema;
    String sistema;
    Integer rol_id;
    String rol;

    public UsuarioSistema() {
        id = 0;
        usuario_id = 0;
        clave_sistema = 0;
        sistema = "";
        rol_id = 0;
        rol = "";
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

    public Integer getRol_id() {
        return rol_id;
    }

    public void setRol_id(Integer rol_id) {
        this.rol_id = rol_id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}