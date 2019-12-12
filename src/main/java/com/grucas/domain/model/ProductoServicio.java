/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import com.rubik.Base.ObjectBase;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author GrucasDev
 */
public class ProductoServicio extends ObjectBase {
    
    public static final List<String> CLASIFICACION_ADUANAL = Arrays.asList("MARITIMO", "AEREO", "FRONTERA");
    public static final List<String> TIPO_GIRO = Arrays.asList("ADUANAL MEXICANO", "ADUANAL AMERICANO", "ALMACENAMIENTO", "TRANSPORTE");
    static final String[] TIPO_PRODUCTO = {"SERVICIO", "PAQUETE"};
    static final String[] TIPO_ASIGNACION_PRECIO = {"%", "PRECIO FIJO"};
    static final String[] FRECUENCIA_COBRO = {"POR EVENTO OPERATIVO", "POR EVENTO A SOLICITUD DEL CLIENTE", "ELABORACION DE PEDIMENTO", "PERIOCIDAD DE TIEMPO"};
    static final String[] TIPO_FRECUENCIA_POR_EVENTO = {"PEDIMENTO", "EMBARQUE", "OPERACION", "CONTENEDOR"};
    static final String[] TIPO_ELABORACION_PEDIMENTO = {"PARTIDAS 1 A 5", "PARTIDAS 6 A 20", "PARTIDAS 21 A 50", "PARTIDAS MAYOR A 51"};
    static final String[] TIPO_PERIOCIDAD = {"MENSUAL", "ANUAL"};
    
    String codigo;
    String clasificacion_aduanal; 
    String tipo_giro;
    String tipo_producto;
    String tipo_asignacion_precio;
    Double porcentaje;
    Double precio_sugerido;
    Double precio_minimo;
    Double precio;
    Double total_impuestos;
    
    String frecuencia_cobro;
    String tipo_freceuencia_por_evento;
    String tipo_elaboracion_pedimento;
    String tipo_periocidad;
    
    String concepto;
    String descripcion;
    String comentarios;
    
    Boolean paquete;

    public ProductoServicio() { 
        id = 0;
        fecha_elaboracion = null;
        fecha_modificacion = null;
        empresa_id = 0;
        empresa = "";
        unidad_id = 0;
        unidad = "";
        usuario_id = 0;
        usuario = "";
        activo = false;
        codigo = "";
        clasificacion_aduanal = "";
        tipo_giro = "";
        tipo_producto = "";
        tipo_asignacion_precio = "";
        porcentaje = 0.0;
        precio_sugerido = 0.0;
        precio_minimo = 0.0;
        precio = 0.0;
        total_impuestos = 0.0;
        frecuencia_cobro = "";
        tipo_freceuencia_por_evento = "";
        tipo_elaboracion_pedimento = "";
        tipo_periocidad = "";
        concepto = "";
        descripcion = "";
        comentarios = "";
        paquete = false;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getClasificacion_aduanal() {
        return clasificacion_aduanal;
    }

    public void setClasificacion_aduanal(String clasificacion_aduanal) {
        this.clasificacion_aduanal = clasificacion_aduanal;
    }

    public String getTipo_giro() {
        return tipo_giro;
    }

    public void setTipo_giro(String tipo_giro) {
        this.tipo_giro = tipo_giro;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public String getTipo_asignacion_precio() {
        return tipo_asignacion_precio;
    }

    public void setTipo_asignacion_precio(String tipo_asignacion_precio) {
        this.tipo_asignacion_precio = tipo_asignacion_precio;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Double getPrecio_sugerido() {
        return precio_sugerido;
    }

    public void setPrecio_sugerido(Double precio_sugerido) {
        this.precio_sugerido = precio_sugerido;
    }

    public Double getPrecio_minimo() {
        return precio_minimo;
    }

    public void setPrecio_minimo(Double precio_minimo) {
        this.precio_minimo = precio_minimo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getFrecuencia_cobro() {
        return frecuencia_cobro;
    }

    public void setFrecuencia_cobro(String frecuencia_cobro) {
        this.frecuencia_cobro = frecuencia_cobro;
    }

    public String getTipo_freceuencia_por_evento() {
        return tipo_freceuencia_por_evento;
    }

    public void setTipo_freceuencia_por_evento(String tipo_freceuencia_por_evento) {
        this.tipo_freceuencia_por_evento = tipo_freceuencia_por_evento;
    }

    public String getTipo_elaboracion_pedimento() {
        return tipo_elaboracion_pedimento;
    }

    public void setTipo_elaboracion_pedimento(String tipo_elaboracion_pedimento) {
        this.tipo_elaboracion_pedimento = tipo_elaboracion_pedimento;
    }

    public String getTipo_periocidad() {
        return tipo_periocidad;
    }

    public void setTipo_periocidad(String tipo_periocidad) {
        this.tipo_periocidad = tipo_periocidad;
    }

    public Boolean getPaquete() {
        return paquete;
    }

    public void setPaquete(Boolean paquete) {
        this.paquete = paquete;
    }

    public Double getTotal_impuestos() {
        return total_impuestos;
    }

    public void setTotal_impuestos(Double total_impuestos) {
        this.total_impuestos = total_impuestos;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return codigo + " - " + concepto;
    }
    
}