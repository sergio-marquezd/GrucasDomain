/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.ContenedorOperacionesDAO;
import com.grucas.domain.model.ContenedorOperaciones;
import com.rubik.Base.ObjectBase;
import java.util.List;

/**
 *
 * @author GrucasDev
 */
public class ContenedorOperacionesService {
    
    private ContenedorOperaciones object;
    private List<ContenedorOperaciones> objects;
    private ContenedorOperacionesDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;
    
     public ContenedorOperacionesService() {
        dao = new ContenedorOperacionesDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public ContenedorOperaciones getObject() {
        return object;
    }

    public void setObject(ContenedorOperaciones object) {
        this.object = object;
    }

    public List<ContenedorOperaciones> getObjects() {
        return objects;
    }

    public void setObjects(List<ContenedorOperaciones> objects) {
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
    
    public void ContenedorOperacionesInsert(ContenedorOperaciones contenedorOp) {
        object = contenedorOp;
        dao.ContenedorOperacionesInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Buque " + contenedorOp.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Buque " +contenedorOp.getId()+" no almacenado(a) en la base de datos.";
        }
    }
    
    public void getContenedorOperaciones(String where, String group, String order){

        dao.getContenedorOperaciones(where, group, order);

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
    
    
     public void getOneContenedorOperaciones(String where){

        dao.getOneContenedorOperaciones(where);

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
     
     
    public void ContenedorOperacionesDelete(ContenedorOperaciones contenedorop){
        object = contenedorop;
        dao.ContenedorOperacionesDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Buque "+ contenedorop.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Buque " + contenedorop.getId();
        }
    }
    
     public void ContenedorOperacionesUpdate(ContenedorOperaciones contenedorop){
        object = contenedorop;
        dao.ContenedorOperacionesUpdate(object);
        
        // modificar usuario

        setOk(dao.getOk());

        if(getOk()){
            notification = "Buque " +contenedorop.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Buque " + contenedorop.getId();
        }
    }
    
     
}
