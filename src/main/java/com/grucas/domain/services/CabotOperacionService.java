/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.CabotOperacionDAO;
import com.grucas.domain.model.CabotOperacion;
import com.rubik.Base.ObjectBase;
import java.util.List;

/**
 *
 * @author GrucasDev
 */
public class CabotOperacionService {
    
    private CabotOperacion object;
    private List<CabotOperacion> objects;
    private CabotOperacionDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;
    
     public CabotOperacionService() {
        dao = new CabotOperacionDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public CabotOperacion getObject() {
        return object;
    }

    public void setObject(CabotOperacion object) {
        this.object = object;
    }

    public List<CabotOperacion> getObjects() {
        return objects;
    }

    public void setObjects(List<CabotOperacion> objects) {
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
    
    public void CabotOperacionInsert(CabotOperacion contenedorOp) {
        object = contenedorOp;
        dao.CabotOperacionInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Embarque " + contenedorOp.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Embarque " +contenedorOp.getId()+" no almacenado(a) en la base de datos.";
        }
    }
    
    public void getCabotOperacion(String where, String group, String order){

        dao.getCabotOperacion(where, group, order);

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
    
    
     public void getOneCabotOperacion(String where){

        dao.getOneCabotOperacion(where);

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
     
     
    public void CabotOperacionDelete(CabotOperacion contenedorop){
        object = contenedorop;
        dao.CabotOperacionDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Embarque "+ contenedorop.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Embarque " + contenedorop.getId();
        }
    }
    
     public void CabotOperacionUpdate(CabotOperacion contenedorop){
        object = contenedorop;
        dao.CabotOperacionUpdate(object);
        
        // modificar usuario

        setOk(dao.getOk());

        if(getOk()){
            notification = "Embarque " +contenedorop.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Embarque " + contenedorop.getId();
        }
    }
    
     
}
