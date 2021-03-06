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
public class Empresa extends ObjectBase{

    String razon_social;
    String abreviacion;
    String contacto_email;
    String contacto_nombre;
    String contacto_tel;
    String rfc;
    String domicilio;
    String ciudad;
    String estado;
    String cp;
    String telefono;
    String pais;
    String email_contabilidad;

    public Empresa() {
        id = 0;
        fecha_elaboracion = null;
        fecha_modificacion = null;
        empresa_id = 0;
        empresa = "";
        unidad_id = 0;
        unidad = "";
        usuario_id = 0;
        usuario = "";
        activo = false;
        razon_social = "";
        abreviacion = "";
        rfc = "";
        domicilio = "";
        ciudad = "";
        estado = "";
        cp = "";
        telefono = "";
        pais = "";
        contacto_email = "";
        contacto_nombre = "";
        contacto_tel = "";
    }
    
    public Empresa(Integer id, String razonSocial) {
        this.id = id;
        razon_social = razonSocial;
    }

    public String getContacto_email() {
        return contacto_email;
    }

    public void setContacto_email(String contacto_email) {
        this.contacto_email = contacto_email;
    }

    public String getContacto_nombre() {
        return contacto_nombre;
    }

    public void setContacto_nombre(String contacto_nombre) {
        this.contacto_nombre = contacto_nombre;
    }

    public String getContacto_tel() {
        return contacto_tel;
    }

    public void setContacto_tel(String contacto_tel) {
        this.contacto_tel = contacto_tel;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail_contabilidad() {
        return email_contabilidad;
    }

    public void setEmail_contabilidad(String email_contabilidad) {
        this.email_contabilidad = email_contabilidad;
    }

    @Override
    public String toString() {
        return razon_social;
    }
    
}