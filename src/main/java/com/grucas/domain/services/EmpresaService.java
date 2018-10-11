/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.EmpresaDAO;
import com.grucas.domain.model.Empresa;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class EmpresaService {
    
    private Empresa object;
    private List<Empresa> objects;
    private EmpresaDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public EmpresaService() {
        dao = new EmpresaDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public Empresa getObject() {
        return object;
    }

    public void setObject(Empresa object) {
        this.object = object;
    }

    public List<Empresa> getObjects() {
        return objects;
    }

    public void setObjects(List<Empresa> objects) {
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

    public void EmpresaInsert(Empresa empresa) {
        object = empresa;
        dao.EmpresaInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Empresa " + empresa.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Empresa " +empresa.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void EmpresaUpdate(Empresa empresa){
        object = empresa;
        dao.EmpresaUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Empresa " + empresa.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Empresa " + empresa.getId();
        }
    }

    public void EmpresaDelete(Empresa empresa){
        object = empresa;
        dao.EmpresaDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Empresa "+ empresa.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Empresa " + empresa.getId();
        }
    }

    public void getEmpresa(String where, String group, String order){

        dao.getEmpresa(where, group, order);

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
        dao.getEmpresaID();
        return dao.getId();
    }

    public void getOneEmpresa(String where){

        dao.getOneEmpresa(where);

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