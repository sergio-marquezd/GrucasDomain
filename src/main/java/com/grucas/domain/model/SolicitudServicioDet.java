/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import com.rubik.Base.PartidaObjectBase;
import java.util.Date;

/**
 *
 * @author User
 */
public class SolicitudServicioDet extends PartidaObjectBase {
    Date fecha_primer_pesaje;
    Double primer_pesaje;
    Date fecha_segundo_pesaje;
    Double segundo_pesaje;
    Double masa_bruta_mba_vgm;
    String intrumento_referencia;
    String verificacion_instrumento;

    public Date getFecha_primer_pesaje() {
        return fecha_primer_pesaje;
    }

    public void setFecha_primer_pesaje(Date fecha_primer_pesaje) {
        this.fecha_primer_pesaje = fecha_primer_pesaje;
    }

    public Double getPrimer_pesaje() {
        return primer_pesaje;
    }

    public void setPrimer_pesaje(Double primer_pesaje) {
        this.primer_pesaje = primer_pesaje;
    }

    public Date getFecha_segundo_pesaje() {
        return fecha_segundo_pesaje;
    }

    public void setFecha_segundo_pesaje(Date fecha_segundo_pesaje) {
        this.fecha_segundo_pesaje = fecha_segundo_pesaje;
    }

    public Double getSegundo_pesaje() {
        return segundo_pesaje;
    }

    public void setSegundo_pesaje(Double segundo_pesaje) {
        this.segundo_pesaje = segundo_pesaje;
    }

    public Double getMasa_bruta_mba_vgm() {
        return masa_bruta_mba_vgm;
    }

    public void setMasa_bruta_mba_vgm(Double masa_bruta_mba_vgm) {
        this.masa_bruta_mba_vgm = masa_bruta_mba_vgm;
    }

    public String getIntrumento_referencia() {
        return intrumento_referencia;
    }

    public void setIntrumento_referencia(String intrumento_referencia) {
        this.intrumento_referencia = intrumento_referencia;
    }

    public String getVerificacion_instrumento() {
        return verificacion_instrumento;
    }

    public void setVerificacion_instrumento(String verificacion_instrumento) {
        this.verificacion_instrumento = verificacion_instrumento;
    }
    
    
    
    
}
