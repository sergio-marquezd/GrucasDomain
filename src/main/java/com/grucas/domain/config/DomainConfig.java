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
public class DomainConfig {

    private static final String ENV = "catalogos";
    public static final Boolean DEBUG = true;

    public static String getEnvironment() {
        return ENV;
    }

}
