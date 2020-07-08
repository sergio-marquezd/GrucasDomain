/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.expediente.model;

import java.util.Date;

/**
 *
 * @author GrucasDev
 */
public class ExpedienteGrucas implements Comparable<ExpedienteGrucas> {

    public static final int VISUALIZACION_INTERNA = 0;
    public static final int VISUALIZACION_CLIENTE = 1;
    public static final int VISUALIZACION_INTERNA_CLIENTE = 2;
    
    Integer id;
    
    Date fecha_alta;
    String uuid;
    String path;
    String filename;
    String extension;
    String type;
    String folio;
    String folio_interno;
    String tipo_documento;
    String subtipo_documento;
    String usuario;
    Integer cliente_proveedor_id;
    String cliente_proveedor;
    Integer empresa_id;
    String empresa;
    Integer unidad_id;
    String unidad;
    Integer tipo_visualizacion; // 0 .- DOCUMENTO INTERNO ;  1.- DOCUMENTO CLIENTE; 2 .- AMBOS
    Date fecha_vigencia;
    Boolean firmado = true;
    Boolean activo = true;
    Boolean folio_especial = false;
    
    public ExpedienteGrucas() { 
        id = 0;
        fecha_alta = null;
        uuid = "";
        path = "";
        filename = "";
        extension = "";
        type = "";
        folio = "";
        folio_interno = "";
        tipo_documento = "";
        usuario = "";
        cliente_proveedor_id = 0;
        cliente_proveedor = "";
        empresa_id = 0;
        empresa = "";
        unidad_id = 0;
        unidad = "";
        fecha_vigencia = null;
        firmado = false;
        activo = false;
        subtipo_documento = "";
        tipo_visualizacion = 0; // 0 .- DOCUMENTO INTERNO ;  1.- DOCUMENTO CLIENTE; 2 .- AMBOS
    }

    public ExpedienteGrucas(Boolean folio_especial) { 
        id = 0;
        fecha_alta = null;
        uuid = "";
        path = "";
        filename = "";
        extension = "";
        type = "";
        folio = "";
        folio_interno = "";
        tipo_documento = "";
        usuario = "";
        cliente_proveedor = "";
        empresa_id = 0;
        empresa = "";
        unidad_id = 0;
        unidad = "";
        fecha_vigencia = null;
        firmado = false;
        activo = false;
        subtipo_documento = "";
        tipo_visualizacion = 0; // 0 .- DOCUMENTO INTERNO ;  1.- DOCUMENTO CLIENTE; 2 .- AMBOS
        
        this.folio_especial = folio_especial;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Boolean getFolio_especial() {
        return folio_especial;
    }

    public void setFolio_especial(Boolean folio_especial) {
        this.folio_especial = folio_especial;
    }

    public String getFolio_interno() {
        return folio_interno;
    }

    public void setFolio_interno(String folio_interno) {
        this.folio_interno = folio_interno;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCliente_proveedor() {
        return cliente_proveedor;
    }

    public void setCliente_proveedor(String cliente_proveedor) {
        this.cliente_proveedor = cliente_proveedor;
    }

    public Integer getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Integer empresa_id) {
        this.empresa_id = empresa_id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getUnidad_id() {
        return unidad_id;
    }

    public void setUnidad_id(Integer unidad_id) {
        this.unidad_id = unidad_id;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Date getFecha_vigencia() {
        return fecha_vigencia;
    }

    public void setFecha_vigencia(Date fecha_vigencia) {
        this.fecha_vigencia = fecha_vigencia;
    }

    public Boolean getFirmado() {
        return firmado;
    }

    public void setFirmado(Boolean firmado) {
        this.firmado = firmado;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getSubtipo_documento() {
        return subtipo_documento;
    }

    public void setSubtipo_documento(String subtipo_documento) {
        this.subtipo_documento = subtipo_documento;
    }

    public Integer getTipo_visualizacion() {
        return tipo_visualizacion;
    }

    public void setTipo_visualizacion(Integer tipo_visualizacion) {
        this.tipo_visualizacion = tipo_visualizacion;
    }

    public Integer getCliente_proveedor_id() {
        return cliente_proveedor_id;
    }

    public void setCliente_proveedor_id(Integer cliente_proveedor_id) {
        this.cliente_proveedor_id = cliente_proveedor_id;
    }
    
    public String getFileNameSimple(){
        try {
            return filename.substring(38);
        } catch (Exception e) {
            return filename;
        }
    }
    
    @Override
    public String toString() {
        return "\n IndexableFile{" + "id=" + id + ", uuid=" + uuid + ", extension=" + extension + ", type=" + type + ", folio=" + folio + ", folio_interno=" + folio_interno + ", tipo_documento=" + tipo_documento + ", subtipo_documento=" + subtipo_documento + ", usuario=" + usuario + ", cliente_proveedor=" + cliente_proveedor + ", empresa_id=" + empresa_id + ", empresa=" + empresa + ", unidad_id=" + unidad_id + ", unidad=" + unidad + ", tipo_visualizacion=" + tipo_visualizacion + ", fecha_vigencia=" + fecha_vigencia + ", firmado=" + firmado + ", activo=" + activo + '}';
    }

    @Override
    public int compareTo(ExpedienteGrucas o) {
        return this.fecha_alta.compareTo(o.fecha_alta);
    }

}