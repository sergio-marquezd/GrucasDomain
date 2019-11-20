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
import com.grucas.domain.dao.PuestoDAO;
import com.grucas.domain.model.Puesto;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class PuestoService {
    
    private Puesto object;
    private List<Puesto> objects;
    private PuestoDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public PuestoService() {
        dao = new PuestoDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public PuestoService(String env) {
        dao = new PuestoDAO(env);
    }

    public Puesto getObject() {
        return object;
    }

    public void setObject(Puesto object) {
        this.object = object;
    }

    public List<Puesto> getObjects() {
        return objects;
    }

    public void setObjects(List<Puesto> objects) {
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

    public void PuestoInsert(Puesto puesto) {
        object = puesto;
        dao.PuestoInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Puesto " + puesto.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Puesto " +puesto.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void PuestoUpdate(Puesto puesto){
        object = puesto;
        dao.PuestoUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Puesto " + puesto.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Puesto " + puesto.getId();
        }
    }

    public void PuestoDelete(Puesto puesto){
        object = puesto;
        dao.PuestoDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Puesto "+ puesto.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Puesto " + puesto.getId();
        }
    }

    public void getPuesto(String where, String group, String order){

        dao.getPuesto(where, group, order);

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
        dao.getPuestoID();
        return dao.getId();
    }

    public void getOnePuesto(String where){

        dao.getOnePuesto(where);

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