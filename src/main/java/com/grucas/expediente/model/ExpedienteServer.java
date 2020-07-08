/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.expediente.model;

/**
 *
 * @author GRUCAS
 */
public class ExpedienteServer {
    
    Integer id; 
    String descripcion;
    String ip;
    String path_documents;
    String server_type;
    String activo;

    public ExpedienteServer() { 
        id = 0;
        descripcion = "";
        ip = "";
        path_documents = "";
        server_type = "";
        activo = "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPath_documents() {
        return path_documents;
    }

    public void setPath_documents(String path_documents) {
        this.path_documents = path_documents;
    }

    public String getServer_type() {
        return server_type;
    }

    public void setServer_type(String server_type) {
        this.server_type = server_type;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

}