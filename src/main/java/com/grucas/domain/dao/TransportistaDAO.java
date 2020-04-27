/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.dao;

import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.model.Transportista;
import com.rubik.logger.LoggerImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author GrucasDev
 */
public class TransportistaDAO {

    private Integer id = 0;
    private List<Transportista> objects = null;
    private Boolean ok = false;
    private Integer err_code = 0;
    private final SqlSessionFactory sqlSessionFactory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Transportista> getObjects() {
        return objects;
    }

    public void setObjects(List<Transportista> objects) {
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

    public TransportistaDAO(String env) {
        sqlSessionFactory = FactorySessionGrucas.getGrucasSqlSessionFactory(env);
    }

    public void getTransportistaID() {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            id = session.selectOne("TransportistaMaxID");

            if (id == null) {
                id = 1;
            }

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if (GrucasDomainConfig.DEBUG) {
                ex.printStackTrace();
            }

        } catch (Exception exception) {

            if (GrucasDomainConfig.DEBUG) {
                exception.printStackTrace();
            }

        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

    public void getTransportista(String strWhere, String strGroup, String strOrder) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("where", strWhere.length() == 0 ? "" : " WHERE " + strWhere);
            map.put("group", strGroup.length() == 0 ? "" : " GROUP BY " + strGroup);
            map.put("order", strOrder.length() == 0 ? "" : " ORDER BY " + strOrder);

            session = sqlSessionFactory.openSession();
            objects = session.selectList("TransportistaWhere", map);

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if (GrucasDomainConfig.DEBUG) {
                ex.printStackTrace();
            }

        } catch (Exception exception) {

            if (GrucasDomainConfig.DEBUG) {
                exception.printStackTrace();
            }

        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

    public void TransportistaInsert(Transportista object) {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.insert("TransportistaInsert", object);
            session.commit();
            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if (GrucasDomainConfig.DEBUG) {
                ex.printStackTrace();
            }

        } catch (Exception exception) {

            if (GrucasDomainConfig.DEBUG) {
                exception.printStackTrace();
            }

        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

    public void TransportistaUpdate(Transportista object) {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.update("TransportistaUpdate", object);
            session.commit();

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if (GrucasDomainConfig.DEBUG) {
                ex.printStackTrace();
            }

        } catch (Exception exception) {

            if (GrucasDomainConfig.DEBUG) {
                exception.printStackTrace();
            }

        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

    public void TransportistaDelete(Integer id) {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.delete("TransportistaDelete", id);
            session.commit();

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            if (GrucasDomainConfig.DEBUG) {
                ex.printStackTrace();
            }

        } catch (Exception exception) {

            if (GrucasDomainConfig.DEBUG) {
                exception.printStackTrace();
            }

        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

}
