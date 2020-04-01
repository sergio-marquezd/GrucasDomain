/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.ClienteAduanasDAO;
import com.grucas.domain.model.ClienteAduanas;
import com.grucas.domain.model.Usuario;
import java.util.List;

/**
 *
 * @author User
 */
public class ClienteAduanaService {

    private ClienteAduanas object;
    private List<ClienteAduanas> objects;
    private ClienteAduanasDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public ClienteAduanaService() {
        dao = new ClienteAduanasDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public ClienteAduanas getObject() {
        return object;
    }

    public void setObject(ClienteAduanas object) {
        this.object = object;
    }

    public List<ClienteAduanas> getObjects() {
        return objects;
    }

    public void setObjects(List<ClienteAduanas> objects) {
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

    public void ClienteAduanasInsert(ClienteAduanas clienteunidadaduana) {
        object = clienteunidadaduana;
        dao.ClienteAduanasInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Unidad dada de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Unidad no almacenada en la base de datos.";
        }
    }

    public void ClienteAduanasUpdate(ClienteAduanas clienteunidadaduana) {
        object = clienteunidadaduana;
        dao.ClienteAdunasUpdate(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Unidad modificada correctamente.";
        } else {
            notification = "Ha ocurrido un error al modificar.";
        }
    }

    public void ClienteAduanasDelete(ClienteAduanas clienteunidadaduana) {
        object = clienteunidadaduana;
        dao.ClienteAdunasDelete(object.getId());

        setOk(dao.getOk());

        if (getOk()) {
            notification = "La Unidad fue eliminada correctamente.";
        } else {
            notification = "Ha ocurrido un error al eliminar la unidad";
        }
    }

    public void getClienteAduanas(String where, String group, String order) {

        dao.getClienteAduanas(where, group, order);

        setOk(dao.getOk());

        if (getOk()) {

            objects = dao.getObjects();
            total_result = objects.size();

            if (!objects.isEmpty()) {

                if (objects.size() == 1) {
                    object = objects.get(0);
                }

                notification = "Informacion cargada correctamente.";
            } else {
                total_result = 0;
                notification = "No se encontraron registros dados de alta.";
            }

        } else {
            total_result = 0;
            notification = "Ha ocurrido un error al obtener la informacion de la base de datos.";
        }

    }

    public Integer getMaxID() {
        dao.getClienteAduanasID();
        return dao.getId();
    }

    public void getOneClienteUnidadNegocio(String where) {

        dao.getOneClienteAduanas(where);

        setOk(dao.getOk());

        if (getOk()) {

            object = dao.getObject();
            total_result = 1;

            if (object != null) {
                notification = "Informacion cargada correctamente.";
            } else {
                notification = "No se encontraron registros dados de alta.";
            }

        } else {
            notification = "Ha ocurrido un error al obtener la informacion de la base de datos.";
        }
    }

   public void getClienteAduanasByUsuarioID(Usuario user){

        dao.getClienteAduanasByUsuarioID(user);

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
   
    public void getClienteAduanasByAduanaID(String where, String group, String order){

        dao.getClienteAduanasByAduanaID(where,group,order);

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
                total_result = 0;
                notification = "No se encontraron registros dados de alta.";
            }

        }else{
             total_result = 0;
            notification = "Ha ocurrido un error al obtener la informacion de la base de datos.";
        }
    }

}
