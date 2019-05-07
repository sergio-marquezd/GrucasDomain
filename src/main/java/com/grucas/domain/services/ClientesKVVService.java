/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.ClientesKVVDAO;
import com.grucas.domain.model.ClientesKVV;
import java.util.List;

/**
 *
 * @author User
 */
public class ClientesKVVService {
     private ClientesKVV object;
    private List<ClientesKVV> objects;
    private ClientesKVVDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public ClientesKVVService() {
        dao = new ClientesKVVDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public ClientesKVV getObject() {
        return object;
    }

    public void setObject(ClientesKVV object) {
        this.object = object;
    }

    public List<ClientesKVV> getObjects() {
        return objects;
    }

    public void setObjects(List<ClientesKVV> objects) {
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

    public void ClientesKVVInsert(ClientesKVV clienteskvv) {
        object = clienteskvv;
        dao.ClientesKVVInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "ClientesKVV " + clienteskvv.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. ClientesKVV " +clienteskvv.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void ClientesKVVUpdate(ClientesKVV clienteskvv){
        object = clienteskvv;
        dao.ClientesKVVUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "ClientesKVV " + clienteskvv.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. ClientesKVV " + clienteskvv.getId();
        }
    }

    public void ClientesKVVDelete(ClientesKVV clienteskvv){
        object = clienteskvv;
        dao.ClientesKVVDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "ClientesKVV "+ clienteskvv.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar ClientesKVV " + clienteskvv.getId();
        }
    }

    public void getClientesKVV(String where, String group, String order){

        dao.getClientesKVV(where, group, order);

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
        dao.getClientesKVVID();
        return dao.getId();
    }

    public void getOneClientesKVV(String where){

        dao.getOneClientesKVV(where);

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
