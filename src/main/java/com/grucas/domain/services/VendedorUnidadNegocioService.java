/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.VendedorUnidadNegocioDAO;
import com.grucas.domain.model.Vendedor;
import com.grucas.domain.relations.VendedorUnidadNegocio;
import java.util.List;

/**
 *
 * @author GrucasDev
 */
public class VendedorUnidadNegocioService {
    
    private VendedorUnidadNegocio object;
    private List<VendedorUnidadNegocio> objects;
    private VendedorUnidadNegocioDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public VendedorUnidadNegocioService() {
        dao = new VendedorUnidadNegocioDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public VendedorUnidadNegocio getObject() {
        return object;
    }

    public void setObject(VendedorUnidadNegocio object) {
        this.object = object;
    }

    public List<VendedorUnidadNegocio> getObjects() {
        return objects;
    }

    public void setObjects(List<VendedorUnidadNegocio> objects) {
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
    
      public void VendedorUnidadNegocioInsert(VendedorUnidadNegocio obj) {
        object = obj;
        dao.VendedorUnidadNegocioInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Registro dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Registro no almacenado(a) en la base de datos.";
        }
    }
      
    public void VendedorUnidadNegocioUpdate(VendedorUnidadNegocio obj){
        object = obj;
        dao.VendedorUnidadNegocioUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Registro modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. ";
        }
    }
    
    public void VendedorUnidadNegocioDelete(VendedorUnidadNegocio obj){
        object = obj;
        dao.VendedorUnidadNegocioDelete(object.getId());
        
//        UsuarioSistemaUNegocioService service = new UsuarioSistemaUNegocioService();
//        service.UsuarioSistemaUNegocioDeleteBySystem(usuariosistema.getUsuario_id(), usuariosistema.getClave_sistema());

        setOk(dao.getOk());

        if(getOk()){
            notification = "El Registro fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar registro.";
        }
    }
    
    public void getVendedorUnidadNegocio(String where, String group, String order){

        dao.getVendedorUnidadNegocio(where, group, order);

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
        dao.getVendedorUnidadNegocioID();
        return dao.getId();
    }
      
    public void getOneVendedorUnidadNegocio(String where){

        dao.getOneVendedorUnidadNegocio(where);

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
    
    public void getUnidadNegocioByVendedorID(Vendedor user){

        dao.getUnidadNegocioByVendedorID(user);

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
