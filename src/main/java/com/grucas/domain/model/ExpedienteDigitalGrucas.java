/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

/**
 *
 * @author GrucasDev
 * 
 * CLASE AUXILIAR PARA INFORMAR QUE TIPO DE EXPEDIENTE SE ESTA PROCESANDO
 * 
 */
public class ExpedienteDigitalGrucas {
    
    String clasificacion_documento;
    String cliente_proveedor;
    String folio;
    Empresa empresa;
    UnidadNegocio unidad_negocio;
    Boolean visible_clientes;

    public ExpedienteDigitalGrucas() {
        clasificacion_documento = "";
        cliente_proveedor = "";
        folio = "";
    }

    public String getClasificacion_documento() {
        return clasificacion_documento;
    }

    public void setClasificacion_documento(String clasificacion_documento) {
        this.clasificacion_documento = clasificacion_documento;
    }

    public String getCliente_proveedor() {
        return cliente_proveedor;
    }

    public void setCliente_proveedor(String cliente_proveedor) {
        this.cliente_proveedor = cliente_proveedor;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public UnidadNegocio getUnidad_negocio() {
        return unidad_negocio;
    }

    public void setUnidad_negocio(UnidadNegocio unidad_negocio) {
        this.unidad_negocio = unidad_negocio;
    }

    public Boolean getVisible_clientes() {
        return visible_clientes;
    }

    public void setVisible_clientes(Boolean visible_clientes) {
        this.visible_clientes = visible_clientes;
    }
       
}