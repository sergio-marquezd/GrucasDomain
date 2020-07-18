/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.model;

/**
 *
 * @author GrucasDev
 */
public class RolDepartamento {
    
    Integer id;
    String rol_depto;
    String  folder;
    
    public RolDepartamento(){
        id=0;
        rol_depto="";
        folder="";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRol_depto() {
        return rol_depto;
    }

    public void setRol_depto(String rol_depto) {
        this.rol_depto = rol_depto;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }
    
    
    
}
