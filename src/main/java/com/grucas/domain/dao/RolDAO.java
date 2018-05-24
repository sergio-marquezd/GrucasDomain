/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.dao;

/**
 *
 * @author GrucasDev
 */
import com.grucas.domain.config.DomainConfig;
import com.grucas.domain.model.Rol;
import com.rubik.logger.LoggerImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author PabloBenavides
 */
public class RolDAO {

    private Integer id = 0;
    private List<Rol> objects = null;
    private Boolean ok = false;
    private Integer err_code = 0;
    private final SqlSessionFactory sqlSessionFactory;

    public RolDAO(String env) {
        sqlSessionFactory = FactorySession.getSqlSessionFactory(env);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Rol> getObjects() {
        return objects;
    }

    public void setObjects(List<Rol> objects) {
        this.objects = objects;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public Integer getErr_code() {
        return err_code;
    }

    public void setErr_code(Integer err_code) {
        this.err_code = err_code;
    }

    public void getRolID(){

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            id = session.selectOne("RolMaxID");

            if(id==null)
            {
                id = 1;
            }

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(DomainConfig.DEBUG){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(DomainConfig.DEBUG){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void getRol(String strWhere, String strGroup, String strOrder){

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("where", strWhere.length()==0?"":" WHERE " + strWhere);
            map.put("group", strGroup.length()==0?"":" GROUP BY " + strGroup);
            map.put("order", strOrder.length()==0?"":" ORDER BY " + strOrder);

            session = sqlSessionFactory.openSession();
            objects = session.selectList("RolWhere",map);

            ok = true;
            
        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(DomainConfig.DEBUG){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(DomainConfig.DEBUG){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void RolInsert(Rol object) {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.insert("RolInsert", object);
            session.commit();
            ok = true;

        } catch (PersistenceException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(DomainConfig.DEBUG){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(DomainConfig.DEBUG){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void RolUpdate(Rol object){

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.update("RolUpdate",object);
            session.commit();

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(DomainConfig.DEBUG){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(DomainConfig.DEBUG){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void RolDelete(Integer id){

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.delete("RolDelete",id);
            session.commit();

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(DomainConfig.DEBUG){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(DomainConfig.DEBUG){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

}