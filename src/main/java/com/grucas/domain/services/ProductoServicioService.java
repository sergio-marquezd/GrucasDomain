/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.ProductoServicioDAO;
import com.grucas.domain.model.ProductoServicio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class ProductoServicioService {
    
    private ProductoServicio object;
    private List<ProductoServicio> objects;
    private ProductoServicioDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public ProductoServicioService() {
        dao = new ProductoServicioDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public ProductoServicioService(String env) {
        dao = new ProductoServicioDAO(env);
    }

    public ProductoServicio getObject() {
        return object;
    }

    public void setObject(ProductoServicio object) {
        this.object = object;
    }

    public List<ProductoServicio> getObjects() {
        return objects;
    }

    public void setObjects(List<ProductoServicio> objects) {
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

    public void ProductoInsert(ProductoServicio producto) {
        object = producto;
        dao.ProductoInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Producto " + producto.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Producto " +producto.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void ProductoUpdate(ProductoServicio producto){
        object = producto;
        dao.ProductoUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Producto " + producto.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Producto " + producto.getId();
        }
    }

    public void ProductoDelete(ProductoServicio producto){
        object = producto;
        dao.ProductoDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Producto "+ producto.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Producto " + producto.getId();
        }
    }

    public void getProducto(String where, String group, String order){

        dao.getProducto(where, group, order);

        setOk(dao.getOk());

        if(getOk()){
            
            objects = dao.getObjects();
            if(objects != null){
                total_result = objects.size();
                
                if(objects.size()==1){
                    object = objects.get(0);
                }
                notification = "Informacion cargada correctamente.";
            }else{
                objects = new ArrayList<>();
                notification = "No se encontraron registros dados de alta.";
            }

        }else{
            notification = "Ha ocurrido un error al obtener la informacion de la base de datos.";
        }

    }

    public Integer getMaxID(){
        dao.getProductoID();
        return dao.getId();
    }

    public void getOneProducto(String where){

        dao.getOneProducto(where);

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

    public void observaciones(Integer id, String observaciones, Integer usuario_id, String usuario) {

        getProducto("id = " + id, "", ""); 

        if (object != null) {

            object.setFecha_modificacion(new Date());
            object.setUsuario(usuario);
            object.setUsuario_id(usuario_id);
            object.setDescripcion(observaciones);

            ProductoUpdate(object);

        } else {
            notification = "El documento no existe en la base de datos.";
        }
    }

}