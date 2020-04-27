/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import com.rubik.Base.DocumentObjectBase;
/**
 *
 * @author GRUCAS
 */
public class CabotOperacion extends DocumentObjectBase {
    
    String folio;
    Boolean modificacion_plan;
    String tipo_exportacion;
    String planeacion_cabot;
    String origen;
    String destino;
    
    // Maritimo
    String buque;
    String no_viaje;
    String bl;
    String booking;
    
    String naviera;
    String transportista;
    String numero_pedimento;
   

    public CabotOperacion() {
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Boolean getModificacion_plan() {
        return modificacion_plan;
    }

    public void setModificacion_plan(Boolean modificacion_plan) {
        this.modificacion_plan = modificacion_plan;
    }

    public String getTipo_exportacion() {
        return tipo_exportacion;
    }

    public void setTipo_exportacion(String tipo_exportacion) {
        this.tipo_exportacion = tipo_exportacion;
    }

    public String getPlaneacion_cabot() {
        return planeacion_cabot;
    }

    public void setPlaneacion_cabot(String planeacion_cabot) {
        this.planeacion_cabot = planeacion_cabot;
    }

    public String getBuque() {
        return buque;
    }

    public void setBuque(String buque) {
        this.buque = buque;
    }

    public String getNo_viaje() {
        return no_viaje;
    }

    public void setNo_viaje(String no_viaje) {
        this.no_viaje = no_viaje;
    }

    public String getBl() {
        return bl;
    }

    public void setBl(String bl) {
        this.bl = bl;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public String getNaviera() {
        return naviera;
    }

    public void setNaviera(String naviera) {
        this.naviera = naviera;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public String getNumero_pedimento() {
        return numero_pedimento;
    }

    public void setNumero_pedimento(String numero_pedimento) {
        this.numero_pedimento = numero_pedimento;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

  
    
}