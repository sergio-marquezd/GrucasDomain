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
public class UnidadNegocio extends ObjectBase{
    
    String nombre;
    String domicilio;
    String pais;
    String estado;
    String ciudad;
    String codigo_postal;
    String telefono;
    String serie;
    Integer folio_requisicion;
    Integer folio_orden_compra;
    Integer folio_responsiva;

    public UnidadNegocio() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getFolio_requisicion() {
        return folio_requisicion;
    }

    public void setFolio_requisicion(Integer folio_requisicion) {
        this.folio_requisicion = folio_requisicion;
    }

    public Integer getFolio_orden_compra() {
        return folio_orden_compra;
    }

    public void setFolio_orden_compra(Integer folio_orden_compra) {
        this.folio_orden_compra = folio_orden_compra;
    }

    public Integer getFolio_responsiva() {
        return folio_responsiva;
    }

    public void setFolio_responsiva(Integer folio_responsiva) {
        this.folio_responsiva = folio_responsiva;
    }

}