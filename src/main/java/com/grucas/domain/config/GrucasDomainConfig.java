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
public class GrucasDomainConfig {

    private static final String ENV_GRUCAS = "catalogos";
    public static final Boolean DEBUG_GRUCAS = true;

    public static final Boolean DEBUG = true;
    
    public static String getEnvironmentGrucas() {
        return ENV_GRUCAS;
    }

}
