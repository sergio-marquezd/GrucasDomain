/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.VendedorDAO;
import com.grucas.domain.model.Vendedor;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class VendedorService {
    
    private Vendedor object;
    private List<Vendedor> objects;
    private VendedorDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public VendedorService() {
        dao = new VendedorDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public VendedorService(String env) {
        dao = new VendedorDAO(env);
    }

    public Vendedor getObject() {
        return object;
    }

    public void setObject(Vendedor object) {
        this.object = object;
    }

    public List<Vendedor> getObjects() {
        return objects;
    }

    public void setObjects(List<Vendedor> objects) {
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

    public void VendedorInsert(Vendedor vendedor) {
        object = vendedor;
        dao.VendedorInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Vendedor " + vendedor.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Vendedor " +vendedor.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void VendedorUpdate(Vendedor vendedor){
        object = vendedor;
        dao.VendedorUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Vendedor " + vendedor.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Vendedor " + vendedor.getId();
        }
    }

    public void VendedorDelete(Vendedor vendedor){
        object = vendedor;
        dao.VendedorDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Vendedor "+ vendedor.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Vendedor " + vendedor.getId();
        }
    }

    public void getVendedor(String where, String group, String order){

        dao.getVendedor(where, group, order);

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
        dao.getVendedorID();
        return dao.getId();
    }

    public void getOneVendedor(String where){

        dao.getOneVendedor(where);

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
