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
public class UnidadNegocio extends ObjectBase {

    String nombre;
    String domicilio;
    String pais;
    String estado;
    String ciudad;
    String codigo_postal;
    String telefono;
    String serie;
    String empresa_rfc;
    Integer folio_requisicion;
    Integer folio_orden_compra;
    Integer folio_responsiva;
    Integer folio_vgm;
    String email_dac_proveedores;
    Integer folio_previo;
    String tipo_operacion;
    String aduana;
    String patente;
    String aduana2;
    String patente2;

    public UnidadNegocio() {
        folio_requisicion = 0;
        folio_orden_compra = 0;
        folio_responsiva = 0;
        folio_vgm = 0;
        folio_previo = 0;
        aduana = "";
        patente = "";
        aduana2 = "";
        patente2 = "";
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

    public Integer getFolio_vgm() {
        return folio_vgm;
    }

    public void setFolio_vgm(Integer folio_vgm) {
        this.folio_vgm = folio_vgm;
    }

    @Override
    public String toString() {
        return unidad;
    }

    public String getEmpresa_rfc() {
        return empresa_rfc;
    }

    public void setEmpresa_rfc(String empresa_rfc) {
        this.empresa_rfc = empresa_rfc;
    }

    public String getEmail_dac_proveedores() {
        return email_dac_proveedores;
}

    public void setEmail_dac_proveedores(String email_dac_proveedores) {
        this.email_dac_proveedores = email_dac_proveedores;
    }

    public Integer getFolio_previo() {
        return folio_previo;
    }

    public void setFolio_previo(Integer folio_previo) {
        this.folio_previo = folio_previo;
    }

    public String getTipo_operacion() {
        return tipo_operacion;
    }

    public void setTipo_operacion(String tipo_operacion) {
        this.tipo_operacion = tipo_operacion;
    }

    public String getAduana() {
        return aduana;
    }

    public void setAduana(String aduana) {
        this.aduana = aduana;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getAduana2() {
        return aduana2;
    }

    public void setAduana2(String aduana2) {
        this.aduana2 = aduana2;
    }

    public String getPatente2() {
        return patente2;
    }

    public void setPatente2(String patente2) {
        this.patente2 = patente2;
    }

}
