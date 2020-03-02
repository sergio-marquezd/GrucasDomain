/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.dao;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.model.KPI;
import com.rubik.logger.LoggerImpl;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author GrucasDev
 */
public class ReportKPIDAO {
    private Integer id = 0;
    private List<KPI> objects = null;
    private KPI object = null;
    private Boolean ok = false;
    private Integer err_code = 0;
    private final SqlSessionFactory sqlSessionFactory;
    
     public ReportKPIDAO(String env) {
        sqlSessionFactory = FactorySessionGrucas.getGrucasSqlSessionFactory(env);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<KPI> getObjects() {
        return objects;
    }

    public void setObjects(List<KPI> objects) {
        this.objects = objects;
    }

    public KPI getObject() {
        return object;
    }

    public void setObject(KPI object) {
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
    
    
        public void getKPI1() {

        SqlSession session = null;

        try {


            object = session.selectOne("KPI1");
            if (object == null) {
                object = new KPI();
                object.setTotal(0);
                object.setCumplen(0);
                object.setExitoso(0);
            }

            ok = true;

        } 
        catch (SqlSessionException ex) {

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
        
     public void getKPI2() {

        SqlSession session = null;

        try {


            object = session.selectOne("KPI2");
            if (object == null) {
                object = new KPI();
                object.setTotal(0);
                object.setCumplen(0);
                object.setExitoso(0);
            }

            ok = true;

        } 
        catch (SqlSessionException ex) {

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
     
      public void getKPI3() {

        SqlSession session = null;

        try {


            object = session.selectOne("KPI3");
            if (object == null) {
                object = new KPI();
                object.setTotal(0);
                object.setCumplen(0);
                object.setExitoso(0);
            }

            ok = true;

        } 
        catch (SqlSessionException ex) {

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
      
     public void getKPI3a() {

        SqlSession session = null;

        try {


            object = session.selectOne("KPI3a");
            if (object == null) {
                object = new KPI();
                object.setTotal(0);
                object.setCumplen(0);
                object.setExitoso(0);
            }

            ok = true;

        } 
        catch (SqlSessionException ex) {

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
