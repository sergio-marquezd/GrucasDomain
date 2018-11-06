/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

/**
 *
 * @author GrucasDev
 */
import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.model.Usuario;
import com.grucas.domain.dao.UnidadNegocioDAO;
import com.grucas.domain.model.UnidadNegocio;
import com.rubik.manage.ManageString;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class UnidadNegocioService {
    
    private UnidadNegocio object;
    private List<UnidadNegocio> objects;
    private UnidadNegocioDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public UnidadNegocioService() {
        dao = new UnidadNegocioDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public UnidadNegocio getObject() {
        return object;
    }

    public void setObject(UnidadNegocio object) {
        this.object = object;
    }

    public List<UnidadNegocio> getObjects() {
        return objects;
    }

    public void setObjects(List<UnidadNegocio> objects) {
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

    public void UnidadNegocioInsert(UnidadNegocio unidadnegocio) {
        object = unidadnegocio;
        dao.UnidadNegocioInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "UnidadNegocio " + unidadnegocio.getNombre()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. UnidadNegocio " +unidadnegocio.getNombre()+" no almacenado(a) en la base de datos.";
        }
    }

    public void UnidadNegocioUpdate(UnidadNegocio unidadnegocio){
        object = unidadnegocio;
        dao.UnidadNegocioUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "UnidadNegocio " + unidadnegocio.getNombre()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. UnidadNegocio " + unidadnegocio.getNombre();
        }
    }

    public void UnidadNegocioDelete(UnidadNegocio unidadnegocio){
        object = unidadnegocio;
        dao.UnidadNegocioDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "UnidadNegocio "+ unidadnegocio.getNombre()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar UnidadNegocio " + unidadnegocio.getNombre();
        }
    }

    public void getUnidadNegocio(String where, String group, String order){

        dao.getUnidadNegocio(where, group, order);

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
    
    public void getOneUnidadNegocio(String where){

        dao.getOneUnidadNegocio(where);

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
    
    public void incrementarFolio(String field, Integer unidad_id){
        
        dao.FolioUpdate(field, unidad_id);
        
        setOk(dao.getOk());

        if(getOk()){

            total_result = 1;
            notification = "Folio incrementado correctamente.";

        }else{
            notification = "Ha ocurrido un error al obtener la informacion de la base de datos.";
        }
    }
    
    public String getFolio(String field, Integer unidad_id, Boolean fillzero) {
        String folio = "";

        Integer intFolio = getFolio(field, unidad_id);
        String strSerie = getSerie(unidad_id);

        if (fillzero) {
            folio = strSerie + ManageString.fillWithZero(intFolio, 5);
        } else {
            folio = strSerie + intFolio;
        }
       
        
        return folio;
    }
    
    public Integer getFolio(String field, Integer unidad_id){
        Integer folio = 0;
        
        folio = dao.getFolio(field,unidad_id);

        if(folio != null){
            ok = true;
            total_result = 1;
            notification = "Informacion cargada correctamente.";

        }else{            
            folio = 1;
            ok = false;
            total_result = 0;
            notification = "Ha ocurrido un error al obtener la informacion de la base de datos.";
        }
        
        return folio;
    }
    
    public String getSerie(Integer unidad_id){
        dao.getOneUnidadNegocio("id = " + unidad_id);
        String serie = "";
        setOk(dao.getOk());

        if(getOk()){

            object = dao.getObject();
            total_result = 1;

            if(object != null){
                serie = object.getSerie();
                notification = "Informacion cargada correctamente.";
            } else {
                serie = "GRUCAS";
                notification = "No se encontraron registros dados de alta.";
            }

        }else{
            serie = "GRUCAS";
            notification = "Ha ocurrido un error al obtener la informacion de la base de datos.";
        }
        
        return serie;
    }
    
    public void getUnidadNegocioSinAccesoAUsuario(Usuario user){

        dao.getUnidadNegocioSinAccesoAUsuario(user.getId());

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
        dao.getUnidadNegocioID();
        return dao.getId();
    }

}