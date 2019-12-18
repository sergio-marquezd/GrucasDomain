/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.AduanaDAO;
import com.grucas.domain.model.Aduana;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class AduanaService {
    
    private Aduana object;
    private List<Aduana> objects;
    private AduanaDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public AduanaService() {
        dao = new AduanaDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public AduanaService(String env) {
        dao = new AduanaDAO(env);
    }

    public Aduana getObject() {
        return object;
    }

    public void setObject(Aduana object) {
        this.object = object;
    }

    public List<Aduana> getObjects() {
        return objects;
    }

    public void setObjects(List<Aduana> objects) {
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

    public void AduanaInsert(Aduana aduana) {
        object = aduana;
        dao.AduanaInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Aduana " + aduana.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Aduana " +aduana.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void AduanaUpdate(Aduana aduana){
        object = aduana;
        dao.AduanaUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Aduana " + aduana.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Aduana " + aduana.getId();
        }
    }

    public void AduanaDelete(Aduana aduana){
        object = aduana;
        dao.AduanaDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Aduana "+ aduana.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Aduana " + aduana.getId();
        }
    }

    public void getAduana(String where, String group, String order){

        dao.getAduana(where, group, order);

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
        dao.getAduanaID();
        return dao.getId();
    }

    public void getOneAduana(String where){

        dao.getOneAduana(where);

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
    
    public void getAduanaPorCliente(Integer cliente_id){
        dao.getAduanaPorCliente(cliente_id);

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

}