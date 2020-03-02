/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

import com.rubik.Base.ObjectBase;

/**
 *
 * @author GrucasDev
 */
public class KPI extends ObjectBase{
    Integer total;
    Integer cumplen;
    Integer exitoso;
    
    public KPI(){
        total =0;
        cumplen =0;
        exitoso=0;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCumplen() {
        return cumplen;
    }

    public void setCumplen(Integer cumplen) {
        this.cumplen = cumplen;
    }

    public Integer getExitoso() {
        return exitoso;
    }

    public void setExitoso(Integer exitoso) {
        this.exitoso = exitoso;
    }
    
    
}
