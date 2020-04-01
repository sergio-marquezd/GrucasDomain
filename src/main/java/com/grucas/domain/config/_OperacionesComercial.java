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
 * @author User
 */
public class _OperacionesComercial {
    
    public static final String TIPO_GIRO_ADUANAL_MEXICANO = "ADUANAL MEXICANO";
    public static final String TIPO_GIRO_ADUANAL_AMERICANO = "ADUANAL AMERICANO";
    public static final String TIPO_GIRO_ALMACENAJE_MEXICANO = "ALMACENAJE MEXICANO";
    public static final String TIPO_GIRO_ALMACENAJE_AMERICANO = "ALMACENAJE AMERICANO";
    public static final String TIPO_GIRO_TRANSPORTE = "TRANSPORTE";
    
    public static final List<String> LISTA_TIPO_GIRO = 
            Arrays.asList(TIPO_GIRO_ADUANAL_MEXICANO, 
                    TIPO_GIRO_ADUANAL_AMERICANO, 
//                    TIPO_GIRO_ALMACENAJE_MEXICANO,
                    TIPO_GIRO_ALMACENAJE_AMERICANO);
    
    public static final String OPERACION_TIPO_IMPORATACION = "IMPORTACION";
    public static final String OPERACION_TIPO_EXPORATACION = "EXPORTACION";
    
    public static final String OPERACION_CLASIFICACION_AEROPUERTO = "AEREO";
    public static final String OPERACION_CLASIFICACION_MARITIMO = "MARITIMO";
    public static final String OPERACION_CLASIFICACION_FRONTERA = "FRONTERA";
    public static final String OPERACION_CLASIFICACION_TERRESTRE = "TERRESTRE";
    
    public static final List<String> OPERACIONES = 
            Arrays.asList(OPERACION_CLASIFICACION_AEROPUERTO, 
                    OPERACION_CLASIFICACION_MARITIMO, 
                    OPERACION_CLASIFICACION_FRONTERA);
        
}
