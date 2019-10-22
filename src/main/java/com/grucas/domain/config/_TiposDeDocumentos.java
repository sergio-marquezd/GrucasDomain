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
public class _TiposDeDocumentos {
    
    public static final String DOCUMENTO_REQUISICION = "REQUISICION";
    public static final String DOCUMENTO_ORDEN_DE_COMPRA = "ORDEN DE COMPRA";
    public static final String DOCUMENTO_COTIZACION_COMPRA = "COTIZACION COMPRA";
    public static final String DOCUMENTO_SOLICITUD_VGM = "SOLICITUD VGM";
    public static final String DOCUMENTO_TICKET_DE_SOPORTE = "TICKET DE SOPORTE";
    public static final String DOCUMENTO_ANEXO_DE_SOPORTE = "ANEXO DE SOPORTE";
    public static final String DOCUMENTO_RESPONSIVA_TI = "RESPONSIVA";
    
    public static final String DOCUMENTO_SOLICITUD_DE_PREVIO = "RESPONSIVA";
    
    public static final List<String> DOCUMENTOS = 
            Arrays.asList(
                    DOCUMENTO_REQUISICION, 
                    DOCUMENTO_ORDEN_DE_COMPRA, 
                    DOCUMENTO_COTIZACION_COMPRA, 
                    DOCUMENTO_SOLICITUD_VGM, 
                    DOCUMENTO_TICKET_DE_SOPORTE);
    
}