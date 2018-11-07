/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.UsuarioSistemaDAO;
import com.grucas.domain.model.Usuario;
import com.grucas.domain.relations.UsuarioSistema;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class UsuarioSistemaService {
    
    private UsuarioSistema object;
    private List<UsuarioSistema> objects;
    private UsuarioSistemaDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public UsuarioSistemaService() {
        dao = new UsuarioSistemaDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public UsuarioSistema getObject() {
        return object;
    }

    public void setObject(UsuarioSistema object) {
        this.object = object;
    }

    public List<UsuarioSistema> getObjects() {
        return objects;
    }

    public void setObjects(List<UsuarioSistema> objects) {
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

    public void UsuarioSistemaInsert(UsuarioSistema usuariosistema) {
        object = usuariosistema;
        dao.UsuarioSistemaInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Acceso dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Acceso no almacenado(a) en la base de datos.";
        }
    }

    public void UsuarioSistemaUpdate(UsuarioSistema usuariosistema){
        object = usuariosistema;
        dao.UsuarioSistemaUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Acceso modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. ";
        }
    }

    public void UsuarioSistemaDelete(UsuarioSistema usuariosistema){
        object = usuariosistema;
        dao.UsuarioSistemaDelete(object.getId());
        
        UsuarioSistemaUNegocioService service = new UsuarioSistemaUNegocioService();
        service.UsuarioSistemaUNegocioDeleteBySystem(usuariosistema.getUsuario_id(), usuariosistema.getClave_sistema());

        setOk(dao.getOk());

        if(getOk()){
            notification = "El Acceso fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Acceso ";
        }
    }

    public void getUsuarioSistema(String where, String group, String order){

        dao.getUsuarioSistema(where, group, order);

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
        dao.getUsuarioSistemaID();
        return dao.getId();
    }

    public void getOneUsuarioSistema(String where){

        dao.getOneUsuarioSistema(where);

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

    public void getUsuarioSistemaByUsuarioID(Usuario user){

        dao.getUsuarioSistemaByUsuarioID(user);

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