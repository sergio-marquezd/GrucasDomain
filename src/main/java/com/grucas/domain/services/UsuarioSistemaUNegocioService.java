/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.UsuarioSistemaUNegocioDAO;
import com.grucas.domain.relations.UsuarioSistemaUNegocio;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class UsuarioSistemaUNegocioService {
    
    private UsuarioSistemaUNegocio object;
    private List<UsuarioSistemaUNegocio> objects;
    private UsuarioSistemaUNegocioDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public UsuarioSistemaUNegocioService() {
        dao = new UsuarioSistemaUNegocioDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public UsuarioSistemaUNegocio getObject() {
        return object;
    }

    public void setObject(UsuarioSistemaUNegocio object) {
        this.object = object;
    }

    public List<UsuarioSistemaUNegocio> getObjects() {
        return objects;
    }

    public void setObjects(List<UsuarioSistemaUNegocio> objects) {
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

    public void UsuarioSistemaUNegocioInsert(UsuarioSistemaUNegocio usuariosistemaunegocio) {
        object = usuariosistemaunegocio;
        dao.UsuarioSistemaUNegocioInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "UsuarioSistemaUNegocio " + usuariosistemaunegocio.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. UsuarioSistemaUNegocio " +usuariosistemaunegocio.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void UsuarioSistemaUNegocioUpdate(UsuarioSistemaUNegocio usuariosistemaunegocio){
        object = usuariosistemaunegocio;
        dao.UsuarioSistemaUNegocioUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "UsuarioSistemaUNegocio " + usuariosistemaunegocio.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. UsuarioSistemaUNegocio " + usuariosistemaunegocio.getId();
        }
    }

    public void UsuarioSistemaUNegocioDelete(UsuarioSistemaUNegocio usuariosistemaunegocio){
        object = usuariosistemaunegocio;
        dao.UsuarioSistemaUNegocioDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "UsuarioSistemaUNegocio "+ usuariosistemaunegocio.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar UsuarioSistemaUNegocio " + usuariosistemaunegocio.getId();
        }
    }

    public void getUsuarioSistemaUNegocio(String where, String group, String order){

        dao.getUsuarioSistemaUNegocio(where, group, order);

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
        dao.getUsuarioSistemaUNegocioID();
        return dao.getId();
    }

    public void getOneUsuarioSistemaUNegocio(String where){

        dao.getOneUsuarioSistemaUNegocio(where);

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