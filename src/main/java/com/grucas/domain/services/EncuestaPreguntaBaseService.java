/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.EncuestaPreguntaBaseDAO;
import com.rubik.Base.EncuestaPreguntaBase;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class EncuestaPreguntaBaseService {
    
    private EncuestaPreguntaBase object;
    private List<EncuestaPreguntaBase> objects;
    private EncuestaPreguntaBaseDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public EncuestaPreguntaBaseService() {
        dao = new EncuestaPreguntaBaseDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public EncuestaPreguntaBaseService(String env) {
        dao = new EncuestaPreguntaBaseDAO(env);
    }

    public EncuestaPreguntaBase getObject() {
        return object;
    }

    public void setObject(EncuestaPreguntaBase object) {
        this.object = object;
    }

    public List<EncuestaPreguntaBase> getObjects() {
        return objects;
    }

    public void setObjects(List<EncuestaPreguntaBase> objects) {
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

    public void EncuestaPreguntaBaseInsert(EncuestaPreguntaBase encuestapreguntabase) {
        object = encuestapreguntabase;
        dao.EncuestaPreguntaBaseInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "EncuestaPreguntaBase " + encuestapreguntabase.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. EncuestaPreguntaBase " +encuestapreguntabase.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void EncuestaPreguntaBaseUpdate(EncuestaPreguntaBase encuestapreguntabase){
        object = encuestapreguntabase;
        dao.EncuestaPreguntaBaseUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "EncuestaPreguntaBase " + encuestapreguntabase.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. EncuestaPreguntaBase " + encuestapreguntabase.getId();
        }
    }

    public void EncuestaPreguntaBaseDelete(EncuestaPreguntaBase encuestapreguntabase){
        object = encuestapreguntabase;
        dao.EncuestaPreguntaBaseDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "EncuestaPreguntaBase "+ encuestapreguntabase.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar EncuestaPreguntaBase " + encuestapreguntabase.getId();
        }
    }

    public void getEncuestaPreguntaBase(String where, String group, String order){

        dao.getEncuestaPreguntaBase(where, group, order);

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
        dao.getEncuestaPreguntaBaseID();
        return dao.getId();
    }

    public void getOneEncuestaPreguntaBase(String where){

        dao.getOneEncuestaPreguntaBase(where);

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