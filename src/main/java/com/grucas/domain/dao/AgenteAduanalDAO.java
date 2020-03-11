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
import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.model.AgenteAduanal;
import com.rubik.logger.LoggerImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;

public class AgenteAduanalDAO {

    private Integer id = 0;
    private List<AgenteAduanal> objects = null;
    private AgenteAduanal object = null;
    private Boolean ok = false;
    private Integer err_code = 0;
    private final SqlSessionFactory sqlSessionFactory;

    public AgenteAduanalDAO(String env) {
        sqlSessionFactory = FactorySessionGrucas.getGrucasSqlSessionFactory(env);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<AgenteAduanal> getObjects() {
        return objects;
    }

    public void setObjects(List<AgenteAduanal> objects) {
        this.objects = objects;
    }

    public AgenteAduanal getObject() {
        return object;
    }

    public void setObject(AgenteAduanal object) {
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

    public void getAgenteAduanalID(){

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            id = session.selectOne("AgenteAduanalMaxID");

            if(id==null)
            {
                id = 1;
            }

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void getAgenteAduanal(String strWhere, String strGroup, String strOrder){

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("where", strWhere.length()==0?"":" WHERE " + strWhere);
            map.put("group", strGroup.length()==0?"":" GROUP BY " + strGroup);
            map.put("order", strOrder.length()==0?"":" ORDER BY " + strOrder);

            session = sqlSessionFactory.openSession();
            objects = session.selectList("AgenteAduanalWhere",map);

            ok = true;
            
        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void getOneAgenteAduanal(String strWhere){

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("where", strWhere.length()==0?"":" WHERE " + strWhere);

            session = sqlSessionFactory.openSession();
            object = session.selectOne("AgenteAduanalWhere",map);

            ok = true;
            
        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void AgenteAduanalInsert(AgenteAduanal object) {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.insert("AgenteAduanalInsert", object);
            session.commit();
            ok = true;

        } catch (PersistenceException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void AgenteAduanalUpdate(AgenteAduanal object){

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.update("AgenteAduanalUpdate",object);
            session.commit();

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

    public void AgenteAduanalDelete(Integer id){

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.delete("AgenteAduanalDelete",id);
            session.commit();

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if(GrucasDomainConfig.DEBUG){
                ex.printStackTrace();
            }

        }catch(Exception exception){

            if(GrucasDomainConfig.DEBUG){
                exception.printStackTrace();
            }

        } finally {

            if(session != null){
                session.close();
            }

        }
    }

}