/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.RolDepartamentoDAO;
import com.grucas.domain.model.RolDepartamento;
import java.util.List;

/**
 *
 * @author GrucasDev
 */
public class RolDepartamentoService {
    
    private RolDepartamento object;
    private List<RolDepartamento> objects;
    private RolDepartamentoDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;
    
     public RolDepartamentoService() {
        dao = new RolDepartamentoDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public RolDepartamento getObject() {
        return object;
    }

    public void setObject(RolDepartamento object) {
        this.object = object;
    }

    public List<RolDepartamento> getObjects() {
        return objects;
    }

    public void setObjects(List<RolDepartamento> objects) {
        this.objects = objects;
    }

    public RolDepartamentoDAO getDao() {
        return dao;
    }

    public void setDao(RolDepartamentoDAO dao) {
        this.dao = dao;
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
    
     public Integer getMaxID(){
        dao.getRolDepartamentoID();
        return dao.getId();
    }
    
    public void getRolDepartamento(String where, String group, String order){

        dao.getRolDepartamento(where, group, order);

        setOk(dao.getOk());

        if(getOk()){

            objects = dao.getObjects();
            total_result = objects.size();

            if(!objects.isEmpty()){

                if(objects.size()==1){
                    object = objects.get(0);
                }

                notification = "Informacion cargada correctamente.";
            } else {
                notification = "No se encontraron registros dados de alta.";
            }

        }else{
            notification = "Ha ocurrido un error al obtener la informacion de la base de datos.";
        }

    }
}
