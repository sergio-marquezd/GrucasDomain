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
import com.grucas.domain.config.DomainConfig;
import com.grucas.domain.dao.SistemaDAO;
import com.grucas.domain.model.Sistema;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class SistemaService {
    
    private Sistema object;
    private List<Sistema> objects;
    private SistemaDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public SistemaService() {
        dao = new SistemaDAO(DomainConfig.getEnvironment());
    }

    public Sistema getObject() {
        return object;
    }

    public void setObject(Sistema object) {
        this.object = object;
    }

    public List<Sistema> getObjects() {
        return objects;
    }

    public void setObjects(List<Sistema> objects) {
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

    public void SistemaInsert(Sistema sistema) {
        object = sistema;
        dao.SistemaInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Sistema " + sistema.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Sistema " +sistema.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void SistemaUpdate(Sistema sistema){
        object = sistema;
        dao.SistemaUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Sistema " + sistema.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Sistema " + sistema.getId();
        }
    }

    public void SistemaDelete(Sistema sistema){
        object = sistema;
        dao.SistemaDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Sistema "+ sistema.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Sistema " + sistema.getId();
        }
    }

    public void getSistema(String where, String group, String order){

        dao.getSistema(where, group, order);

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
    
    public void getSistemaByUser(Integer usuario_id){

        dao.getSistemaByUser(usuario_id);

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
        dao.getSistemaID();
        return dao.getId();
    }

}