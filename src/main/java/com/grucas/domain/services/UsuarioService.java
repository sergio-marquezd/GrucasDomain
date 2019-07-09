package com.grucas.domain.services;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GrucasDev
 */
import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.UsuarioDAO;
import com.grucas.domain.model.NipCode;
import com.grucas.domain.model.Sistema;
import com.grucas.domain.model.Usuario;
import com.rubik.util.PasswordGenerator;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author PabloBenavides
 */
public class UsuarioService {
    
    private Usuario object;
    private List<Usuario> objects;
    private UsuarioDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;

    public UsuarioService() {
        dao = new UsuarioDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public Usuario getObject() {
        return object;
    }

    public void setObject(Usuario object) {
        this.object = object;
    }

    public List<Usuario> getObjects() {
        return objects;
    }

    public void setObjects(List<Usuario> objects) {
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

    public void UsuarioInsert(Usuario usuario) {
        object = usuario;
        dao.UsuarioInsert(object);

        setOk(dao.getOk());

        if (getOk()) {
            notification = "Usuario " + usuario.getFullName()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. El usuario de " + usuario.getFullName() + ". Revise que no sea un username repetido.";
        }
    }

    public void UsuarioUpdate(Usuario usuario){
        object = usuario;
        dao.UsuarioUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Usuario " + usuario.getFullName()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. El usuario de " + usuario.getFullName() + ". Revise que no sea un username repetido.";
        }
    }

    public void UsuarioDelete(Usuario usuario){
        object = usuario;
        dao.UsuarioDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Usuario "+ usuario.getFullName()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Usuario " + usuario.getFullName();
        }
    }

    public void getUsuario(String where, String group, String order){

        dao.getUsuario(where, group, order);

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
    
    public void getUsuario(Integer id){

        dao.getUsuario(id);
        setOk(dao.getOk());

        if(getOk()){

            object = dao.getObject();
            total_result = 1;
            notification = "Usuario cargado correctamente.";

        }else{
            notification = "Ha ocurrido un error al obtener la informacion de la base de datos.";
        }

    }
    
    public void login(String username, String password, Integer code){
        
        UsuarioDAO dao = new UsuarioDAO(GrucasDomainConfig.getEnvironmentGrucas());
        
        dao.getUsuario("username = '" + username + "' and password = '" + password + "'", "", "");
        if(dao.getObjects().size()>0){
            
            object = dao.getObjects().get(0);
            
            if (GrucasDomainConfig.USUARIO_SUPER.equals(object.getTipo())) {

                object.setRol(GrucasDomainConfig.ROL_ADMINISTRADOR);                
                ok = true;
                total_result = 1;
                notification = "Bienvenido al sistema " + object.getNombre() + "!";

            } else {
                List<Sistema> accesoSistemas = getSystemByUser(object.getId());
                if (accesoSistemas.size() > 0) {

                    Boolean accesoSistema = false;

                    for (Sistema sistemaTem : accesoSistemas) {
                        if (Objects.equals(sistemaTem.getClave_sistema(), code)) {

                            if(code == 1001 ){
                                // Especificamente para el proyecto Chemours, se ligó (malamente) el proyecto por ID de empresas. 
                                // Las unidades de Negocio para Chemours son los almacenes.
                                // Por eso se hace la reasignacion de valores SOLO para el SISTEMA con CLAVE = 1001
                                if (object.getUnidad_id()==6) {
                                    object.setEmpresa_id(1);
                                    object.setEmpresa("KARGO CHEMOURS");
                                } else {
                                    object.setEmpresa_id(2);
                                    object.setEmpresa("KARGO VALLE VERDE");
                                }
                                
                                object.setUnidad_id(0);
                                object.setUnidad("");
                            }

                            accesoSistema = true;
                            object.setRol(sistemaTem.getRol());
                        }
                    }

                    if (accesoSistema) {
                        ok = true;
                        total_result = 1;
                        notification = "Bienvenido al sistema " + object.getNombre() + "!";
                    } else {
                        ok = false;
                        total_result = 0;
                        notification = "El usuario no tiene permiso para accesar a esta aplicacion. Favor de solicitar su acceso en soporte@grucas.com";
                    }

                } else {
                    ok = false;
                    total_result = 0;
                    notification = "El usuario no tiene permiso para accesar a esta aplicacion. Favor de solicitar su acceso en soporte@grucas.com";
                }
            }
            
        }else{
            ok = false;
            total_result = 0;
            notification = "Usuario no registardo en el Sistema.";
        }
        
    }
    
    public List getSystemByUser(Integer usuario_id){
        
        SistemaService service = new SistemaService();
        service.getSistemaByUser(usuario_id);
        
        return service.getObjects();
    }
    
    public List getUNByUser(){
        return null;
    }

    public Integer getMaxID(){
        dao.getUsuarioID();
        return dao.getId();
    }
    
    public String getNIPCode(String username){
        UsuarioDAO dao = new UsuarioDAO(GrucasDomainConfig.getEnvironmentGrucas());

        dao.getUsuario("username = '" + username + "'", "", "");
        if (dao.getObjects().size() > 0) {

            object = dao.getObjects().get(0);

            NipCode nip = dao.getNIPCode(object.getUsername());

            if (nip != null) {
                
                Calendar fecha_actual = Calendar.getInstance();
                fecha_actual.setTime(new Date());
                
                Calendar fecha_nip = Calendar.getInstance();
                fecha_nip.setTime(nip.getFecha_actualizacion());
                
                Calendar fecha_caduca_nip = Calendar.getInstance();
                fecha_caduca_nip.setTime(nip.getFecha_actualizacion());
                fecha_caduca_nip.add(Calendar.HOUR, 1);
                        
//                if (fecha_actual.getTime().before(fecha_caduca_nip.getTime()) && fecha_actual.getTime().after(fecha_nip.getTime())) {
                    return nip.getNip();
//                }else{
//                    return "0000";
//                }

            } else {
                return "0000";
            }
        }
        return "0000";
    }
    
    public String generateNIPCode(String username){
        UsuarioDAO dao = new UsuarioDAO(GrucasDomainConfig.getEnvironmentGrucas());

        NipCode nip = new NipCode();
        nip.setUsuario(username);
        nip.setFecha_actualizacion(new Date());
        nip.setNip(PasswordGenerator.getPinNumber());
        
        dao.generateNIPCode(nip);

        return nip.getNip();
    }

}