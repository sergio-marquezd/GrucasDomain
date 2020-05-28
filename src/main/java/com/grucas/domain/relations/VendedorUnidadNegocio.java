/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.relations;

/**
 *
 * @author GrucasDev
 */
public class VendedorUnidadNegocio {
    
    Integer id;
    Integer vendedor_id;
    Integer unidad_negocio_id;
    String unidad_negocio;
    
    public VendedorUnidadNegocio(){
        id =0;
        vendedor_id =0;
        unidad_negocio_id =0;
        unidad_negocio ="";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVendedor_id() {
        return vendedor_id;
    }

    public void setVendedor_id(Integer vendedor_id) {
        this.vendedor_id = vendedor_id;
    }

    public Integer getUnidad_negocio_id() {
        return unidad_negocio_id;
    }

    public void setUnidad_negocio_id(Integer unidad_negocio_id) {
        this.unidad_negocio_id = unidad_negocio_id;
    }

    public String getUnidad_negocio() {
        return unidad_negocio;
    }

    public void setUnidad_negocio(String unidad_negocio) {
        this.unidad_negocio = unidad_negocio;
    }
    
    
}
