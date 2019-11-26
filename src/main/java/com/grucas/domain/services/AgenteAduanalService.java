/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.AgenteAduanalDAO;
import com.grucas.domain.model.AgenteAduanal;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class AgenteAduanalService {
    
    private AgenteAduanal object;
    private List<AgenteAduanal> objects;
    private AgenteAduanalDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public AgenteAduanalService() {
        dao = new AgenteAduanalDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public AgenteAduanalService(String env) {
        dao = new AgenteAduanalDAO(env);
    }

    public AgenteAduanal getObject() {
        return object;
    }

    public void setObject(AgenteAduanal object) {
        this.object = object;
    }

    public List<AgenteAduanal> getObjects() {
        return objects;
    }

    public void setObjects(List<AgenteAduanal> objects) {
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

    public void AgenteAduanalInsert(AgenteAduanal agenteaduanal) {
        object = agenteaduanal;
        dao.AgenteAduanalInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "AgenteAduanal " + agenteaduanal.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. AgenteAduanal " +agenteaduanal.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void AgenteAduanalUpdate(AgenteAduanal agenteaduanal){
        object = agenteaduanal;
        dao.AgenteAduanalUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "AgenteAduanal " + agenteaduanal.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. AgenteAduanal " + agenteaduanal.getId();
        }
    }

    public void AgenteAduanalDelete(AgenteAduanal agenteaduanal){
        object = agenteaduanal;
        dao.AgenteAduanalDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "AgenteAduanal "+ agenteaduanal.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar AgenteAduanal " + agenteaduanal.getId();
        }
    }

    public void getAgenteAduanal(String where, String group, String order){

        dao.getAgenteAduanal(where, group, order);

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
        dao.getAgenteAduanalID();
        return dao.getId();
    }

    public void getOneAgenteAduanal(String where){

        dao.getOneAgenteAduanal(where);

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