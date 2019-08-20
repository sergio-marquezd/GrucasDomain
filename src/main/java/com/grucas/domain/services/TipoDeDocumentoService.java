/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.TipoDeDocumentoDAO;
import com.grucas.domain.model.TipoDeDocumento;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class TipoDeDocumentoService {
    
    private TipoDeDocumento object;
    private List<TipoDeDocumento> objects;
    private TipoDeDocumentoDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public TipoDeDocumentoService() {
        dao = new TipoDeDocumentoDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public TipoDeDocumentoService(String env) {
        dao = new TipoDeDocumentoDAO(env);
    }

    public TipoDeDocumento getObject() {
        return object;
    }

    public void setObject(TipoDeDocumento object) {
        this.object = object;
    }

    public List<TipoDeDocumento> getObjects() {
        return objects;
    }

    public void setObjects(List<TipoDeDocumento> objects) {
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

    public void TipoDeDocumentoInsert(TipoDeDocumento tipodedocumento) {
        object = tipodedocumento;
        dao.TipoDeDocumentoInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "TipoDeDocumento " + tipodedocumento.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. TipoDeDocumento " +tipodedocumento.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void TipoDeDocumentoUpdate(TipoDeDocumento tipodedocumento){
        object = tipodedocumento;
        dao.TipoDeDocumentoUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "TipoDeDocumento " + tipodedocumento.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. TipoDeDocumento " + tipodedocumento.getId();
        }
    }

    public void TipoDeDocumentoDelete(TipoDeDocumento tipodedocumento){
        object = tipodedocumento;
        dao.TipoDeDocumentoDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "TipoDeDocumento "+ tipodedocumento.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar TipoDeDocumento " + tipodedocumento.getId();
        }
    }

    public void getTipoDeDocumento(String where, String group, String order){

        dao.getTipoDeDocumento(where, group, order);

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
        dao.getTipoDeDocumentoID();
        return dao.getId();
    }

    public void getOneTipoDeDocumento(String where){

        dao.getOneTipoDeDocumento(where);

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