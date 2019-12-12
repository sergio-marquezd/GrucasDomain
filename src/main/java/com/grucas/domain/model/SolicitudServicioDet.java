/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import com.rubik.Base.PartidaObjectBase;

/**
 *
 * @author User
 */
public class SolicitudServicioDet extends PartidaObjectBase {
    
    Double primer_pesaje;
    Double segundo_pesaje;
    String masa_bruta_mba_vgm;
    String instrumento_referencia;
    String verificacion_instrumento;
    String placas;
    String contenedor;
    String tara_de_contenedor;
    String booking;
    String linea_transportista;
    
    public SolicitudServicioDet(){
        masa_bruta_mba_vgm = "";
    }
    
    public Double getPrimer_pesaje() {
        return primer_pesaje;
    }

    public void setPrimer_pesaje(Double primer_pesaje) {
        this.primer_pesaje = primer_pesaje;
    }

    public Double getSegundo_pesaje() {
        return segundo_pesaje;
    }

    public void setSegundo_pesaje(Double segundo_pesaje) {
        this.segundo_pesaje = segundo_pesaje;
    }

    public String getMasa_bruta_mba_vgm() {
        return masa_bruta_mba_vgm;
    }

    public void setMasa_bruta_mba_vgm(String masa_bruta_mba_vgm) {
        this.masa_bruta_mba_vgm = masa_bruta_mba_vgm;
    }

    public String getinstrumento_referencia() {
        return instrumento_referencia;
    }

    public void setinstrumento_referencia(String intrumento_referencia) {
        this.instrumento_referencia = intrumento_referencia;
    }

    public String getVerificacion_instrumento() {
        return verificacion_instrumento;
    }

    public void setVerificacion_instrumento(String verificacion_instrumento) {
        this.verificacion_instrumento = verificacion_instrumento;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
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

    public String getLinea_transportista() {
        return linea_transportista;
    }

    public void setLinea_transportista(String linea_transportista) {
        this.linea_transportista = linea_transportista;
    }
    
    
    
    
}
