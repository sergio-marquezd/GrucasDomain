/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.expediente.model;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.FactorySessionGrucas;
import com.rubik.logger.LoggerImpl;
import java.util.HashMap;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author GRUCAS
 */
public class ExpedienteServerDAO {

    private Integer id = 0;
    private ExpedienteServer object = null;
    private Boolean ok = false;
    private Integer err_code = 0;
    private final SqlSessionFactory sqlSessionFactory;

    public ExpedienteServerDAO(String env) {
        sqlSessionFactory = FactorySessionGrucas.getGrucasSqlSessionFactory(env);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ExpedienteServer getObject() {
        return object;
    }

    public void setObject(ExpedienteServer object) {
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

    public void getServer(){
        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            object = (ExpedienteServer) session.selectList("getServer").get(0);

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