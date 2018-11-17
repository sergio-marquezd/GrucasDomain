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

    private static final String ENV_GRUCAS = "catalogos";
    public static final Boolean DEBUG_GRUCAS = true;

    public static final Boolean DEBUG = true;
    
    public static String getEnvironmentGrucas() {
        return ENV_GRUCAS;
    }

    // ------------------------------------------------------------------------- 
    // Roles del sistema 
    // -------------------------------------------------------------------------
    public static final String PERFIL_ADMINISTRADOR = "ADMINISTRADOR";
    public static final String PERFIL_COMPRAS = "COMPRAS";
    public static final String PERFIL_REQUISICIONES = "REQUISICIONES";

    // ------------------------------------------------------------------------- 
    // Estado de documentos
    // -------------------------------------------------------------------------    
    public static final String ESTADO_TODOS = "TODOS";
    public static final String ESTADO_DOCUMENTO_PRE_ELABORADO = "PRE ELABORADO";
    public static final String ESTADO_DOCUMENTO_ENPROCESO = "EN PROCESO";
    public static final String ESTADO_DOCUMENTO_PENDIENTE = "PENDIENTE";
    public static final String ESTADO_DOCUMENTO_TERMINADO = "TERMINADO";
    public static final String ESTADO_CANCELADO = "CANCELADO";
    public static final String ESTADO_OC_TERMINADO = "OC";
    public static final String DOCUMENTO_REQUISICION = "REQUISICION";
    public static final String DOCUMENTO_ORDEN_DE_COMPRA = "ORDEN DE COMPRA";
    
    public static final List<String> ESTADOS_REQUISICION = Arrays.asList(ESTADO_TODOS, ESTADO_DOCUMENTO_PRE_ELABORADO, ESTADO_CANCELADO, ESTADO_DOCUMENTO_TERMINADO, ESTADO_OC_TERMINADO);
    public static final List<String> ESTADOS_OC = Arrays.asList(ESTADO_TODOS, ESTADO_DOCUMENTO_PRE_ELABORADO, ESTADO_DOCUMENTO_TERMINADO, ESTADO_CANCELADO);
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
    // Configuraciones y usuarios
    // ------------------------------------------------------------------------- 
    public static final String USUARIO_SUPER = "FULLACCESS";
    public static final String USUARIO_EMPLEADO = "COLABORADOR";
    public static final String USUARIO_CLIENTE = "CLIENTE";
    public static final List<String> USUARIO_TIPOS = Arrays.asList(USUARIO_EMPLEADO,USUARIO_CLIENTE,USUARIO_SUPER);
    
    // -------------------------------------------------------------------------
    // Metodo de Pago
    // -------------------------------------------------------------------------
    
    public static final String PAGO_CONTADO = "CONTADO";
    public static final String PAGO_CRED_15DIAS = "CREDITO 15 DIAS";
    public static final String PAGO_CRED_30DIAS = "CREDITO 30 DIAS";
    public static final String PAGO_CRED_60DIAS = "CREDITO 60 DIAS";
    
    public static final List<String>METODO_PAGO =Arrays.asList(PAGO_CONTADO,PAGO_CRED_15DIAS,PAGO_CRED_30DIAS,PAGO_CRED_60DIAS);
  
    
}