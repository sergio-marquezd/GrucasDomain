/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.config;

/**
 *
 * @author GrucasDev
 */
public class _RolesDeUsuario {
    
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
    
    
    
    
    //ROLES DE USUARIO DEFINIDOS PARA SISTEMA GRUCAS EXTRANET [CODE APP: 1007]
    public static final String ROL_EJECUTIVO_ARCELOR = "EJECUTIVO ARCELOR";
    public static final String ROL_CLIETE_ARCELOR = "CLIENTE ARCELOR";
    public static final String ROL_CLIENTE_KARGO = "CLIENTE KARGO";
    public static final String ROL_EJECUTIVO_KARGO = "EJECUTIVO KARGO";
    
}
