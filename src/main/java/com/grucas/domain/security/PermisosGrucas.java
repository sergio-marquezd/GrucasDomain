/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.security;

import com.rubik.logic.Permisos;

/**
 *
 * @author Grucas
 */
public class PermisosGrucas implements Permisos {

    public PermisosGrucas() {
    }

    @Override
    public String evaluarPermisos(String key, String permiso) {

        if (key.equals("1") && permiso.equals("1")) {
            return "ADMINISTRADOR";
        }

        switch (permiso) {
            case "0": {
                return "INVITADO";
            }
            case "1": {
                return "ADMINISTRADOR";
            }
            case "2": {
                return "REPORTES";
            }
            case "3": {
                return "COMPRAS";
            }
            case "4": {
                return "INVENTARIOS";
            }
            case "5": {
                return "RECURSOS HUMANOS";
            }
            case "6": {
                return "SUPERVISOR";
            }
            case "7": {
                return "CLIENTES";
            }
            case "8": {
                return "INGRESOS KARGO";
            }
            case "9": {
                return "OPERACIONES KVV";
            }
            case "10": {
                return "OPERACIONES UNITRANS";
            }
            default: {
                return "DESCONOCIDO";
            }
        }

    }

}
