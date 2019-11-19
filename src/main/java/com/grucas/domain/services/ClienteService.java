/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.ClienteDAO;
import com.grucas.domain.model.Cliente;
import java.util.List;

/**
 *
 * @author User
 */
public class ClienteService {
     private Cliente object;
    private List<Cliente> objects;
    private ClienteDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public ClienteService() {
        dao = new ClienteDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public Cliente getObject() {
        return object;
    }

    public void setObject(Cliente object) {
        this.object = object;
    }

    public List<Cliente> getObjects() {
        return objects;
    }

    public void setObjects(List<Cliente> objects) {
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

    public void ClienteInsert(Cliente clienteskvv) {
        object = clienteskvv;
        dao.ClienteInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Cliente " + clienteskvv.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Cliente " +clienteskvv.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void ClienteUpdate(Cliente clienteskvv){
        object = clienteskvv;
        dao.ClienteUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Cliente " + clienteskvv.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Cliente " + clienteskvv.getId();
        }
    }

    public void ClienteDelete(Cliente clienteskvv){
        object = clienteskvv;
        dao.ClienteDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Cliente "+ clienteskvv.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Cliente " + clienteskvv.getId();
        }
    }

    public void getCliente(String where, String group, String order){

        dao.getCliente(where, group, order);

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
        dao.getClienteID();
        return dao.getId();
    }

    public void getOneCliente(String where){

        dao.getOneCliente(where);

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
