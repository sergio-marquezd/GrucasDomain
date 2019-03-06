/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.EncuestaBaseDAO;
import com.rubik.Base.EncuestaBase;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class EncuestaBaseService {
    
    private EncuestaBase object;
    private List<EncuestaBase> objects;
    private EncuestaBaseDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public EncuestaBaseService() {
        dao = new EncuestaBaseDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public EncuestaBaseService(String env) {
        dao = new EncuestaBaseDAO(env);
    }

    public EncuestaBase getObject() {
        return object;
    }

    public void setObject(EncuestaBase object) {
        this.object = object;
    }

    public List<EncuestaBase> getObjects() {
        return objects;
    }

    public void setObjects(List<EncuestaBase> objects) {
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

    public void EncuestaBaseInsert(EncuestaBase encuestabase) {
        object = encuestabase;
        dao.EncuestaBaseInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "EncuestaBase " + encuestabase.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. EncuestaBase " +encuestabase.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void EncuestaBaseUpdate(EncuestaBase encuestabase){
        object = encuestabase;
        dao.EncuestaBaseUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "EncuestaBase " + encuestabase.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. EncuestaBase " + encuestabase.getId();
        }
    }

    public void EncuestaBaseDelete(EncuestaBase encuestabase){
        object = encuestabase;
        dao.EncuestaBaseDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "EncuestaBase "+ encuestabase.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar EncuestaBase " + encuestabase.getId();
        }
    }

    public void getEncuestaBase(String where, String group, String order){

        dao.getEncuestaBase(where, group, order);

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
        dao.getEncuestaBaseID();
        return dao.getId();
    }

    public void getOneEncuestaBase(String where){

        dao.getOneEncuestaBase(where);

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