package com.grucas.domain.services;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.ConfiguracionGrucasDAO;
import com.grucas.domain.model.ConfiguracionGrucas;
import com.rubik.manage.ManageString;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author PabloBenavides
 */
public class ConfiguracionGrucasService {
    
    private ConfiguracionGrucas object;
    private List<ConfiguracionGrucas> objects;
    private ConfiguracionGrucasDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public ConfiguracionGrucasService() {
        dao = new ConfiguracionGrucasDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public ConfiguracionGrucasService(String env) {
        dao = new ConfiguracionGrucasDAO(env);
    }

    public ConfiguracionGrucas getObject() {
        return object;
    }

    public void setObject(ConfiguracionGrucas object) {
        this.object = object;
    }

    public List<ConfiguracionGrucas> getObjects() {
        return objects;
    }

    public void setObjects(List<ConfiguracionGrucas> objects) {
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

    public void ConfiguracionGrucasInsert(ConfiguracionGrucas configuraciongrucas) {
        object = configuraciongrucas;
        dao.ConfiguracionGrucasInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "ConfiguracionGrucas " + configuraciongrucas.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. ConfiguracionGrucas " +configuraciongrucas.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void ConfiguracionGrucasUpdate(ConfiguracionGrucas configuraciongrucas){
        object = configuraciongrucas;
        dao.ConfiguracionGrucasUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "ConfiguracionGrucas " + configuraciongrucas.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. ConfiguracionGrucas " + configuraciongrucas.getId();
        }
    }

    public void ConfiguracionGrucasDelete(ConfiguracionGrucas configuraciongrucas){
        object = configuraciongrucas;
        dao.ConfiguracionGrucasDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "ConfiguracionGrucas "+ configuraciongrucas.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar ConfiguracionGrucas " + configuraciongrucas.getId();
        }
    }

    public void getConfiguracionGrucas(String where, String group, String order){

        dao.getConfiguracionGrucas(where, group, order);

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
        dao.getConfiguracionGrucasID();
        return dao.getId();
    }

    public void getOneConfiguracionGrucas(String where){

        dao.getOneConfiguracionGrucas(where);

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

    public String getFolioServiceDesk(){
        
        getOneConfiguracionGrucas("id = 1");
        object = getObject();
        
        String month = "";
        String anio = "";
                
        Calendar c =  new GregorianCalendar();
                
        if(object.getMes().equals(c.get(Calendar.MONTH)+"")){
            month = object.getMes();
            anio = object.getAnio()+"";
        }else{
            object.setAnio(c.get(Calendar.YEAR));
            object.setMes(c.get(Calendar.MONTH)+"");
            object.setConsecutivo_sd(0);
        }
        
        object.setConsecutivo_sd(object.getConsecutivo_sd()+1);
        ConfiguracionGrucasUpdate(object);
        
        System.out.println("FOLIO : " + month+anio+"_"+ManageString.fillWithZero(object.getConsecutivo_sd(), 4));
        
        return month+anio+"_"+ManageString.fillWithZero(object.getConsecutivo_sd(), 4);
    }
    
}