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
public class Puesto {
    
    Integer id;
    String nombre;
    String descripcion;
    String clasificacion_puesto;
    Integer depende_de;
    Integer departamento_id;

    public Puesto() { 
        id = 0;
        nombre = "";
        descripcion = "";
        clasificacion_puesto = "";
        depende_de = 0;
        departamento_id = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClasificacion_puesto() {
        return clasificacion_puesto;
    }

    public void setClasificacion_puesto(String clasificacion_puesto) {
        this.clasificacion_puesto = clasificacion_puesto;
    }

    public Integer getDepende_de() {
        return depende_de;
    }

    public void setDepende_de(Integer depende_de) {
        this.depende_de = depende_de;
    }

    public Integer getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(Integer departamento_id) {
        this.departamento_id = departamento_id;
    }
    

    @Override
    public String toString() {
        return nombre ;
    }

}