/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.TransportistaDAO;
import com.grucas.domain.model.Transportista;
import java.util.List;

/**
 *
 * @author GrucasDev
 */
public class TransportistaService {

    private Transportista object;
    private List<Transportista> objects;
    private TransportistaDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public TransportistaService() {
        dao = new TransportistaDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public Transportista getObject() {
        return object;
    }

    public void setObject(Transportista object) {
        this.object = object;
    }

    public List<Transportista> getObjects() {
        return objects;
    }

    public void setObjects(List<Transportista> objects) {
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

    public void TransportistaInsert(Transportista transporte) {
        object = transporte;
        dao.TransportistaInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "El transportista " + transporte.getNombre() + " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar el transportista " + transporte.getNombre() + ".";
        }
    }

    public void TransportistaUpdate(Transportista transportista) {
        object = transportista;
        dao.TransportistaUpdate(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "El Transportista " + transportista.getNombre() + " fue modificado correctamente.";
        } else {
            notification = "Ha ocurrido un error al modificar el Transportista " + transportista.getNombre();
        }
    }

    public void TransportistaDelete(Transportista transportista) {
        object = transportista;
        dao.TransportistaDelete(object.getId());

        setOk(dao.getOk());

        if (getOk()) {
            notification = "El Transportista " + transportista.getNombre() + " fue eliminado correctamente.";
        } else {
            notification = "Ha ocurrido un error al eliminar el Transportista " + transportista.getNombre();
        }
    }

    public void getTransportista(String where, String group, String order) {

        dao.getTransportista(where, group, order);

        setOk(dao.getOk());

        if (getOk()) {

            objects = dao.getObjects();
            total_result = objects.size();

            if (!objects.isEmpty()) {

                if (objects.size() == 1) {
                    object = objects.get(0);
                }

                notification = "Transportistas leidos correctamente.";
            } else {
                notification = "No se encontraron Transportistas dados de alta.";
            }

        } else {
            notification = "Ha ocurrido un error al obtener los Transportistas de la base de datos.";
        }

    }

    public Integer getMaxID() {
        dao.getTransportistaID();
        return dao.getId();
    }

}
