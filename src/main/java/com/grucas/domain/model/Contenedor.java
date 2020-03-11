/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import com.rubik.Base.ObjectBase;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author GrucasDev
 */
public class Contenedor extends ObjectBase {
    LocalDateTime horallegada_frontera;
    LocalDateTime tiempo_cruce;
    LocalDateTime tiempo_inspeccion;
    String folio;
    String nombreContenedor;
    Date fecha_modificacion;
    Date fecha_elaboracion;
    Integer documento_id;
    LocalDateTime fecha_envioDocumentos;
    LocalDateTime fecha_reservacionTransporte;
    LocalDateTime fecha_confirmacionTransportista;
    LocalDateTime fecha_confirmacionGrucasCliente;
    LocalDateTime fecha_envioDocumentosCabot;
    LocalDateTime fecha_declaracionExpImp;
    LocalDateTime fecha_envioDocumentosGrucas;
    LocalDateTime fecha_salidaMercancia;
    LocalDateTime fecha_llegadaBarco;
    LocalDateTime fecha_llegadaAPuertoDestino;
    LocalDateTime fecha_transmision;
    LocalDateTime fecha_entradaMercancia;
    LocalDateTime fecha_ETA;
    LocalDateTime fecha_entradaAPuerto;
    LocalDateTime fecha_recogidaTransporte;
    LocalDateTime fecha_carga;
    LocalDateTime fecha_entregaCajaPatio;
    LocalDateTime fecha_tramiteManiobras;
    LocalDateTime fecha_maniobras;
   
    
    
    public Contenedor(){
        horallegada_frontera = null;
        tiempo_cruce= null;
        tiempo_inspeccion=null;
        folio = "";
        nombreContenedor="";
        documento_id=0;
        fecha_envioDocumentos =null;
        fecha_reservacionTransporte=null;
        fecha_confirmacionTransportista=null;
        fecha_confirmacionGrucasCliente=null;
        fecha_envioDocumentosCabot=null;
        fecha_declaracionExpImp=null;
        fecha_envioDocumentosGrucas=null;
        fecha_salidaMercancia=null;
        fecha_llegadaBarco=null;
        fecha_llegadaAPuertoDestino=null;
        fecha_transmision=null;
        fecha_entradaMercancia=null;
        fecha_ETA=null;
        fecha_entradaAPuerto=null;
        fecha_recogidaTransporte=null;
        fecha_carga=null;
        fecha_entregaCajaPatio=null;
        fecha_tramiteManiobras=null;
        fecha_maniobras=null;
   
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public Date getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public void setFecha_elaboracion(Date fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }

    public String getNombreContenedor() {
        return nombreContenedor;
    }

    public void setNombreContenedor(String nombreContenedor) {
        this.nombreContenedor = nombreContenedor;
    }
    
     public LocalDateTime getHorallegada_frontera() {
        return horallegada_frontera;
    }

    public void setHorallegada_frontera(LocalDateTime horallegada_frontera) {
        this.horallegada_frontera = horallegada_frontera;
    }

    public LocalDateTime getTiempo_cruce() {
        return tiempo_cruce;
    }

    public void setTiempo_cruce(LocalDateTime tiempo_cruce) {
        this.tiempo_cruce = tiempo_cruce;
    }

    public LocalDateTime getTiempo_inspeccion() {
        return tiempo_inspeccion;
    }

    public void setTiempo_inspeccion(LocalDateTime tiempo_inspeccion) {
        this.tiempo_inspeccion = tiempo_inspeccion;
    }

    public String getFolio() {
        return folio;
    }
     public void setFolio(String folio) {
        this.folio = folio;
    }

    public Integer getDocumento_id() {
        return documento_id;
    }

    public void setDocumento_id(Integer documento_id) {
        this.documento_id = documento_id;
    }
/////////////////////
    public LocalDateTime getFecha_envioDocumentos() {
        return fecha_envioDocumentos;
    }

    public void setFecha_envioDocumentos(LocalDateTime fecha_envioDocumentos) {
        this.fecha_envioDocumentos = fecha_envioDocumentos;
    }

    public LocalDateTime getFecha_reservacionTransporte() {
        return fecha_reservacionTransporte;
    }

    public void setFecha_reservacionTransporte(LocalDateTime fecha_reservacionTransporte) {
        this.fecha_reservacionTransporte = fecha_reservacionTransporte;
    }

    public LocalDateTime getFecha_confirmacionTransportista() {
        return fecha_confirmacionTransportista;
    }

    public void setFecha_confirmacionTransportista(LocalDateTime fecha_confirmacionTransportista) {
        this.fecha_confirmacionTransportista = fecha_confirmacionTransportista;
    }

    public LocalDateTime getFecha_confirmacionGrucasCliente() {
        return fecha_confirmacionGrucasCliente;
    }

    public void setFecha_confirmacionGrucasCliente(LocalDateTime fecha_confirmacionGrucasCliente) {
        this.fecha_confirmacionGrucasCliente = fecha_confirmacionGrucasCliente;
    }

    public LocalDateTime getFecha_envioDocumentosCabot() {
        return fecha_envioDocumentosCabot;
    }

    public void setFecha_envioDocumentosCabot(LocalDateTime fecha_envioDocumentosCabot) {
        this.fecha_envioDocumentosCabot = fecha_envioDocumentosCabot;
    }

    public LocalDateTime getFecha_declaracionImpExp() {
        return fecha_declaracionExpImp;
    }

    public void setFecha_declaracionImpExp(LocalDateTime fecha_declaracionImpExp) {
        this.fecha_declaracionExpImp = fecha_declaracionImpExp;
    }

    public LocalDateTime getFecha_envioDocumentosGrucas() {
        return fecha_envioDocumentosGrucas;
    }

    public void setFecha_envioDocumentosGrucas(LocalDateTime fecha_envioDocumentosGrucas) {
        this.fecha_envioDocumentosGrucas = fecha_envioDocumentosGrucas;
    }

    public LocalDateTime getFecha_salidaMercancia() {
        return fecha_salidaMercancia;
    }

    public void setFecha_salidaMercancia(LocalDateTime fecha_salidaMercancia) {
        this.fecha_salidaMercancia = fecha_salidaMercancia;
    }

    public LocalDateTime getFecha_llegadaBarco() {
        return fecha_llegadaBarco;
    }

    public void setFecha_llegadaBarco(LocalDateTime fecha_llegadaBarco) {
        this.fecha_llegadaBarco = fecha_llegadaBarco;
    }

    public LocalDateTime getFecha_llegadaAPuertoDestino() {
        return fecha_llegadaAPuertoDestino;
    }

    public void setFecha_llegadaAPuertoDestino(LocalDateTime fecha_llegadaAPuertoDestino) {
        this.fecha_llegadaAPuertoDestino = fecha_llegadaAPuertoDestino;
    }

    public LocalDateTime getFecha_transmision() {
        return fecha_transmision;
    }

    public void setFecha_transmision(LocalDateTime fecha_transmision) {
        this.fecha_transmision = fecha_transmision;
    }

    public LocalDateTime getFecha_entradaMercancia() {
        return fecha_entradaMercancia;
    }

    public void setFecha_entradaMercancia(LocalDateTime fecha_entradaMercancia) {
        this.fecha_entradaMercancia = fecha_entradaMercancia;
    }

    public LocalDateTime getFecha_ETA() {
        return fecha_ETA;
    }

    public void setFecha_ETA(LocalDateTime fecha_ETA) {
        this.fecha_ETA = fecha_ETA;
    }

    public LocalDateTime getFecha_entradaAPuerto() {
        return fecha_entradaAPuerto;
    }

    public void setFecha_entradaAPuerto(LocalDateTime fecha_entradaAPuerto) {
        this.fecha_entradaAPuerto = fecha_entradaAPuerto;
    }

    public LocalDateTime getFecha_recogidaTransporte() {
        return fecha_recogidaTransporte;
    }

    public void setFecha_recogidaTransporte(LocalDateTime fecha_recogidaTransporte) {
        this.fecha_recogidaTransporte = fecha_recogidaTransporte;
    }

    public LocalDateTime getFecha_carga() {
        return fecha_carga;
    }

    public void setFecha_carga(LocalDateTime fecha_carga) {
        this.fecha_carga = fecha_carga;
    }

    public LocalDateTime getFecha_entregaCajaPatio() {
        return fecha_entregaCajaPatio;
    }

    public void setFecha_entregaCajaPatio(LocalDateTime fecha_entregaCajaPatio) {
        this.fecha_entregaCajaPatio = fecha_entregaCajaPatio;
    }

    public LocalDateTime getFecha_tramiteManiobras() {
        return fecha_tramiteManiobras;
    }

    public void setFecha_tramiteManiobras(LocalDateTime fecha_tramiteManiobras) {
        this.fecha_tramiteManiobras = fecha_tramiteManiobras;
    }

    public LocalDateTime getFecha_maniobras() {
        return fecha_maniobras;
    }

    public void setFecha_maniobras(LocalDateTime fecha_maniobras) {
        this.fecha_maniobras = fecha_maniobras;
    }
    
    
    
}
