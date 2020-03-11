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
    
//    public static final List<String> CLASIFICACION_ADUANAL = Arrays.asList("MARITIMO", "AEREO", "FRONTERA");
//    public static final List<String> TIPO_GIRO = Arrays.asList("ADUANAL MEXICANO", "ADUANAL AMERICANO", "ALMACENAJE MEXICANO", "ALMACENAJE AMERICANO", "TRANSPORTE");
//    public static final List<String> TIPO_OPERACION = Arrays.asList("IMPORTACION", "EXPORTACION");
//    public static final List<String> TIPO_PRODUCTO = Arrays.asList("SERVICIO", "PAQUETE");
//    public static final List<String> TIPO_ASIGNACION_PRECIO = Arrays.asList("%", "PRECIO FIJO");
//    public static final List<String> FRECUENCIA_COBRO = Arrays.asList("POR EVENTO OPERATIVO", "POR EVENTO A SOLICITUD DEL CLIENTE", "ELABORACION DE PEDIMENTO", "PERIOCIDAD DE TIEMPO");
//    public static final List<String> TIPO_FRECUENCIA_POR_EVENTO = Arrays.asList("PEDIMENTO", "EMBARQUE", "OPERACION", "CONTENEDOR");
//    public static final List<String> TIPO_ELABORACION_PEDIMENTO = Arrays.asList("PARTIDAS 1 A 5", "PARTIDAS 6 A 20", "PARTIDAS 21 A 50", "PARTIDAS MAYOR A 51");
//    public static final List<String> TIPO_PERIOCIDAD = Arrays.asList("MENSUAL", "ANUAL");
    
    String codigo;
    String clasificacion_aduanal; 
    String tipo_giro;
    String tipo_producto;
    String tipo_asignacion_precio;
    String tipo_operacion;
    Double porcentaje;
    
    Double precio_sugerido_maritimo;
    Double precio_minimo_maritimo;
    Double precio_maritimo;
    
    Double precio_sugerido_frontera;
    Double precio_minimo_frontera;
    Double precio_frontera;
    
    Double precio_sugerido_aereo;
    Double precio_minimo_aereo;
    Double precio_aereo;
    
    Double total_impuestos;
    
    String frecuencia_cobro;
    String tipo_freceuencia_por_evento;
    String tipo_elaboracion_pedimento;
    String tipo_periocidad;
    
    Boolean producto_aduanal_mexicano;
    Boolean producto_aduanal_americano;
    Boolean producto_almacenaje_mexicano;
    Boolean producto_almacenaje_americano;
    Boolean producto_transporte;
    
    Boolean producto_maritimo;
    Boolean producto_aereo;
    Boolean producto_frontera;
    
    Boolean producto_importacion;
    Boolean producto_exportacion;
    
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
        cliente_id = 0;
        codigo = "";
        clasificacion_aduanal = "";
        tipo_giro = "";
        tipo_producto = "";
        tipo_asignacion_precio = "";
        tipo_operacion = "";
        porcentaje = 0.0;
        precio_sugerido_maritimo = 0.0;
        precio_minimo_maritimo = 0.0;
        precio_maritimo = 0.0;
        precio_sugerido_frontera = 0.0;
        precio_minimo_frontera = 0.0;
        precio_frontera = 0.0;
        precio_sugerido_aereo = 0.0;
        precio_minimo_aereo = 0.0;
        precio_aereo = 0.0;
        total_impuestos = 0.0;
        frecuencia_cobro = "";
        tipo_freceuencia_por_evento = "";
        tipo_elaboracion_pedimento = "";
        tipo_periocidad = "";
        producto_maritimo = false;
        producto_aereo = false;
        producto_frontera = false;
        producto_importacion = false;
        producto_exportacion = false;
        concepto = "";
        descripcion = "";
        comentarios = "";
        paquete = false;
    }

    public ProductoServicio(String codigo, String concepto) { 
        this.codigo = codigo;
        this.concepto = concepto;
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

    public String getTipo_operacion() {
        return tipo_operacion;
    }

    public void setTipo_operacion(String tipo_operacion) {
        this.tipo_operacion = tipo_operacion;
    }

    public Double getPrecio_sugerido_maritimo() {
        return precio_sugerido_maritimo;
    }

    public void setPrecio_sugerido_maritimo(Double precio_sugerido_maritimo) {
        this.precio_sugerido_maritimo = precio_sugerido_maritimo;
    }

    public Double getPrecio_minimo_maritimo() {
        return precio_minimo_maritimo;
    }

    public void setPrecio_minimo_maritimo(Double precio_minimo_maritimo) {
        this.precio_minimo_maritimo = precio_minimo_maritimo;
    }

    public Double getPrecio_maritimo() {
        return precio_maritimo;
    }

    public void setPrecio_maritimo(Double precio_maritimo) {
        this.precio_maritimo = precio_maritimo;
    }

    public Double getPrecio_sugerido_frontera() {
        return precio_sugerido_frontera;
    }

    public void setPrecio_sugerido_frontera(Double precio_sugerido_frontera) {
        this.precio_sugerido_frontera = precio_sugerido_frontera;
    }

    public Double getPrecio_minimo_frontera() {
        return precio_minimo_frontera;
    }

    public void setPrecio_minimo_frontera(Double precio_minimo_frontera) {
        this.precio_minimo_frontera = precio_minimo_frontera;
    }

    public Double getPrecio_frontera() {
        return precio_frontera;
    }

    public void setPrecio_frontera(Double precio_frontera) {
        this.precio_frontera = precio_frontera;
    }

    public Double getPrecio_sugerido_aereo() {
        return precio_sugerido_aereo;
    }

    public void setPrecio_sugerido_aereo(Double precio_sugerido_aereo) {
        this.precio_sugerido_aereo = precio_sugerido_aereo;
    }

    public Double getPrecio_minimo_aereo() {
        return precio_minimo_aereo;
    }

    public void setPrecio_minimo_aereo(Double precio_minimo_aereo) {
        this.precio_minimo_aereo = precio_minimo_aereo;
    }

    public Double getPrecio_aereo() {
        return precio_aereo;
    }

    public void setPrecio_aereo(Double precio_aereo) {
        this.precio_aereo = precio_aereo;
    }

    public Boolean getProducto_maritimo() {
        return producto_maritimo;
    }

    public void setProducto_maritimo(Boolean producto_maritimo) {
        this.producto_maritimo = producto_maritimo;
    }

    public Boolean getProducto_aereo() {
        return producto_aereo;
    }

    public void setProducto_aereo(Boolean producto_aereo) {
        this.producto_aereo = producto_aereo;
    }

    public Boolean getProducto_frontera() {
        return producto_frontera;
    }

    public void setProducto_frontera(Boolean producto_frontera) {
        this.producto_frontera = producto_frontera;
    }

    public Boolean getProducto_importacion() {
        return producto_importacion;
    }

    public void setProducto_importacion(Boolean producto_importacion) {
        this.producto_importacion = producto_importacion;
    }

    public Boolean getProducto_exportacion() {
        return producto_exportacion;
    }

    public void setProducto_exportacion(Boolean producto_exportacion) {
        this.producto_exportacion = producto_exportacion;
    }

    public Boolean getProducto_aduanal_mexicano() {
        return producto_aduanal_mexicano;
    }

    public void setProducto_aduanal_mexicano(Boolean producto_aduanal_mexicano) {
        this.producto_aduanal_mexicano = producto_aduanal_mexicano;
    }

    public Boolean getProducto_aduanal_americano() {
        return producto_aduanal_americano;
    }

    public void setProducto_aduanal_americano(Boolean producto_aduanal_americano) {
        this.producto_aduanal_americano = producto_aduanal_americano;
    }

    public Boolean getProducto_almacenaje_mexicano() {
        return producto_almacenaje_mexicano;
    }

    public void setProducto_almacenaje_mexicano(Boolean producto_almacenaje_mexicano) {
        this.producto_almacenaje_mexicano = producto_almacenaje_mexicano;
    }

    public Boolean getProducto_almacenaje_americano() {
        return producto_almacenaje_americano;
    }

    public void setProducto_almacenaje_americano(Boolean producto_almacenaje_americano) {
        this.producto_almacenaje_americano = producto_almacenaje_americano;
    }

    public Boolean getProducto_transporte() {
        return producto_transporte;
    }

    public void setProducto_transporte(Boolean producto_transporte) {
        this.producto_transporte = producto_transporte;
    }

    @Override
    public String toString() {
        return codigo + " - " + concepto;
    }
    
}
