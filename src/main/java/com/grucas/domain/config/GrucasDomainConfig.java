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

    public static final String PERFIL_ADMINISTRADOR = "ADMINISTRADOR";
    public static final String PERFIL_COMPRAS = "COMPRAS";
    public static final String PERFIL_REQUISICIONES = "REQUISICIONES";
    
    public static final String ESTADO_TODOS = "TODOS";
    public static final String ESTADO_DOCUMENTO_PRE_ELABORADO = "PRE ELABORADO";
    public static final String ESTADO_DOCUMENTO_ENPROCESO = "EN PROCESO";
    public static final String ESTADO_DOCUMENTO_PENDIENTE = "PENDIENTE";
    public static final String ESTADO_DOCUMENTO_TERMINADO = "TERMINADO";
    public static final String ESTADO_CANCELADO = "CANCELADO";
    public static final String ESTADO_OC = "OC";
    public static final String DOCUMENTO_REQUISICION = "REQUISICION";
    public static final String DOCUMENTO_ORDEN_DE_COMPRA = "ORDEN DE COMPRA";
    
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

    public static final List<String> UNIDAD_MEDIDA = Arrays.asList(MEDIDA_BOLSA,MEDIDA_BOTE,MEDIDA_BULTO,MEDIDA_CAJA,MEDIDA_CARTON,MEDIDA_CONTENEDOR,MEDIDA_COSTAL,MEDIDA_CUBETA,MEDIDA_LATA,MEDIDA_PALLETA,MEDIDA_PAQUETE,MEDIDA_PIEZA,MEDIDA_ROLLO,MEDIDA_SACO,MEDIDA_TANQUE);

    public static final List<String> ESTADOS_DOC = Arrays.asList(ESTADO_TODOS, ESTADO_DOCUMENTO_PRE_ELABORADO, ESTADO_DOCUMENTO_ENPROCESO, ESTADO_OC, ESTADO_CANCELADO);
   
    public static final List<String> UNIDAD = Arrays.asList("CONSORCIO MALLORCA","DAC AEROPUERTO","DAC ALTAMIRA","DAC HIDALGO","DAC LAZARO","DAC MANZANILLO","DAC MATAMOROS","DAC MEXICO","DAC NUEVO LAREDO","DAC TAMPICO","DAC VERACRUZ","DAC GUADALAJARA");
}


