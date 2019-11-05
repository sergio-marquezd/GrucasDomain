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
public class _Responsivas {
   
    public static final String CONTRATO_ARRENDAMIENTO = "ARRENDAMIENTO";
    public static final String CONTRATO_COMPRADO = "COMPRADO";
    public static final List<String> CONTRATO = Arrays.asList(CONTRATO_ARRENDAMIENTO, CONTRATO_COMPRADO);
    
    public static final String RESPONSIVA_NUEVA_ASIGNACION = "NUEVA ASIGNACION";
    public static final String RESPONSIVA_CAMBIO_MEJORA= "CAMBIO POR MEJORA DE REQUERIMIENTOS";
    public static final String RESPONSIVA_CAMBIO_GARANTIA = "CAMBIO POR GARANTIA";
    public static final List <String> RESPONSIVA_ASIGNACIONES = Arrays.asList(RESPONSIVA_NUEVA_ASIGNACION,RESPONSIVA_CAMBIO_MEJORA,RESPONSIVA_CAMBIO_GARANTIA);
}
