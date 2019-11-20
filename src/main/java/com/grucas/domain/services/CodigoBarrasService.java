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
import com.grucas.domain.dao.CodigoBarrasDAO;
import com.grucas.domain.model.CodigoBarras;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class CodigoBarrasService {
    
    private CodigoBarras object;
    private List<CodigoBarras> objects;
    private CodigoBarrasDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public CodigoBarrasService() {
        dao = new CodigoBarrasDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public CodigoBarrasService(String env) {
        dao = new CodigoBarrasDAO(env);
    }

    public CodigoBarras getObject() {
        return object;
    }

    public void setObject(CodigoBarras object) {
        this.object = object;
    }

    public List<CodigoBarras> getObjects() {
        return objects;
    }

    public void setObjects(List<CodigoBarras> objects) {
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

    public void CodigoBarrasInsert(CodigoBarras codigobarras) {
        object = codigobarras;
        dao.CodigoBarrasInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "CodigoBarras " + codigobarras.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. CodigoBarras " +codigobarras.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void CodigoBarrasUpdate(CodigoBarras codigobarras){
        object = codigobarras;
        dao.CodigoBarrasUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "CodigoBarras " + codigobarras.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. CodigoBarras " + codigobarras.getId();
        }
    }

    public void CodigoBarrasDelete(CodigoBarras codigobarras){
        object = codigobarras;
        dao.CodigoBarrasDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "CodigoBarras "+ codigobarras.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar CodigoBarras " + codigobarras.getId();
        }
    }

    public void getCodigoBarras(String where, String group, String order){

        dao.getCodigoBarras(where, group, order);

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
        dao.getCodigoBarrasID();
        return dao.getId();
    }

    public void getOneCodigoBarras(String where){

        dao.getOneCodigoBarras(where);

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