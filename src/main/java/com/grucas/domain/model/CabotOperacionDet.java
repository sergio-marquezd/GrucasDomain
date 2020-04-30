/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author GRUCAS
 */
public class CabotOperacionDet {
    
    // Generales
    Integer id;
    Date fecha_elaboracion;
    Date fecha_modificacion;
    Integer documento_id;
    String folio;
    String tipo_exportacion;
    String planeacion_cabot;
    
    // Terrestre
    String nombre_caja_contenedor;//para los dos casos
    String nombre_chofer;
    LocalDateTime t_fecha_asignacion_carga;
    LocalDateTime t_fecha_asignacion_carga_real;
    LocalDateTime t_fecha_reservacion_transporte;
    LocalDateTime t_fecha_entrega_documentos_cabot;
    
    LocalDateTime t_fecha_arribo_frontera;
    LocalDateTime t_fecha_declaracion_expo; // Pago Pedimento
    LocalDateTime t_fecha_cruce_frontera;
    LocalDateTime t_fecha_entrega_transportista_usa;
    LocalDateTime t_fecha_llegada_destino;
    LocalDateTime t_fecha_envio_pod;
    
    LocalDateTime m_fecha_eta;
    LocalDateTime m_fecha_reservacion_transporte;
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
    LocalDateTime m_fecha_confirmacion_naviera;
    LocalDateTime m_fecha_confirmacion_naviera_a_grucas;
    LocalDateTime m_fecha_emision_bl;
    LocalDateTime m_fecha_envio_documentos_a_cliente;
    
    String observaciones;

    public CabotOperacionDet() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getNombre_chofer() {
        return nombre_chofer;
    }

    public void setNombre_chofer(String nombre_chofer) {
        this.nombre_chofer = nombre_chofer;
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

    public String getNombre_caja_contenedor() {
        return nombre_caja_contenedor;
    }

    public void setNombre_caja_contenedor(String nombre_caja_contenedor) {
        this.nombre_caja_contenedor = nombre_caja_contenedor;
    }

    public LocalDateTime getM_fecha_eta() {
        return m_fecha_eta;
    }

    public void setM_fecha_eta(LocalDateTime m_fecha_eta) {
        this.m_fecha_eta = m_fecha_eta;
    }

    public LocalDateTime getM_fecha_reservacion_transporte() {
        return m_fecha_reservacion_transporte;
    }

    public void setM_fecha_reservacion_transporte(LocalDateTime m_fecha_reservacion_transporte) {
        this.m_fecha_reservacion_transporte = m_fecha_reservacion_transporte;
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

    public Date getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public void setFecha_elaboracion(Date fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public LocalDateTime getM_fecha_confirmacion_naviera() {
        return m_fecha_confirmacion_naviera;
    }

    public void setM_fecha_confirmacion_naviera(LocalDateTime m_fecha_confirmacion_naviera) {
        this.m_fecha_confirmacion_naviera = m_fecha_confirmacion_naviera;
    }

    public LocalDateTime getM_fecha_confirmacion_naviera_a_grucas() {
        return m_fecha_confirmacion_naviera_a_grucas;
    }

    public void setM_fecha_confirmacion_naviera_a_grucas(LocalDateTime m_fecha_confirmacion_naviera_a_grucas) {
        this.m_fecha_confirmacion_naviera_a_grucas = m_fecha_confirmacion_naviera_a_grucas;
    }

    public LocalDateTime getM_fecha_emision_bl() {
        return m_fecha_emision_bl;
    }

    public void setM_fecha_emision_bl(LocalDateTime m_fecha_emision_bl) {
        this.m_fecha_emision_bl = m_fecha_emision_bl;
    }

    public LocalDateTime getM_fecha_envio_documentos_a_cliente() {
        return m_fecha_envio_documentos_a_cliente;
    }

    public void setM_fecha_envio_documentos_a_cliente(LocalDateTime m_fecha_envio_documentos_a_cliente) {
        this.m_fecha_envio_documentos_a_cliente = m_fecha_envio_documentos_a_cliente;
    }

    public LocalDateTime getT_fecha_asignacion_carga_real() {
        return t_fecha_asignacion_carga_real;
    }

    public void setT_fecha_asignacion_carga_real(LocalDateTime t_fecha_asignacion_carga_real) {
        this.t_fecha_asignacion_carga_real = t_fecha_asignacion_carga_real;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
    
}
