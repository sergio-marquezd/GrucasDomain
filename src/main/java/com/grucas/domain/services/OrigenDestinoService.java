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
import com.grucas.domain.dao.OrigenDestinoDAO;
import com.grucas.domain.model.OrigenDestino;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class OrigenDestinoService {
    
    private OrigenDestino object;
    private List<OrigenDestino> objects;
    private OrigenDestinoDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public OrigenDestinoService() {
        dao = new OrigenDestinoDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public OrigenDestino getObject() {
        return object;
    }

    public void setObject(OrigenDestino object) {
        this.object = object;
    }

    public List<OrigenDestino> getObjects() {
        return objects;
    }

    public void setObjects(List<OrigenDestino> objects) {
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

    public void OrigenDestinoInsert(OrigenDestino origendestino) {
        object = origendestino;
        dao.OrigenDestinoInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "OrigenDestino " + origendestino.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. OrigenDestino " +origendestino.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void OrigenDestinoUpdate(OrigenDestino origendestino){
        object = origendestino;
        dao.OrigenDestinoUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "OrigenDestino " + origendestino.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. OrigenDestino " + origendestino.getId();
        }
    }

    public void OrigenDestinoDelete(OrigenDestino origendestino){
        object = origendestino;
        dao.OrigenDestinoDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "OrigenDestino "+ origendestino.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar OrigenDestino " + origendestino.getId();
        }
    }

    public void getOrigenDestino(String where, String group, String order){

        dao.getOrigenDestino(where, group, order);

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
        dao.getOrigenDestinoID();
        return dao.getId();
    }

}