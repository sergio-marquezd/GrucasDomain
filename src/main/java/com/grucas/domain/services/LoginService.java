/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.services;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.config._RolesDeUsuario;
import com.grucas.domain.config._TiposDeUsuario;
import com.grucas.domain.dao.UsuarioDAO;
import com.grucas.domain.model.Sistema;
import com.grucas.domain.model.Usuario;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author GrucasDev
 */
public class LoginService {
    
    private Usuario object;
    private UsuarioDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;
    private String key;

    public LoginService() {
        dao = new UsuarioDAO(GrucasDomainConfig.getEnvironmentGrucas());
    }

    public Usuario getObject() {
        return object;
    }

    public void setObject(Usuario object) {
        this.object = object;
    }

    public UsuarioDAO getDao() {
        return dao;
    }

    public void setDao(UsuarioDAO dao) {
        this.dao = dao;
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
    public void login(String key, String username, String password, Integer code){
        
        if (key.equals(getKeyAcces())) {
            UsuarioDAO dao = new UsuarioDAO(GrucasDomainConfig.getEnvironmentGrucas());

            dao.getUsuario("username = '" + username + "' and password = '" + password + "'", "", "");
            if (dao.getObjects().size() > 0) {

                object = dao.getObjects().get(0);

                if (_TiposDeUsuario.USUARIO_SUPER.equals(object.getTipo())) {

                    object.setRol(_RolesDeUsuario.ROL_ADMINISTRADOR); 
                    ok = true;
                    total_result = 1;
                    notification = "Bienvenido al sistema " + object.getNombre() + "!";

                } else {
                    List<Sistema> accesoSistemas = getSystemByUser(object.getId());
                    if (accesoSistemas.size() > 0) {

                        Boolean accesoSistema = false;

                        for (Sistema sistemaTem : accesoSistemas) {
                            if (Objects.equals(sistemaTem.getClave_sistema(), code)) {
                                
//                                if (code == 1001) {
//                                    // Especificamente para el proyecto Chemours, se ligó (malamente) el proyecto por ID de empresas. 
//                                    // Las unidades de Negocio para Chemours son los almacenes.
//                                    // Por eso se hace la reasignacion de valores SOLO para el SISTEMA con CLAVE = 1001
//                                    if (object.getUnidad_id() == 6) {
//                                        object.setEmpresa_id(1);
//                                        object.setEmpresa("KARGO CHEMOURS");
//                                    } else {
//                                        object.setEmpresa_id(2);
//                                        object.setEmpresa("KARGO VALLE VERDE");
//                                    }
//
//                                    object.setUnidad_id(0);
//                                    object.setUnidad("");
//                                }
                                
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

            } else {
                ok = false;
                total_result = 0;
                notification = "Usuario no registardo en el Sistema.";
            }
        } else {
            ok = false;
            total_result = 0;
            notification = "Key de acceso incorrecta. Favor de comunicarse con el departamento de TI";
        }
    }
    
    public void login(String key, String username, String password, Integer code, String twofactorCode){
        
        if (key.equals(getKeyAcces())) {
            UsuarioDAO dao = new UsuarioDAO(GrucasDomainConfig.getEnvironmentGrucas());

            dao.getUsuario("username = '" + username + "' and password = '" + password + "'", "", "");
            if (dao.getObjects().size() > 0) {

                object = dao.getObjects().get(0);

                UsuarioService serviceUser = new UsuarioService();                
                String code2factor = serviceUser.getNIPCode(username);
                
                if (_TiposDeUsuario.USUARIO_SUPER.equals(object.getTipo())) {

                    object.setRol(_RolesDeUsuario.ROL_ADMINISTRADOR); 
                    ok = true;
                    total_result = 1;
                    notification = "Bienvenido al sistema " + object.getNombre() + "!";

                } else {
                    List<Sistema> accesoSistemas = getSystemByUser(object.getId());
                    if (accesoSistemas.size() > 0) {

                        Boolean accesoSistema = false;

                        for (Sistema sistemaTem : accesoSistemas) {
                            if (Objects.equals(sistemaTem.getClave_sistema(), code)) {

                                if(code2factor.equals(twofactorCode)){
                                    if (code == 1001) {
                                        // Especificamente para el proyecto Chemours, se ligó (malamente) el proyecto por ID de empresas. 
                                        // Las unidades de Negocio para Chemours son los almacenes.
                                        // Por eso se hace la reasignacion de valores SOLO para el SISTEMA con CLAVE = 1001
                                        if (object.getUnidad_id() == 6) {
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

                                    ok = true;
                                    object.setRol(sistemaTem.getRol());
                                    total_result = 1;
                                    notification = "Bienvenido al sistema " + object.getNombre() + "!";
                                } else {
                                    accesoSistema = false;
                                    ok = false;
                                    total_result = 0;
                                    notification = "Favor de verificar el NIP de acceso. Verifique que siga vigente o solicite uno nuevo via correo electronico.";
                                }
                            } else {
                                accesoSistema = false;
                                ok = false;
                                total_result = 0;
                                notification = "El usuario no tiene permiso para accesar a esta aplicacion. Favor de solicitar su acceso en soporte@grucas.com";
                            }
                        }

                    } else {
                        ok = false;
                        total_result = 0;
                        notification = "El usuario no tiene permiso para accesar a esta aplicacion. Favor de solicitar su acceso en soporte@grucas.com";
                    }
                }

            } else {
                ok = false;
                total_result = 0;
                notification = "Usuario no registardo en el Sistema.";
            }
        } else {
            ok = false;
            total_result = 0;
            notification = "Key de acceso incorrecta. Favor de comunicarse con el departamento de TI";
        }
    }
    
    public List getSystemByUser(Integer usuario_id){
        
        SistemaService service = new SistemaService();
        service.getSistemaByUser(usuario_id);
        
        return service.getObjects();
    }
    
    private String getKeyAcces(){
        // Toma la llave de acceso para las aplicaciones GRUCAS
        return "bc1b8532-f2f5-4698-a385-34811a3e147c";
    }
    
}