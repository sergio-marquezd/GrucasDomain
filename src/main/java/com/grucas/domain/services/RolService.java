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
import com.grucas.domain.dao.RolDAO;
import com.grucas.domain.model.Rol;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class RolService {
    
    private Rol object;
    private List<Rol> objects;
    private RolDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public RolService() {
        dao = new RolDAO(DomainConfig.getEnvironmentGrucas());
    }

    public Rol getObject() {
        return object;
    }

    public void setObject(Rol object) {
        this.object = object;
    }

    public List<Rol> getObjects() {
        return objects;
    }

    public void setObjects(List<Rol> objects) {
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

    public void RolInsert(Rol rol) {
        object = rol;
        dao.RolInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Rol " + rol.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Rol " +rol.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void RolUpdate(Rol rol){
        object = rol;
        dao.RolUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Rol " + rol.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Rol " + rol.getId();
        }
    }

    public void RolDelete(Rol rol){
        object = rol;
        dao.RolDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Rol "+ rol.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Rol " + rol.getId();
        }
    }

    public void getRol(String where, String group, String order){

        dao.getRol(where, group, order);

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
        dao.getRolID();
        return dao.getId();
    }

}