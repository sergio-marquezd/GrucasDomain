/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.VendedorClientesDAO;
import com.grucas.domain.model.Vendedor;
import com.grucas.domain.relations.VendedorClientes;
import java.util.List;

/**
 *
 * @author GrucasDev
 */
public class VendedorClientesService {
    
    private VendedorClientes object;
    private List<VendedorClientes> objects;
    private VendedorClientesDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;
    
     public VendedorClientesService() {
        dao = new VendedorClientesDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public VendedorClientes getObject() {
        return object;
    }

    public void setObject(VendedorClientes object) {
        this.object = object;
    }

    public List<VendedorClientes> getObjects() {
        return objects;
    }

    public void setObjects(List<VendedorClientes> objects) {
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
    
       public void VendedorClientesInsert(VendedorClientes obj) {
        object = obj;
        dao.VendedorClientesInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Registro dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. registro no almacenado(a) en la base de datos.";
        }
    }
       
    public void VendedorClientesUpdate(VendedorClientes obj){
        object = obj;
        dao.VendedorClientesUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Registro modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. ";
        }
    }
    
      public void VendedorClientesDelete(VendedorClientes obj){
        object =obj;
        dao.VendedorCLientesDelete(object.getId());
        
        //UsuarioSistemaUNegocioService service = new UsuarioSistemaUNegocioService();
        //service.UsuarioSistemaUNegocioDeleteBySystem(usuariosistema.getUsuario_id(), usuariosistema.getClave_sistema());

        setOk(dao.getOk());

        if(getOk()){
            notification = "El Acceso fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Acceso ";
        }
    }
      
    public void getVendedorClientes(String where, String group, String order){

        dao.getVendedorClientes(where, group, order);

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
        dao.getVendedorClientesID();
        return dao.getId();
    }
     
     public void getOneVendedorClientes(String where){

        dao.getOneVendedorClientes(where);

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
     
    public void getClientesByVendedorID(Vendedor user){

        dao.getClientesByVendedorID(user);

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
