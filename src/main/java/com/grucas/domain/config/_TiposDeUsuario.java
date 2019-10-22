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
public class _TiposDeUsuario {
    
    // ------------------------------------------------------------------------- 
    // Configuraciones y usuarios
    // ------------------------------------------------------------------------- 
    public static final String USUARIO_SUPER = "FULLACCESS";
    public static final String USUARIO_EMPLEADO = "COLABORADOR";
    public static final String USUARIO_CLIENTE = "CLIENTE";
    public static final List<String> USUARIO_TIPOS = Arrays.asList(USUARIO_EMPLEADO,USUARIO_CLIENTE,USUARIO_SUPER);
    
}
