/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.clientes.cabot.domain;

import java.io.Serializable;

/**
 *
 * @author GRUCAS
 */
public class ReportKPICABOT implements Serializable {
 
    private Integer operaciones_totales;
    private Integer operaciones_ok;
    private Integer operaciones_fail;

    public ReportKPICABOT() {
    }

    public Integer getOperaciones_totales() {
        return operaciones_totales;
    }

    public void setOperaciones_totales(Integer operaciones_totales) {
        this.operaciones_totales = operaciones_totales;
    }

    public Integer getOperaciones_ok() {
        return operaciones_ok;
    }

    public void setOperaciones_ok(Integer operaciones_ok) {
        this.operaciones_ok = operaciones_ok;
    }

    public Integer getOperaciones_fail() {
        return operaciones_fail;
    }

    public void setOperaciones_fail(Integer operaciones_fail) {
        this.operaciones_fail = operaciones_fail;
    }

}