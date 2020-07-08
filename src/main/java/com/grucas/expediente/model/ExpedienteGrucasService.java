/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.expediente.model;

import com.grucas.domain.config.GrucasDomainConfig;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class ExpedienteGrucasService {
    
    private ExpedienteGrucas object;
    private List<ExpedienteGrucas> objects;
    private ExpedienteGrucasDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public ExpedienteGrucasService() {
        dao = new ExpedienteGrucasDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public ExpedienteGrucasService(String env) {
        dao = new ExpedienteGrucasDAO(env);
    }

    public ExpedienteGrucas getObject() {
        return object;
    }

    public void setObject(ExpedienteGrucas object) {
        this.object = object;
    }

    public List<ExpedienteGrucas> getObjects() {
        return objects;
    }

    public void setObjects(List<ExpedienteGrucas> objects) {
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

    public void IndexableFileInsert(ExpedienteGrucas expediente) {
        object = expediente;
        dao.IndexableFileInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "IndexableFile " + expediente.getFilename() + " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. IndexableFile " + expediente.getFilename() + " no almacenado(a) en la base de datos.";
        }
    }

    public void IndexableFileDelete(ExpedienteGrucas expediente){
        object = expediente;
        dao.IndexableFileDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "IndexableFile " + expediente.getFilename() + " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar IndexableFile " + expediente.getId();
        }
    }

    public void getIndexableFile(String where, String group, String order){

        dao.getIndexableFile(where, group, order);

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