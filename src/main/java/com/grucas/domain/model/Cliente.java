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
public class Cliente extends ObjectBase {

    String razon_social;
    String abreviacion;
    String rfc;
    String domicilio;
    String ciudad;
    String estado;
    String cp;
    String telefono;
    String pais;
    String no_contable;
    String estado_cliente;
    String tipo_cambio;

    String UUID;

    // Contactos & Emails
    String contacto_vendedor_nombre;
    String contacto_vendedor_email;

    String contacto_nombre;
    String contacto_email;
    String contacto_tel;

    String contacto_representante_legal_nombre;
    String contacto_representante_legal_email;

    String email_eventos_patio;
    String email_eventos_bodega;
    String email_cambios_estado_trafico;
    String email_ficha_clasificacion;
    String email_cuenta_gastos;
    String email_manifestacion_valor;

    Boolean aereo;
    Boolean maritimo;
    Boolean frontera;
    Boolean aduanal_mexicano;
    Boolean aduanal_americano;
    Boolean almacenamiento;
    Boolean transporte;

    public Cliente() { 
        razon_social = "";
        abreviacion = "";
        rfc = "";
        domicilio = "";
        ciudad = "";
        estado = "";
        cp = "";
        telefono = "";
        pais = "";
        no_contable = "";
        estado_cliente = "";
        tipo_cambio = "";
        UUID = "";
        contacto_vendedor_email = "";
        contacto_nombre = "";
        contacto_email = "";
        contacto_tel = "";
        contacto_representante_legal_nombre = "";
        contacto_representante_legal_email = "";
        email_eventos_patio = "";
        email_eventos_bodega = "";
        email_cambios_estado_trafico = "";
        email_ficha_clasificacion = "";
        email_cuenta_gastos = "";
        email_manifestacion_valor = "";
        aereo = false;
        maritimo = false;
        frontera = false;
        aduanal_mexicano = false;
        aduanal_americano = false;
        almacenamiento = false;
        transporte = false;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getContacto_vendedor_nombre() {
        return contacto_vendedor_nombre;
    }

    public void setContacto_vendedor_nombre(String contacto_vendedor_nombre) {
        this.contacto_vendedor_nombre = contacto_vendedor_nombre;
    }

    public String getContacto_vendedor_email() {
        return contacto_vendedor_email;
    }

    public void setContacto_vendedor_email(String contacto_vendedor_email) {
        this.contacto_vendedor_email = contacto_vendedor_email;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getEstado_cliente() {
        return estado_cliente;
    }

    public void setEstado_cliente(String estado_cliente) {
        this.estado_cliente = estado_cliente;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
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

    public String getNo_contable() {
        return no_contable;
    }

    public void setNo_contable(String no_contable) {
        this.no_contable = no_contable;
    }

    public String getTipo_cambio() {
        return tipo_cambio;
    }

    public void setTipo_cambio(String tipo_cambio) {
        this.tipo_cambio = tipo_cambio;
    }

    public String getContacto_representante_legal_nombre() {
        return contacto_representante_legal_nombre;
    }

    public void setContacto_representante_legal_nombre(String contacto_representante_legal_nombre) {
        this.contacto_representante_legal_nombre = contacto_representante_legal_nombre;
    }

    public String getContacto_representante_legal_email() {
        return contacto_representante_legal_email;
    }

    public void setContacto_representante_legal_email(String contacto_representante_legal_email) {
        this.contacto_representante_legal_email = contacto_representante_legal_email;
    }

    public String getEmail_eventos_patio() {
        return email_eventos_patio;
    }

    public void setEmail_eventos_patio(String email_eventos_patio) {
        this.email_eventos_patio = email_eventos_patio;
    }

    public String getEmail_eventos_bodega() {
        return email_eventos_bodega;
    }

    public void setEmail_eventos_bodega(String email_eventos_bodega) {
        this.email_eventos_bodega = email_eventos_bodega;
    }

    public String getEmail_cambios_estado_trafico() {
        return email_cambios_estado_trafico;
    }

    public void setEmail_cambios_estado_trafico(String email_cambios_estado_trafico) {
        this.email_cambios_estado_trafico = email_cambios_estado_trafico;
    }

    public String getEmail_ficha_clasificacion() {
        return email_ficha_clasificacion;
    }

    public void setEmail_ficha_clasificacion(String email_ficha_clasificacion) {
        this.email_ficha_clasificacion = email_ficha_clasificacion;
    }

    public String getEmail_cuenta_gastos() {
        return email_cuenta_gastos;
    }

    public void setEmail_cuenta_gastos(String email_cuenta_gastos) {
        this.email_cuenta_gastos = email_cuenta_gastos;
    }

    public String getEmail_manifestacion_valor() {
        return email_manifestacion_valor;
    }

    public void setEmail_manifestacion_valor(String email_manifestacion_valor) {
        this.email_manifestacion_valor = email_manifestacion_valor;
    }

    public Boolean getAereo() {
        return aereo;
    }

    public void setAereo(Boolean aereo) {
        this.aereo = aereo;
    }

    public Boolean getMaritimo() {
        return maritimo;
    }

    public void setMaritimo(Boolean maritimo) {
        this.maritimo = maritimo;
    }

    public Boolean getFrontera() {
        return frontera;
    }

    public void setFrontera(Boolean frontera) {
        this.frontera = frontera;
    }

    public Boolean getAduanal_mexicano() {
        return aduanal_mexicano;
    }

    public void setAduanal_mexicano(Boolean aduanal_mexicano) {
        this.aduanal_mexicano = aduanal_mexicano;
    }

    public Boolean getAduanal_americano() {
        return aduanal_americano;
    }

    public void setAduanal_americano(Boolean aduanal_americano) {
        this.aduanal_americano = aduanal_americano;
    }

    public Boolean getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(Boolean almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public Boolean getTransporte() {
        return transporte;
    }

    public void setTransporte(Boolean transporte) {
        this.transporte = transporte;
    }
    
    public Boolean informacionCompleta(){
        boolean textOK = false;
        boolean count = false;
        
        if(razon_social != null || rfc != null || domicilio != null || ciudad != null 
                || estado != null || cp != null || telefono != null || pais != null 
                || no_contable != null || contacto_vendedor_nombre != null 
                || contacto_vendedor_email != null || contacto_nombre != null 
                || contacto_email != null || contacto_tel != null || contacto_representante_legal_nombre != null 
                || contacto_representante_legal_email != null || email_eventos_patio != null 
                || email_eventos_bodega != null || email_cambios_estado_trafico != null || email_ficha_clasificacion != null 
                || email_cuenta_gastos != null || email_manifestacion_valor != null){
            textOK = false;
        }

        if(aereo || maritimo || frontera || aduanal_americano || aduanal_mexicano || almacenamiento || transporte ){
            count = true;
        }
    
        if(count && textOK){
            return true;
        }else{
            return false;
        }
    }

}
