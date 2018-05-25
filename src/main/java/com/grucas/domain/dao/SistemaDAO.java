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
import com.grucas.domain.model.Sistema;
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
public class SistemaDAO {

    private Integer id = 0;
    private List<Sistema> objects = null;
    private Boolean ok = false;
    private Integer err_code = 0;
    private final SqlSessionFactory sqlSessionFactory;

    public SistemaDAO(String env) {
        sqlSessionFactory = FactorySessionGrucas.getGrucasSqlSessionFactory(env);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Sistema> getObjects() {
        return objects;
    }

    public void setObjects(List<Sistema> objects) {
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

    public void getSistemaID(){

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            id = session.selectOne("SistemaMaxID");

            if(id==null)
            {
                id = 1;
            }

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(DomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(DomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }
    
    public void getSistemaByUser(Integer usuario_id){

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("id", usuario_id);

            session = sqlSessionFactory.openSession();
            objects = session.selectList("SistemaByUser",map);

            ok = true;
            
        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(DomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(DomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }
    
    public void getSistema(String strWhere, String strGroup, String strOrder){

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("where", strWhere.length()==0?"":" WHERE " + strWhere);
            map.put("group", strGroup.length()==0?"":" GROUP BY " + strGroup);
            map.put("order", strOrder.length()==0?"":" ORDER BY " + strOrder);

            session = sqlSessionFactory.openSession();
            objects = session.selectList("SistemaWhere",map);

            ok = true;
            
        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(DomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(DomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void SistemaInsert(Sistema object) {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.insert("SistemaInsert", object);
            session.commit();
            ok = true;

        } catch (PersistenceException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(DomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(DomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void SistemaUpdate(Sistema object){

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.update("SistemaUpdate",object);
            session.commit();

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(DomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(DomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void SistemaDelete(Integer id){

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.delete("SistemaDelete",id);
            session.commit();

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(DomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(DomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

}