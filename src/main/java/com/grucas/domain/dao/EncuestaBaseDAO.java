/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.dao;

import com.grucas.domain.config.GrucasDomainConfig;
import com.rubik.Base.EncuestaBase;
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
public class EncuestaBaseDAO {

    private Integer id = 0;
    private List<EncuestaBase> objects = null;
    private EncuestaBase object = null;
    private Boolean ok = false;
    private Integer err_code = 0;
    private final SqlSessionFactory sqlSessionFactory;

    public EncuestaBaseDAO(String env) {
        sqlSessionFactory = FactorySessionGrucas.getGrucasSqlSessionFactory(env);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<EncuestaBase> getObjects() {
        return objects;
    }

    public void setObjects(List<EncuestaBase> objects) {
        this.objects = objects;
    }

    public EncuestaBase getObject() {
        return object;
    }

    public void setObject(EncuestaBase object) {
        this.object = object;
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

    public void getEncuestaBaseID(){

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            id = session.selectOne("EncuestaBaseMaxID");

            if(id==null)
            {
                id = 1;
            }

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void getEncuestaBase(String strWhere, String strGroup, String strOrder){

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("where", strWhere.length()==0?"":" WHERE " + strWhere);
            map.put("group", strGroup.length()==0?"":" GROUP BY " + strGroup);
            map.put("order", strOrder.length()==0?"":" ORDER BY " + strOrder);

            session = sqlSessionFactory.openSession();
            objects = session.selectList("EncuestaBaseWhere",map);

            ok = true;
            
        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }
    
    public void getEncuestaBaseCliente(String strWhere, String strGroup, String strOrder){

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("where", strWhere.length()==0?"":" WHERE " + strWhere);
            map.put("group", strGroup.length()==0?"":" GROUP BY " + strGroup);
            map.put("order", strOrder.length()==0?"":" ORDER BY " + strOrder);

            session = sqlSessionFactory.openSession();
            objects = session.selectList("EncuestaBaseWhereCliente",map);

            ok = true;
            
        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }
    
     public void getEncuestaComplementoCliente(String strWhere, String strGroup, String strOrder){

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("where", strWhere.length()==0?"":" WHERE " + strWhere);
            map.put("group", strGroup.length()==0?"":" GROUP BY " + strGroup);
            map.put("order", strOrder.length()==0?"":" ORDER BY " + strOrder);

            session = sqlSessionFactory.openSession();
            objects = session.selectList("EncuestaComplementoWhereCliente",map);

            ok = true;
            
        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void getOneEncuestaBase(String strWhere){

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("where", strWhere.length()==0?"":" WHERE " + strWhere);

            session = sqlSessionFactory.openSession();
            object = session.selectOne("EncuestaBaseWhere",map);

            ok = true;
            
        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void EncuestaBaseInsert(EncuestaBase object) {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.insert("EncuestaBaseInsert", object);
            session.commit();
            ok = true;

        } catch (PersistenceException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }
    
    public void EncuestaBaseComplementoInsert(EncuestaBase object) {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.insert("EncuestaBaseComplementoInsert", object);
            session.commit();
            ok = true;

        } catch (PersistenceException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }
    
    

    public void EncuestaBaseUpdate(EncuestaBase object){

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.update("EncuestaBaseUpdate",object);
            session.commit();

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void EncuestaBaseDelete(Integer id){

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.delete("EncuestaBaseDelete",id);
            session.commit();

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG_GRUCAS){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

}