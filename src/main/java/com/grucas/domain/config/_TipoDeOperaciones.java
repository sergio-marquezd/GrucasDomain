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
public class _TipoDeOperaciones {
    public static final String OPERACION_AEROPUERTO = "AERO";
    public static final String OPERACION_MARITIMO = "MARITIMO";
    public static final String OPERACION_FRONTERA = "FRONTERA";
    
    public static final List<String> OPERACIONES = 
            Arrays.asList(
                    OPERACION_AEROPUERTO, 
                    OPERACION_MARITIMO, 
                    OPERACION_FRONTERA);
        
}
