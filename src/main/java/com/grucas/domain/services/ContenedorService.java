/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.ContenedorDAO;
import com.grucas.domain.model.Contenedor;
import java.util.List;

/**
 *
 * @author GrucasDev
 */
public class ContenedorService {
    
    private Contenedor object;
    private List<Contenedor> objects;
    private ContenedorDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;
    
     public ContenedorService() {
        dao = new ContenedorDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public Contenedor getObject() {
        return object;
    }

    public void setObject(Contenedor object) {
        this.object = object;
    }

    public List<Contenedor> getObjects() {
        return objects;
    }

    public void setObjects(List<Contenedor> objects) {
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
    
     public void ContenedorInsert(Contenedor contenedor) {
        object = contenedor;
        dao.ContenedorInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Contenedor " + contenedor.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar el contenedor " +contenedor.getId()+" no almacenado(a) en la base de datos.";
        }
    }
     
     
    public void getContenedor(String where, String group, String order){

        dao.getContenedor(where, group, order);

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
    
    public void getOneContenedor(String where){

        dao.getOneContenedor(where);

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
    
     public void ContenedorDelete(Contenedor contenedor){
        object = contenedor;
        dao.ContenedorDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Contenedor "+ contenedor.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar contenedor " + contenedor.getId();
        }
    }
     
     public void ContenedorUpdate(Contenedor contenedor){
        object = contenedor;
        dao.ContenedorUpdate(object);
        
        // modificar usuario

        setOk(dao.getOk());

        if(getOk()){
            notification = "Contenedor " +contenedor.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar el contenedor " + contenedor.getId();
        }
    }
    
}
