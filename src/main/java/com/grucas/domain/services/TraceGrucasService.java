/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.TraceGrucasDAO;
import com.grucas.domain.model.TraceGrucas;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class TraceGrucasService {
    
    private TraceGrucas object;
    private List<TraceGrucas> objects;
    private TraceGrucasDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public TraceGrucasService() {
        dao = new TraceGrucasDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public TraceGrucasService(String env) {
        dao = new TraceGrucasDAO(env);
    }

    public TraceGrucas getObject() {
        return object;
    }

    public void setObject(TraceGrucas object) {
        this.object = object;
    }

    public List<TraceGrucas> getObjects() {
        return objects;
    }

    public void setObjects(List<TraceGrucas> objects) {
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

    public void TraceGrucasInsert(TraceGrucas tracegrucas) {
        object = tracegrucas;
        dao.TraceGrucasInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "TraceGrucas " + tracegrucas.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. TraceGrucas " +tracegrucas.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void TraceGrucasUpdate(TraceGrucas tracegrucas){
        object = tracegrucas;
        dao.TraceGrucasUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "TraceGrucas " + tracegrucas.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. TraceGrucas " + tracegrucas.getId();
        }
    }

    public void TraceGrucasDelete(TraceGrucas tracegrucas){
        object = tracegrucas;
        dao.TraceGrucasDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "TraceGrucas "+ tracegrucas.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar TraceGrucas " + tracegrucas.getId();
        }
    }

    public void getTraceGrucas(String where, String group, String order){

        dao.getTraceGrucas(where, group, order);

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
        dao.getTraceGrucasID();
        return dao.getId();
    }

    public void getOneTraceGrucas(String where){

        dao.getOneTraceGrucas(where);

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