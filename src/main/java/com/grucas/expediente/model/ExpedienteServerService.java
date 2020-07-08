/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.expediente.model;

import com.grucas.domain.config.GrucasDomainConfig;


/**
 *
 * @author GRUCAS
 */
public class ExpedienteServerService {
    
    private ExpedienteServer object;
    private ExpedienteServerDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public ExpedienteServerService() {
        dao = new ExpedienteServerDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public ExpedienteServerService(String env) {
        dao = new ExpedienteServerDAO(env);
    }

    public ExpedienteServer getObject() {
        return object;
    }

    public void setObject(ExpedienteServer object) {
        this.object = object;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public Integer getTotal_result() {
        return total_result;
    }

    public void setTotal_result(Integer total_result) {
        this.total_result = total_result;
    }

    public void getServer(){
        dao.getServer();

        setOk(dao.getOk());

        if(getOk()){

            object = dao.getObject();
            total_result = 1;

            if(object != null){
                notification = "Informacion cargada correctamente.";
            } else {
                notification = "No se encontraron registros dados de alta.";
            }

        }else{
            notification = "Ha ocurrido un error al obtener la informacion de la base de datos.";
        }

    }
    
}