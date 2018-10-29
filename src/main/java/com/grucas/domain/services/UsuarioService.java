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
import com.grucas.domain.model.Sistema;
import com.grucas.domain.model.Usuario;
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
            notification = "Usuario " + usuario.getId()+ " dado de alta correctamente.";
        } else {
            notification = "Ha ocurrido un error al guardar. Usuario " +usuario.getId()+" no almacenado(a) en la base de datos.";
        }
    }

    public void UsuarioUpdate(Usuario usuario){
        object = usuario;
        dao.UsuarioUpdate(object);

        setOk(dao.getOk());

        if(getOk()){
            notification = "Usuario " + usuario.getId()+ " modificado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al modificar. Usuario " + usuario.getId();
        }
    }

    public void UsuarioDelete(Usuario usuario){
        object = usuario;
        dao.UsuarioDelete(object.getId());

        setOk(dao.getOk());

        if(getOk()){
            notification = "Usuario "+ usuario.getId()+ " fue eliminado(a) correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar Usuario " + usuario.getId();
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
            
            if ("FULLACCESS".equals(object.getTipo())) {
                
                ok = true;
                total_result = 1;
                notification = "Bienvenido al sistema " + object.getNombre() + "!";

            } else {
                List<Sistema> accesoSistemas = getSystemByUser(object.getId());
                if (accesoSistemas.size() > 0) {

                    Boolean accesoSistema = false;

                    for (Sistema sistemaTem : accesoSistemas) {
                        if (Objects.equals(sistemaTem.getClave_sistema(), code)) {
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
                        notification = "El usuario no tiene acceso a esta aplicacion. Favor de solicitar su acceso en soporte@grucas.com";
                    }

                } else {
                    ok = false;
                    total_result = 0;
                    notification = "El usuario no tiene acceso a esta aplicacion. Favor de solicitar su acceso en soporte@grucas.com";
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

}