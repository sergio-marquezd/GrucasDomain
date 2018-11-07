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
public class Usuario extends ObjectBase{

    String nombre;
    String apellido_paterno;
    String apellido_materno;    
    String password;
    String username;
    String email;
    String tipo;
    Integer empleado_id;
    String permisos;
    Integer rol_id;
    String rol;
    Boolean todas_unidades;

    public Usuario() {
        super();
        nombre = "";
        apellido_paterno = "";
        apellido_materno = "";
        password = "";
        username = "";
        email = "";
        tipo = "";
        empleado_id = 0;
        permisos = "";
        rol_id = 0;
        rol = "";
        todas_unidades = false;
    }
        
      public Usuario(UnidadNegocio UnidadNegocio) {
        setUnidad(UnidadNegocio.getUnidad());
        setUnidad_id(UnidadNegocio.getUnidad_id());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
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

    public Integer getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(Integer empleado_id) {
        this.empleado_id = empleado_id;
    }

    public Boolean getTodas_unidades() {
        return todas_unidades;
    }

    public void setTodas_unidades(Boolean todas_unidades) {
        this.todas_unidades = todas_unidades;
    }
    
    public String getFullName() {
        return getNombre() + " " + getApellido_paterno() + " " + getApellido_materno();
    }

    @Override
    public String toString() {
        return nombre + " " + apellido_paterno + " " + apellido_materno;
    }
    
}