/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.config;

import com.grucas.domain.model.Departamento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GrucasDev
 */
public class _Departamentos {
    
    public static final Departamento RECURSOS_HUMANOS = new Departamento(1, "RECURSOS HUMANOS");
    public static final Departamento COMPRAS = new Departamento(2, "COMPRAS");
    public static final Departamento TECNOLOGIAS_DE_LA_INFORMACION = new Departamento(3, "TECNOLOGIAS DE LA INFORMACION");
    public static final Departamento OPERACIONES = new Departamento(4, "OPERACIONES");
    public static final Departamento ADMINISTRATIVO = new Departamento(5, "ADMINISTRATIVO");
    public static final Departamento LIMPIEZA = new Departamento(6, "LIMPIEZA");
    public static final Departamento COBRANZA = new Departamento(7, "COBRANZA");
    public static final Departamento ALTA_DE_CLIENTES = new Departamento(8, "ALTA DE CLIENTES");
    
    public static final List<Departamento> DEPARTAMENTOS = 
            new ArrayList<Departamento>(){{
                add(RECURSOS_HUMANOS);
                add(COMPRAS);
                add(TECNOLOGIAS_DE_LA_INFORMACION);
                add(OPERACIONES);
                add(ADMINISTRATIVO);
                add(LIMPIEZA);
                add(COBRANZA);
                add(ALTA_DE_CLIENTES);
            }};
    
}