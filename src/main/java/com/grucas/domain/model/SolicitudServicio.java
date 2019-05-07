/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import com.rubik.Base.DocumentObjectBase;

/**
 *
 * @author User
 */
public class SolicitudServicio extends DocumentObjectBase  {
    String folio;
    String cliente;
    Integer cliente_id;
    String placas;
    String contenedor;
    String tara_de_contenedor;
    String booking;   
    String operador;
    Integer cliente_factura_id;
    String cliente_factura;
    String domicilio;
    String ciudad;
    String estado;
    String rfc;
    String cp;
    String linea_transportista;
    Boolean aplico_top = true;


    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Integer getCliente_factura_id() {
        return cliente_factura_id;
    }

    public void setCliente_factura_id(Integer cliente_factura_id) {
        this.cliente_factura_id = cliente_factura_id;
    }

    public String getCliente_factura() {
        return cliente_factura;
    }

    public void setCliente_factura(String cliente_factura) {
        this.cliente_factura = cliente_factura;
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

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getLinea_transportista() {
        return linea_transportista;
    }

    public void setLinea_transportista(String linea_transportista) {
        this.linea_transportista = linea_transportista;
    }

    public Boolean getAplico_top() {
        return aplico_top;
    }

    public void setAplico_top(Boolean aplico_top) {
        this.aplico_top = aplico_top;
    }

    public String getContenedor() {
        return contenedor;
    }

    public void setContenedor(String contenedor) {
        this.contenedor = contenedor;
    }

    public String getTara_de_contenedor() {
        return tara_de_contenedor;
    }

    public void setTara_de_contenedor(String tara_de_contenedor) {
        this.tara_de_contenedor = tara_de_contenedor;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

       
}
