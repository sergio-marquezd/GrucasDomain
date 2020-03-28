/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import java.time.LocalDateTime;

/**
 *
 * @author GRUCAS
 */
public class CabotOperacionDet {
    
    // Generales
    Integer documento_id;
    String folio;
    String tipo_exportacion;
    String planeacion_cabot;
    
    // Terrestre
    String t_nombre_caja;
    LocalDateTime t_fecha_asignacion_carga;
    LocalDateTime t_fecha_reservacion_transporte;
    LocalDateTime t_fecha_entrega_documentos_cabot;
    
    LocalDateTime t_fecha_arribo_frontera;
    LocalDateTime t_fecha_declaracion_expo; // Pago Pedimento
    LocalDateTime t_fecha_cruce_frontera;
    LocalDateTime t_fecha_entrega_transportista_usa;
    LocalDateTime t_fecha_llegada_destino;
    LocalDateTime t_fecha_envio_pod;
    
    // Maritimo
    String contenedor;
    String buque;
    String no_viaje;
    String bl;
    String booking;
    
    LocalDateTime m_fecha_eta;
    LocalDateTime m_fecha_reservacion_transportista;
    LocalDateTime m_fecha_confirmacion_transportista;
    LocalDateTime m_fecha_tramite_maniobras_vacios;
    LocalDateTime m_fecha_retiro_contenedores_vacios;
    LocalDateTime m_fecha_carga_cabot;
    LocalDateTime m_fecha_entrega_documentos_cabot;
    LocalDateTime m_fecha_tramite_maniobras_llenos;
    LocalDateTime m_fecha_modulacion_pedimento;  // Pago Pedimento
    LocalDateTime m_fecha_entrega_contenedor_puerto;
    LocalDateTime m_fecha_salida_buque;
    LocalDateTime m_fecha_llegada_destino_final;

    public CabotOperacionDet() {
    }

    public Integer getDocumento_id() {
        return documento_id;
    }

    public void setDocumento_id(Integer documento_id) {
        this.documento_id = documento_id;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
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

    public String getT_nombre_caja() {
        return t_nombre_caja;
    }

    public void setT_nombre_caja(String t_nombre_caja) {
        this.t_nombre_caja = t_nombre_caja;
    }

    public LocalDateTime getT_fecha_asignacion_carga() {
        return t_fecha_asignacion_carga;
    }

    public void setT_fecha_asignacion_carga(LocalDateTime t_fecha_asignacion_carga) {
        this.t_fecha_asignacion_carga = t_fecha_asignacion_carga;
    }

    public LocalDateTime getT_fecha_reservacion_transporte() {
        return t_fecha_reservacion_transporte;
    }

    public void setT_fecha_reservacion_transporte(LocalDateTime t_fecha_reservacion_transporte) {
        this.t_fecha_reservacion_transporte = t_fecha_reservacion_transporte;
    }

    public LocalDateTime getT_fecha_entrega_documentos_cabot() {
        return t_fecha_entrega_documentos_cabot;
    }

    public void setT_fecha_entrega_documentos_cabot(LocalDateTime t_fecha_entrega_documentos_cabot) {
        this.t_fecha_entrega_documentos_cabot = t_fecha_entrega_documentos_cabot;
    }

    public LocalDateTime getT_fecha_arribo_frontera() {
        return t_fecha_arribo_frontera;
    }

    public void setT_fecha_arribo_frontera(LocalDateTime t_fecha_arribo_frontera) {
        this.t_fecha_arribo_frontera = t_fecha_arribo_frontera;
    }

    public LocalDateTime getT_fecha_declaracion_expo() {
        return t_fecha_declaracion_expo;
    }

    public void setT_fecha_declaracion_expo(LocalDateTime t_fecha_declaracion_expo) {
        this.t_fecha_declaracion_expo = t_fecha_declaracion_expo;
    }

    public LocalDateTime getT_fecha_cruce_frontera() {
        return t_fecha_cruce_frontera;
    }

    public void setT_fecha_cruce_frontera(LocalDateTime t_fecha_cruce_frontera) {
        this.t_fecha_cruce_frontera = t_fecha_cruce_frontera;
    }

    public LocalDateTime getT_fecha_entrega_transportista_usa() {
        return t_fecha_entrega_transportista_usa;
    }

    public void setT_fecha_entrega_transportista_usa(LocalDateTime t_fecha_entrega_transportista_usa) {
        this.t_fecha_entrega_transportista_usa = t_fecha_entrega_transportista_usa;
    }

    public LocalDateTime getT_fecha_llegada_destino() {
        return t_fecha_llegada_destino;
    }

    public void setT_fecha_llegada_destino(LocalDateTime t_fecha_llegada_destino) {
        this.t_fecha_llegada_destino = t_fecha_llegada_destino;
    }

    public LocalDateTime getT_fecha_envio_pod() {
        return t_fecha_envio_pod;
    }

    public void setT_fecha_envio_pod(LocalDateTime t_fecha_envio_pod) {
        this.t_fecha_envio_pod = t_fecha_envio_pod;
    }

    public String getContenedor() {
        return contenedor;
    }

    public void setContenedor(String contenedor) {
        this.contenedor = contenedor;
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

    public LocalDateTime getM_fecha_eta() {
        return m_fecha_eta;
    }

    public void setM_fecha_eta(LocalDateTime m_fecha_eta) {
        this.m_fecha_eta = m_fecha_eta;
    }

    public LocalDateTime getM_fecha_reservacion_transportista() {
        return m_fecha_reservacion_transportista;
    }

    public void setM_fecha_reservacion_transportista(LocalDateTime m_fecha_reservacion_transportista) {
        this.m_fecha_reservacion_transportista = m_fecha_reservacion_transportista;
    }

    public LocalDateTime getM_fecha_confirmacion_transportista() {
        return m_fecha_confirmacion_transportista;
    }

    public void setM_fecha_confirmacion_transportista(LocalDateTime m_fecha_confirmacion_transportista) {
        this.m_fecha_confirmacion_transportista = m_fecha_confirmacion_transportista;
    }

    public LocalDateTime getM_fecha_tramite_maniobras_vacios() {
        return m_fecha_tramite_maniobras_vacios;
    }

    public void setM_fecha_tramite_maniobras_vacios(LocalDateTime m_fecha_tramite_maniobras_vacios) {
        this.m_fecha_tramite_maniobras_vacios = m_fecha_tramite_maniobras_vacios;
    }

    public LocalDateTime getM_fecha_retiro_contenedores_vacios() {
        return m_fecha_retiro_contenedores_vacios;
    }

    public void setM_fecha_retiro_contenedores_vacios(LocalDateTime m_fecha_retiro_contenedores_vacios) {
        this.m_fecha_retiro_contenedores_vacios = m_fecha_retiro_contenedores_vacios;
    }

    public LocalDateTime getM_fecha_carga_cabot() {
        return m_fecha_carga_cabot;
    }

    public void setM_fecha_carga_cabot(LocalDateTime m_fecha_carga_cabot) {
        this.m_fecha_carga_cabot = m_fecha_carga_cabot;
    }

    public LocalDateTime getM_fecha_entrega_documentos_cabot() {
        return m_fecha_entrega_documentos_cabot;
    }

    public void setM_fecha_entrega_documentos_cabot(LocalDateTime m_fecha_entrega_documentos_cabot) {
        this.m_fecha_entrega_documentos_cabot = m_fecha_entrega_documentos_cabot;
    }

    public LocalDateTime getM_fecha_tramite_maniobras_llenos() {
        return m_fecha_tramite_maniobras_llenos;
    }

    public void setM_fecha_tramite_maniobras_llenos(LocalDateTime m_fecha_tramite_maniobras_llenos) {
        this.m_fecha_tramite_maniobras_llenos = m_fecha_tramite_maniobras_llenos;
    }

    public LocalDateTime getM_fecha_modulacion_pedimento() {
        return m_fecha_modulacion_pedimento;
    }

    public void setM_fecha_modulacion_pedimento(LocalDateTime m_fecha_modulacion_pedimento) {
        this.m_fecha_modulacion_pedimento = m_fecha_modulacion_pedimento;
    }

    public LocalDateTime getM_fecha_entrega_contenedor_puerto() {
        return m_fecha_entrega_contenedor_puerto;
    }

    public void setM_fecha_entrega_contenedor_puerto(LocalDateTime m_fecha_entrega_contenedor_puerto) {
        this.m_fecha_entrega_contenedor_puerto = m_fecha_entrega_contenedor_puerto;
    }

    public LocalDateTime getM_fecha_salida_buque() {
        return m_fecha_salida_buque;
    }

    public void setM_fecha_salida_buque(LocalDateTime m_fecha_salida_buque) {
        this.m_fecha_salida_buque = m_fecha_salida_buque;
    }

    public LocalDateTime getM_fecha_llegada_destino_final() {
        return m_fecha_llegada_destino_final;
    }

    public void setM_fecha_llegada_destino_final(LocalDateTime m_fecha_llegada_destino_final) {
        this.m_fecha_llegada_destino_final = m_fecha_llegada_destino_final;
    }

}