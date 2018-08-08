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
import com.grucas.domain.dao.EmpleadoDAO;
import com.grucas.domain.model.Empleado;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class EmpleadoService {
    
    private Empleado object;
    private List<Empleado> objects;
    private EmpleadoDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public EmpleadoService() {
        dao = new EmpleadoDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public Empleado getObject() {
        return object;
    }

    public void setObject(Empleado object) {
        this.object = object;
    }

    public List<Empleado> getObjects() {
        return objects;
    }

    public void setObjects(List<Empleado> objects) {
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

    public void EmpleadoInsert(Empleado empleado) {
        object = empleado;
        dao.EmpleadoInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Empleado " + empleado.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Empleado " +empleado.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void EmpleadoUpdate(Empleado empleado){
        object = empleado;
        dao.EmpleadoUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Empleado " + empleado.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Empleado " + empleado.getId();
        }
    }

    public void EmpleadoDelete(Empleado empleado){
        object = empleado;
        dao.EmpleadoDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Empleado "+ empleado.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Empleado " + empleado.getId();
        }
    }

    public void getEmpleado(String where, String group, String order){

        dao.getEmpleado(where, group, order);

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
        dao.getEmpleadoID();
        return dao.getId();
    }

    public void getOneEmpleado(String where){

        dao.getOneEmpleado(where);

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