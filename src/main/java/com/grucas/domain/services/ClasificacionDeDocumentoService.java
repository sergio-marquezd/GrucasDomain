/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.ClasificacionDeDocumentoDAO;
import com.grucas.domain.model.ClasificacionDeDocumento;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class ClasificacionDeDocumentoService {
    
    private ClasificacionDeDocumento object;
    private List<ClasificacionDeDocumento> objects;
    private ClasificacionDeDocumentoDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public ClasificacionDeDocumentoService() {
        dao = new ClasificacionDeDocumentoDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public ClasificacionDeDocumentoService(String env) {
        dao = new ClasificacionDeDocumentoDAO(env);
    }

    public ClasificacionDeDocumento getObject() {
        return object;
    }

    public void setObject(ClasificacionDeDocumento object) {
        this.object = object;
    }

    public List<ClasificacionDeDocumento> getObjects() {
        return objects;
    }

    public void setObjects(List<ClasificacionDeDocumento> objects) {
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

    public void ClasificacionDeDocumentoInsert(ClasificacionDeDocumento clasificaciondedocumento) {
        object = clasificaciondedocumento;
        dao.ClasificacionDeDocumentoInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "ClasificacionDeDocumento " + clasificaciondedocumento.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. ClasificacionDeDocumento " +clasificaciondedocumento.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void ClasificacionDeDocumentoUpdate(ClasificacionDeDocumento clasificaciondedocumento){
        object = clasificaciondedocumento;
        dao.ClasificacionDeDocumentoUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "ClasificacionDeDocumento " + clasificaciondedocumento.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. ClasificacionDeDocumento " + clasificaciondedocumento.getId();
        }
    }

    public void ClasificacionDeDocumentoDelete(ClasificacionDeDocumento clasificaciondedocumento){
        object = clasificaciondedocumento;
        dao.ClasificacionDeDocumentoDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "ClasificacionDeDocumento "+ clasificaciondedocumento.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar ClasificacionDeDocumento " + clasificaciondedocumento.getId();
        }
    }

    public void getClasificacionDeDocumento(String where, String group, String order){

        dao.getClasificacionDeDocumento(where, group, order);

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
        dao.getClasificacionDeDocumentoID();
        return dao.getId();
    }

    public void getOneClasificacionDeDocumento(String where){

        dao.getOneClasificacionDeDocumento(where);

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
