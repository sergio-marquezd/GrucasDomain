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
public class Sistema {
    
    Integer id;
    Integer clave_sistema;
    String nombre_sistema;
    String ruta_sistema;
    String descripcion;
    
    String rol;
    String rol_id; 
    
    public Sistema() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClave_sistema() {
        return clave_sistema;
    }

    public void setClave_sistema(Integer clave_sistema) {
        this.clave_sistema = clave_sistema;
    }

    public String getNombre_sistema() {
        return nombre_sistema;
    }

    public void setNombre_sistema(String nombre_sistema) {
        this.nombre_sistema = nombre_sistema;
    }

    public String getRuta_sistema() {
        return ruta_sistema;
    }

    public void setRuta_sistema(String ruta_sistema) {
        this.ruta_sistema = ruta_sistema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRol_id() {
        return rol_id;
    }

    public void setRol_id(String rol_id) {
        this.rol_id = rol_id;
    }

    @Override
    public String toString() {
        return "Sistema{" + "id=" + id + ", clave_sistema=" + clave_sistema + ", nombre_sistema=" + nombre_sistema + ", ruta_sistema=" + ruta_sistema + ", descripcion=" + descripcion + '}';
    }
    
}