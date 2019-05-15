/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.SolicitudServicioDAO;
import com.grucas.domain.model.SolicitudServicio;
import java.util.List;

/**
 *
 * @author User
 */
public class SolicitudServicioService {
     private SolicitudServicio object;
    private List<SolicitudServicio> objects;
    private SolicitudServicioDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public SolicitudServicioService() {
        dao = new SolicitudServicioDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public SolicitudServicio getObject() {
        return object;
    }

    public void setObject(SolicitudServicio object) {
        this.object = object;
    }

    public List<SolicitudServicio> getObjects() {
        return objects;
    }

    public void setObjects(List<SolicitudServicio> objects) {
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

    public void SolicitudServicioInsert(SolicitudServicio solicitud) {
        object = solicitud;
        dao.SolicitudServicioInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "SolicitudServicio " + solicitud.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. SolicitudServicio " +solicitud.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void SolicitudServicioUpdate(SolicitudServicio solicitud){
        object = solicitud;
        dao.SolicitudServicioUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "SolicitudServicio " + solicitud.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. SolicitudServicio " + solicitud.getId();
        }
    }

    public void SolicitudServicioDelete(SolicitudServicio solicitud){
        object = solicitud;
        dao.SolicitudServicioDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "SolicitudServicio "+ solicitud.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar SolicitudServicio " + solicitud.getId();
        }
    }

    public void getSolicitudServicio(String where, String group, String order){

        dao.getSolicitudServicio(where, group, order);

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
        dao.getSolicitudServicioID();
        return dao.getId();
    }

    public void getOneSolicitudServicio(String where){

        dao.getOneSolicitudServicio(where);

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

//    public void estadoTerminado(Integer id, Date fecha_modificacion, Boolean activo) {
//
//        getSolicitudServicio(" id = " + id, "", "");
//
//        if (object != null) {
//
//            object.setEstado_doc(GrucasDomainConfig.ESTADO_DOCUMENTO_TERMINADO);
//            object.setFecha_modificacion(new Date());
//            object.setActivo(activo);
//
//            SolicitudServicioUpdate(object);
//
//            SolicitudServicioService solicitudService = new SolicitudServicioService();
//            solicitudService.getSolicitudServicio("id = '" + object.getId() + "'", "", "");
//            SolicitudServicio solicitud = solicitudService.getObject();
//
//            solicitud.setEstado_doc(GrucasDomainConfig.ESTADO_CANCELADO);
//            solicitud.setFecha_modificacion(new Date());
//            solicitud.setActivo(activo);
//
//            solicitudService.SolicitudServicioUpdate(solicitud);
//
//        } else {
//            notification = "El documento no existe en la base de datos.";
//        }
//    }
    
    
    
    
    
}