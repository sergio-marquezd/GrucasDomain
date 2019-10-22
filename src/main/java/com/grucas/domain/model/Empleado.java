/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import com.rubik.Base.ObjectBase;
import java.util.Date;

/**
 *
 * @author GrucasDev
 */
public class Empleado extends ObjectBase{
    
    // Datos del Empleado
    String clave_empleado;
    
    String nombre;
    String apellido_paterno;
    String apellido_materno;
    String nss;
    
    String domicilio;
    String colonia;
    Integer cp;
    String ciudad;
    String estado;
    String pais;
    
    // Datos Generales
    String telefono_empresa;
    String telefono_personal;
    String email_empresa;
    String email_personal;

    // Recursos humanos
    Date fecha_ingreso;
    
    // Configuracion de Sistemas
    Boolean autorizador;
    Boolean requisitor;
    
    String nombre_completo;
    
    Integer puesto_id;
    String puesto;
    
    String clasificacion_puesto;
    
    Integer departamento_id;
    String departamento;

    public Empleado() {
        super();
        id = 0;
        fecha_elaboracion = null;
        fecha_modificacion = null;
        empresa_id = 0;
        empresa = "";
        unidad_id = 0;
        unidad = "";
        usuario_id = 0;
        usuario = "";
        clave_empleado = "";
        nombre = "";
        apellido_paterno = "";
        apellido_materno = "";
        nss = "";
        domicilio = "";
        colonia = "";
        cp = 0;
        ciudad = "";
        estado = "";
        pais = "";
        telefono_empresa = "";
        telefono_personal = "";
        email_empresa = "";
        email_personal = "";
        fecha_ingreso = null;
        autorizador = false;
        requisitor = false;
        puesto_id = 0;
        puesto = "";
        clasificacion_puesto = "";
        departamento_id = 0;
        departamento = "";
        activo = false;
    }

    public String getClave_empleado() {
        return clave_empleado;
    }

    public void setClave_empleado(String clave_empleado) {
        this.clave_empleado = clave_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono_empresa() {
        return telefono_empresa;
    }

    public void setTelefono_empresa(String telefono_empresa) {
        this.telefono_empresa = telefono_empresa;
    }

    public String getTelefono_personal() {
        return telefono_personal;
    }

    public void setTelefono_personal(String telefono_personal) {
        this.telefono_personal = telefono_personal;
    }

    public String getEmail_empresa() {
        return email_empresa;
    }

    public void setEmail_empresa(String email_empresa) {
        this.email_empresa = email_empresa;
    }

    public String getEmail_personal() {
        return email_personal;
    }

    public void setEmail_personal(String email_personal) {
        this.email_personal = email_personal;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Boolean getAutorizador() {
        return autorizador;
    }

    public void setAutorizador(Boolean autorizador) {
        this.autorizador = autorizador;
    }

    public Boolean getRequisitor() {
        return requisitor;
    }

    public void setRequisitor(Boolean requisitor) {
        this.requisitor = requisitor;
    }

    public String getNombre_completo() {
        return nombre + " " + apellido_paterno + " " + apellido_materno;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public Integer getPuesto_id() {
        return puesto_id;
    }

    public void setPuesto_id(Integer puesto_id) {
        this.puesto_id = puesto_id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Integer getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(Integer departamento_id) {
        this.departamento_id = departamento_id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getClasificacion_puesto() {
        return clasificacion_puesto;
    }

    public void setClasificacion_puesto(String clasificacion_puesto) {
        this.clasificacion_puesto = clasificacion_puesto;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido_paterno + " " + apellido_materno;
    }
    
}