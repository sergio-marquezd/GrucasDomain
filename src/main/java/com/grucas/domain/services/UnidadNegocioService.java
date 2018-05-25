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
import com.grucas.domain.dao.UnidadNegocioDAO;
import com.grucas.domain.model.UnidadNegocio;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class UnidadNegocioService {
    
    private UnidadNegocio object;
    private List<UnidadNegocio> objects;
    private UnidadNegocioDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public UnidadNegocioService() {
        dao = new UnidadNegocioDAO(DomainConfig.getEnvironmentGrucas());
    }

    public UnidadNegocio getObject() {
        return object;
    }

    public void setObject(UnidadNegocio object) {
        this.object = object;
    }

    public List<UnidadNegocio> getObjects() {
        return objects;
    }

    public void setObjects(List<UnidadNegocio> objects) {
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

    public void UnidadNegocioInsert(UnidadNegocio unidadnegocio) {
        object = unidadnegocio;
        dao.UnidadNegocioInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "UnidadNegocio " + unidadnegocio.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. UnidadNegocio " +unidadnegocio.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void UnidadNegocioUpdate(UnidadNegocio unidadnegocio){
        object = unidadnegocio;
        dao.UnidadNegocioUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "UnidadNegocio " + unidadnegocio.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. UnidadNegocio " + unidadnegocio.getId();
        }
    }

    public void UnidadNegocioDelete(UnidadNegocio unidadnegocio){
        object = unidadnegocio;
        dao.UnidadNegocioDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "UnidadNegocio "+ unidadnegocio.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar UnidadNegocio " + unidadnegocio.getId();
        }
    }

    public void getUnidadNegocio(String where, String group, String order){

        dao.getUnidadNegocio(where, group, order);

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
        dao.getUnidadNegocioID();
        return dao.getId();
    }

}