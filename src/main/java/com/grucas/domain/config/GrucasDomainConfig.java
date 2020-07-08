/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.config;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author GrucasDev
 */
public class GrucasDomainConfig {

    public static final String URL_APP = "https://web.grucas.com:8443/Grucas/";
    public static final String URL_API = "https://web.grucas.com:8443/GrucasAPI/v1/";
      
    private static final String ENV_GRUCAS = "catalogos";
    public static final Boolean DEBUG_GRUCAS = true;

    public static final Boolean DEBUG = true;
    
    public static String getEnvironmentGrucas() {
        return ENV_GRUCAS;
    }

    // ------------------------------------------------------------------------- 
    // Configuraciones y usuarios
    // ------------------------------------------------------------------------- 
    public static final String USUARIO_SUPER = "FULLACCESS";
    public static final String USUARIO_EMPLEADO = "COLABORADOR";
    public static final String USUARIO_CLIENTE = "CLIENTE";
    public static final List<String> USUARIO_TIPOS = Arrays.asList(USUARIO_EMPLEADO,USUARIO_CLIENTE,USUARIO_SUPER);

    // ------------------------------------------------------------------------- 
    // ROLES DE USUARIO DEFINIDOS EN LA BASE DE DATOS ** ES DE SUMA IMPORTANCIA ESTAR ACTUALIZADO CONFORME A LA BASE DE DATOS**
    // ------------------------------------------------------------------------- 
    
    //ROLES DE USUARIO PARA VARIOS SISTEMAS
    public static final String ROL_ADMINISTRADOR = "ADMINISTRADOR";
    public static final String ROL_INVENTARIOS = "INVENTARIOS";
    
    //ROLES DE USUARIO DEFINIDOS PARA SISTEMA DE KARGO - CHEMOURS [CODE APP: 1001]
    public static final String ROL_EMBARQUES = "EMBARQUES";
    public static final String ROL_DOCUMENTADOR = "DOCUMENTADOR";
    public static final String ROL_SUPERVISOR = "SUPERVISOR";

    //ROLES DE USUARIO DEFINIDOS PARA SISTEMA GRUCAS INTRANET [CODE APP: 1006]
    public static final String ROL_COMPRAS = "COMPRAS";
    public static final String ROL_REQUISITOR = "REQUISITOR";
    public static final String ROL_AUTORIZADOR = "AUTORIZADOR";
    public static final String ROL_ADMIN_SD = "ADMINISTRADOR SD";
    public static final String ROL_TECNICO_SD = "TECNICO";
    
    public static final List<String> ROLES_SD = Arrays.asList(ROL_ADMIN_SD, ROL_TECNICO_SD) ;
    
     //ROLES DE USUARIO DEFINIDOS PARA SISTEMA GRUCAS EXTRANET [CODE APP: 1007]
    public static final String ROL_EJECUTIVO_ARCELOR = "EJECUTIVO ARCELOR";
    public static final String ROL_CLIETE_ARCELOR = "CLIENTE ARCELOR";
    public static final String ROL_CLIENTE_KARGO = "CLIENTE KARGO";
    public static final String ROL_EJECUTIVO_KARGO = "EJECUTIVO KARGO";
    
    // ------------------------------------------------------------------------- 
    // Documentos
    // -------------------------------------------------------------------------        
    public static final String DOCUMENTO_REQUISICION = "REQUISICION";
    public static final String DOCUMENTO_ORDEN_DE_COMPRA = "ORDEN DE COMPRA";
    public static final String DOCUMENTO_COTIZACION_COMPRA = "COTIZACION COMPRA";
    public static final String DOCUMENTO_SOLICITUD_VGM = "SOLICITUD VGM";
    
    // ------------------------------------------------------------------------- 
    // Unidades de medida
    // -------------------------------------------------------------------------
    public static final String MEDIDA_BOLSA = "BOLSA";
    public static final String MEDIDA_BOTE = "BOTE";
    public static final String MEDIDA_BULTO = "BULTO";
    public static final String MEDIDA_CAJA = "CAJA";
    public static final String MEDIDA_CARTON = "CARTON";
    public static final String MEDIDA_COSTAL = "COSTAL";
    public static final String MEDIDA_CONTENEDOR = "CONTENEDOR";
    public static final String MEDIDA_CUBETA = "CUBETA";
    public static final String MEDIDA_LATA = "LATA";
    public static final String MEDIDA_PALLETA = "PALLETA";
    public static final String MEDIDA_PAQUETE = "PAQUETE";
    public static final String MEDIDA_PIEZA = "PIEZA";
    public static final String MEDIDA_ROLLO= "ROLLO";
    public static final String MEDIDA_SACO = "SACO";    
    public static final String MEDIDA_TANQUE = "TANQUE";

    public static final List<String> UNIDADES_DE_MEDIDA = Arrays.asList(MEDIDA_BOLSA,MEDIDA_BOTE,MEDIDA_BULTO,MEDIDA_CAJA,MEDIDA_CARTON,MEDIDA_CONTENEDOR,MEDIDA_COSTAL,MEDIDA_CUBETA,MEDIDA_LATA,MEDIDA_PALLETA,MEDIDA_PAQUETE,MEDIDA_PIEZA,MEDIDA_ROLLO,MEDIDA_SACO,MEDIDA_TANQUE);

    // ------------------------------------------------------------------------- 
    // Paises
    // -------------------------------------------------------------------------    
    public static final String PAIS_MEXICO = "MEXICO";
    public static final String PAIS_USA = "USA";
    
    public static final List<String> PAISES = Arrays.asList(PAIS_MEXICO,PAIS_USA);
    
    // -------------------------------------------------------------------------
    // Metodo de Pago
    // -------------------------------------------------------------------------
    public static final String PAGO_CONTADO = "CONTADO";
    public static final String PAGO_CRED_15DIAS = "CREDITO 15 DIAS";
    public static final String PAGO_CRED_30DIAS = "CREDITO 30 DIAS";
    public static final String PAGO_CRED_60DIAS = "CREDITO 60 DIAS";
    public static final String CHEQUE = "CHEQUE";
    public static final String TARJETA_CREDITO = "TARJETA CREDITO";
    public static final String TRANSFERENCIA = "TRANSFERENCIA";
    
    public static final List<String>METODO_PAGO =Arrays.asList(PAGO_CONTADO,PAGO_CRED_15DIAS,PAGO_CRED_30DIAS,PAGO_CRED_60DIAS);
    public static final List <String>FORMA_PAGO =Arrays.asList(CHEQUE,TARJETA_CREDITO,TRANSFERENCIA);
    
    // -------------------------------------------------------------------------
    // Prioridad
    // -------------------------------------------------------------------------
    
    public static final String PRIORIDAD_BAJA = "BAJA";
    public static final String PRIORIDAD_MEDIA = "MEDIA";
    public static final String PRIORIDAD_ALTA = "ALTA";
    
    public static final List<String>PRIORIDAD = Arrays.asList(PRIORIDAD_BAJA,PRIORIDAD_MEDIA,PRIORIDAD_ALTA);
  
 
    // ------------------------------------------------------------------------
    //Tipos ACREDOR 
    // -------------------------------------------------------------------------
    
    public static final String PROVEEDOR_NACIONAL = "PROVEEDOR NACIONAL";
    public static final String PROVEEDOR_EXTRANJERO = "PROVEEDOR EXTRANJERO";
    
    public static final List<String> ACREDOR = Arrays.asList(PROVEEDOR_NACIONAL,PROVEEDOR_EXTRANJERO);
    
    // ------------------------------------------------------------------------
    //Tipo OPERACIONES 
    // -------------------------------------------------------------------------
    
    public static final String PREST_SERVICIOS = "PREST. DE SERVICIOS";
    public static final String ARRENDAMIENTO_INMUEBLES = "ARRENDAMIENTO DE INMUEBLES";
    public static final String TRANSPORTISTAS_MODULOS = "TRANSPORTISTAS-MODULOS";
    public static final String OTROS = "OTROS";
    
    public static final List<String> OPERACIONES = Arrays.asList(PREST_SERVICIOS,ARRENDAMIENTO_INMUEBLES,TRANSPORTISTAS_MODULOS,OTROS);
              
     // ------------------------------------------------------------------------
    // CLASIFICACION PROVEEDORES
    // -------------------------------------------------------------------------
    public static final String TIPO_PROVEEDOR_ESTRATEGICO = "ESTRÁTEGICO";
    public static final String TIPO_PROVEEDOR_GENERAL = "GENERAL";
    
    public static final List<String> TIPOS_DE_PROVEEDORES = Arrays.asList(TIPO_PROVEEDOR_GENERAL,TIPO_PROVEEDOR_ESTRATEGICO);
    public static final List<String> CLASIFICACION_PROVEEDORES = Arrays.asList("Contrato","Cliente impone","Unico en zona","Cumple con los Requisitos legales y reglamentarios","Casos especiales","Afecta la operación");
 
    
    // ------------------------------------------------------------------------
    // EMPRESAS
    // -------------------------------------------------------------------------
    
     public static final String DESPACHOS = "Despachos Aduanales Castañeda S.C";
     public static final String GRUPO = "Grupo Castañeda S.A de C.V.";
     public static final String SERVICIOS = "Servicios Profesionales Camla S.C.";
     public static final String UNITRANS = "Unitrans S.A de C.V.";
     public static final String KARGO = "Kargo Servicio Integrado S.A de C.V.";
     public static final String GRUCAS = "Grucas Logistic Empresa Integrador S.A de C.V.";
     public static final String FREIGHTABLE = "Freightable S.A. de C.V.";
    
    public static final List<String> EMPRESAS = Arrays.asList(DESPACHOS,GRUPO,SERVICIOS,UNITRANS,KARGO,GRUCAS,FREIGHTABLE);
   
    // ------------------------------------------------------------------------
    // ENCUESTAS
    // -------------------------------------------------------------------------
    
    public static final String SATISFACCIÓN_DEL_CLIENTE = "ENCUESTA DE SATISFACCIÓN DEL CLIENTE";
    public static final String CADENA_SUMINISTRO = "AUTOEVALUACION EN LA CADENA DE SIMINISTRO A SOCIOS COMERCIALES GN-OEA-FR-001";
    public static final String CADENA_SUMINISTRO_ANUAL = "VERIFICACION ANUAL EN SEGURIDAD A SOCIOS COMERCIALES GN-OEA-FR-002";
    
    public static final List<String> ENCUESTAS = Arrays.asList(SATISFACCIÓN_DEL_CLIENTE,CADENA_SUMINISTRO,CADENA_SUMINISTRO_ANUAL);
    
    // ------------------------------------------------------------------------
    // SERVICIO BRINDADO
    // -------------------------------------------------------------------------
    
    
    public static final List<String> SERVICIOS_BRINDADOS = Arrays.asList("Exportación","Importación");
    
    // ------------------------------------------------------------------------- 
    // CIUDADES FRONTERIZAS
    // ------------------------------------------------------------------------- 
    public static final List<String> CIUDADES_FRONTERIZAS = Arrays.asList("MATAMOROS","NUEVO LAREDO");
    
    // ------------------------------------------------------------------------- 
    // IVAS
    // -------------------------------------------------------------------------     
    public static final String IVA_GENERAL = "16";
    public static final String IVA_FRONTERA = "08";
    public static final String IVA_TASA_0 = "0";
    public static final String RETENCION_IVA = "0.06";
    
    public static final List<String> LISTA_IVA_FRONTERA = Arrays.asList(IVA_FRONTERA,IVA_TASA_0);
    public static final List<String> LISTA_IVA_GENERAL = Arrays.asList(IVA_GENERAL,IVA_TASA_0);
    
    //--------------------------------------------------------------------------
    // CORREOS
    //--------------------------------------------------------------------------
    public static final String CORREO_TESORERIA = "rlopezm@grucas.com,dbalderas@grucas.com,lrodriguez@grucas.com";
    public static final String CORREO_PRUEBA = "ltello@grucas.com";
    
    
    public static final String TIPO_TEXT = "text";
    public static final String TIPO_IMAGE = "image";
    public static final String TIPO_PDF = "pdf";
    public static final String TIPO_EXCEL = "xlsx";

    
    public static final List<String> LISTA_TIPO = Arrays.asList(TIPO_TEXT,TIPO_IMAGE,TIPO_PDF,TIPO_EXCEL);
    
     //--------------------------------------------------------------------------
    // REGIONES DE CATALOGOS DE ORIGEN Y DESTINOS DE KPI CABOT
    //--------------------------------------------------------------------------
    
    public static final List<String> REGIONES = Arrays.asList("AFRICA","ASIA","CENTRO AMERICA","EUROPA","NORTE AMERICA","SUDAMERICA");
    
    public static final Integer A2020 = 2020;
    public static final List<Integer> YEAR = Arrays.asList(2020,2021,2022,2023,2024,2025,2026,2027,2028,2029,2030);
    
}
