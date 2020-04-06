/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

/**
 *
 * @author GrucasDev
 */

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.NavieraDAO;
import com.grucas.domain.model.Naviera;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class NavieraService {
    
    private Naviera object;
    private List<Naviera> objects;
    private NavieraDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public NavieraService() {
        dao = new NavieraDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public Naviera getObject() {
        return object;
    }

    public void setObject(Naviera object) {
        this.object = object;
    }

    public List<Naviera> getObjects() {
        return objects;
    }

    public void setObjects(List<Naviera> objects) {
        this.objects = objects;
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

    public void NavieraInsert(Naviera naviera) {
        object = naviera;
        dao.NavieraInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Naviera " + naviera.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Naviera " +naviera.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void NavieraUpdate(Naviera naviera){
        object = naviera;
        dao.NavieraUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Naviera " + naviera.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Naviera " + naviera.getId();
        }
    }

    public void NavieraDelete(Naviera naviera){
        object = naviera;
        dao.NavieraDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Naviera "+ naviera.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Naviera " + naviera.getId();
        }
    }

    public void getNaviera(String where, String group, String order){

        dao.getNaviera(where, group, order);

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

    public Integer getMaxID(){
        dao.getNavieraID();
        return dao.getId();
    }

}