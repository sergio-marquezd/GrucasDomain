/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.SolicitudServicioDetDAO;
import com.grucas.domain.model.SolicitudServicioDet;
import java.util.List;

/**
 *
 * @author User
 */
public class SolicitudServicioDetService {
    private SolicitudServicioDet object;
    private List<SolicitudServicioDet> objects;
    private SolicitudServicioDetDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public SolicitudServicioDetService() {
        dao = new SolicitudServicioDetDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public SolicitudServicioDet getObject() {
        return object;
    }

    public void setObject(SolicitudServicioDet object) {
        this.object = object;
    }

    public List<SolicitudServicioDet> getObjects() {
        return objects;
    }

    public void setObjects(List<SolicitudServicioDet> objects) {
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

    public void SolicitudServicioDetInsert(SolicitudServicioDet solicitud_det) {
        object = solicitud_det;
        dao.SolicitudServicioDetInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "SolicitudServicioDet " + solicitud_det.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. SolicitudServicioDet " +solicitud_det.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void SolicitudServicioDetUpdate(SolicitudServicioDet solicitud_det){
        object = solicitud_det;
        dao.SolicitudServicioDetUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "SolicitudServicioDet " + solicitud_det.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. SolicitudServicioDet " + solicitud_det.getId();
        }
    }

    public void SolicitudServicioDetDelete(SolicitudServicioDet solicitud_det){
        object = solicitud_det;
        dao.SolicitudServicioDetDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "SolicitudServicioDet "+ solicitud_det.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar SolicitudServicioDet " + solicitud_det.getId();
        }
    }

    public void getSolicitudServicioDet(String where, String group, String order){

        dao.getSolicitudServicioDet(where, group, order);

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
        dao.getSolicitudServicioDetID();
        return dao.getId();
    }

    public void getOneSolicitudServicioDet(String where){

        dao.getOneSolicitudServicioDet(where);

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
