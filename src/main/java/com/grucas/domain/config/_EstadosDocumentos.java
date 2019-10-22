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
public class _EstadosDocumentos {
    
    public static final String ESTADO_TODOS = "TODOS";
    public static final String ESTADO_DOCUMENTO_PRE_ELABORADO = "PRE ELABORADO";
    public static final String ESTADO_DOCUMENTO_ENPROCESO = "EN PROCESO";
    public static final String ESTADO_DOCUMENTO_PENDIENTE = "PENDIENTE";
    public static final String ESTADO_DOCUMENTO_TERMINADO = "TERMINADO";
    public static final String ESTADO_CANCELADO = "CANCELADO";
    public static final String ESTADO_AUTORIZADO = "AUTORIZADO";
    public static final String ESTADO_OC_TERMINADO = "OC";
    
    public static final List<String> ESTADOS_REQUISICION = Arrays.asList(ESTADO_TODOS, ESTADO_DOCUMENTO_PRE_ELABORADO, ESTADO_CANCELADO, ESTADO_DOCUMENTO_TERMINADO, ESTADO_OC_TERMINADO);
    public static final List<String> ESTADOS_OC = Arrays.asList(ESTADO_TODOS, ESTADO_DOCUMENTO_PRE_ELABORADO, ESTADO_DOCUMENTO_TERMINADO, ESTADO_CANCELADO);
    public static final List<String> ESTADO_MONITOREO = Arrays.asList(ESTADO_TODOS, ESTADO_OC_TERMINADO, ESTADO_AUTORIZADO);
    public static final List<String> ESTADO_TICKET = Arrays.asList(ESTADO_DOCUMENTO_ENPROCESO,ESTADO_DOCUMENTO_TERMINADO,ESTADO_CANCELADO);
    
}
