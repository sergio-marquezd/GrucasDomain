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
public class _EstadosEntidades {
    public static final String ESTADO_TODOS = "TODOS";
    public static final String ESTADO_PROSPECTO = "PROSPECTO";
    public static final String ESTADO_VIGENTE = "VIGENTE";
    public static final String ESTADO_INACTIVO = "INACTIVO";
    
    public static final List<String> ESTADOS_CLIENTE = Arrays.asList(ESTADO_TODOS,ESTADO_PROSPECTO,ESTADO_VIGENTE);
    
}