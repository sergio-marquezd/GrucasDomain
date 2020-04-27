/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.clientes.cabot.dao;

import com.grucas.domain.clientes.cabot.domain.ReportKPICABOT;
import com.grucas.domain.config.GrucasDomainConfig;
import com.grucas.domain.dao.FactorySessionGrucas;
import com.rubik.logger.LoggerImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author GRUCAS
 */
public class ReportKPICABOTDAO {

    private Integer id = 0;
    private List<ReportKPICABOT> objects = null;
    private ReportKPICABOT object = null;
    private Boolean ok = false;
    private Integer err_code = 0;
    private final SqlSessionFactory sqlSessionFactory;

    public ReportKPICABOTDAO(String env) {
        sqlSessionFactory = FactorySessionGrucas.getGrucasSqlSessionFactory(env);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ReportKPICABOT> getObjects() {
        return objects;
    }

    public void setObjects(List<ReportKPICABOT> objects) {
        this.objects = objects;
    }

    public ReportKPICABOT getObject() {
        return object;
    }

    public void setObject(ReportKPICABOT object) {
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

    public void getTerrestreKPI_1_Enero(Integer year, String campoFecha1, String campoFecha2, String dias_ok, String dias_fail) {
        
        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("year", year);
            map.put("fecha1", campoFecha1);
            map.put("fecha2", campoFecha2);
            map.put("dias_ok", dias_ok);
            map.put("dias_fail", dias_fail);
            session = sqlSessionFactory.openSession();
            object = session.selectOne("Enero", map);
            if (object == null) {
                object = new ReportKPICABOT();
                object.setOperaciones_totales(0);
                object.setOperaciones_fail(0);
                object.setOperaciones_ok(0);
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

    public void getTerrestreKPI_1_Febrero(Integer year, String campoFecha1, String campoFecha2, String dias_ok, String dias_fail) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("year", year);
            map.put("fecha1", campoFecha1);
            map.put("fecha2", campoFecha2);
            map.put("dias_ok", dias_ok);
            map.put("dias_fail", dias_fail);
            session = sqlSessionFactory.openSession();
            object = session.selectOne("Febrero", map);

            if (object == null) {
                object = new ReportKPICABOT();
                object.setOperaciones_totales(0);
                object.setOperaciones_fail(0);
                object.setOperaciones_ok(0);
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

    public void getTerrestreKPI_1_Marzo(Integer year, String campoFecha1, String campoFecha2, String dias_ok, String dias_fail) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("year", year);
            map.put("fecha1", campoFecha1);
            map.put("fecha2", campoFecha2);
            map.put("dias_ok", dias_ok);
            map.put("dias_fail", dias_fail);
            session = sqlSessionFactory.openSession();
            object = session.selectOne("Marzo", map);
            if (object == null) {
                object = new ReportKPICABOT();
                object.setOperaciones_totales(0);
                object.setOperaciones_fail(0);
                object.setOperaciones_ok(0);
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

    public void getTerrestreKPI_1_Abril(Integer year, String campoFecha1, String campoFecha2, String dias_ok, String dias_fail) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("year", year);
            map.put("fecha1", campoFecha1);
            map.put("fecha2", campoFecha2);
            map.put("dias_ok", dias_ok);
            map.put("dias_fail", dias_fail);
            session = sqlSessionFactory.openSession();
            object = session.selectOne("Abril", map);
            if (object == null) {
                object = new ReportKPICABOT();
                object.setOperaciones_totales(0);
                object.setOperaciones_fail(0);
                object.setOperaciones_ok(0);
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

    public void getTerrestreKPI_1_Mayo(Integer year, String campoFecha1, String campoFecha2, String dias_ok, String dias_fail) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("year", year);
            map.put("fecha1", campoFecha1);
            map.put("fecha2", campoFecha2);
            map.put("dias_ok", dias_ok);
            map.put("dias_fail", dias_fail);
            session = sqlSessionFactory.openSession();
            object = session.selectOne("Mayo", map);
            if (object == null) {
                object = new ReportKPICABOT();
                object.setOperaciones_totales(0);
                object.setOperaciones_fail(0);
                object.setOperaciones_ok(0);
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

    public void getTerrestreKPI_1_Junio(Integer year, String campoFecha1, String campoFecha2, String dias_ok, String dias_fail) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("year", year);
            map.put("fecha1", campoFecha1);
            map.put("fecha2", campoFecha2);
            map.put("dias_ok", dias_ok);
            map.put("dias_fail", dias_fail);
            session = sqlSessionFactory.openSession();
            object = session.selectOne("Junio", map);

            if (object == null) {
                object = new ReportKPICABOT();
                object.setOperaciones_totales(0);
                object.setOperaciones_fail(0);
                object.setOperaciones_ok(0);
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

    public void getTerrestreKPI_1_Julio(Integer year, String campoFecha1, String campoFecha2, String dias_ok, String dias_fail) {

        SqlSession session = null;

        try {
            Map map = new HashMap();
            map.put("year", year);
            map.put("fecha1", campoFecha1);
            map.put("fecha2", campoFecha2);
            map.put("dias_ok", dias_ok);
            map.put("dias_fail", dias_fail);
            session = sqlSessionFactory.openSession();
            object = session.selectOne("Julio", map);

            if (object == null) {
                object = new ReportKPICABOT();
                object.setOperaciones_totales(0);
                object.setOperaciones_fail(0);
                object.setOperaciones_ok(0);
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

    public void getTerrestreKPI_1_Agosto(Integer year, String campoFecha1, String campoFecha2, String dias_ok, String dias_fail) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("year", year);
            map.put("fecha1", campoFecha1);
            map.put("fecha2", campoFecha2);
            map.put("dias_ok", dias_ok);
            map.put("dias_fail", dias_fail);
            session = sqlSessionFactory.openSession();
            object = session.selectOne("Agosto", map);

            if (object == null) {
                object = new ReportKPICABOT();
                object.setOperaciones_totales(0);
                object.setOperaciones_fail(0);
                object.setOperaciones_ok(0);
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

    public void getTerrestreKPI_1_Septiembre(Integer year, String campoFecha1, String campoFecha2, String dias_ok, String dias_fail) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("year", year);
            map.put("fecha1", campoFecha1);
            map.put("fecha2", campoFecha2);
            map.put("dias_ok", dias_ok);
            map.put("dias_fail", dias_fail);
            session = sqlSessionFactory.openSession();
            object = session.selectOne("Septiembre", map);

            if (object == null) {
                object = new ReportKPICABOT();
                object.setOperaciones_totales(0);
                object.setOperaciones_fail(0);
                object.setOperaciones_ok(0);
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

    public void getTerrestreKPI_1_Octubre(Integer year, String campoFecha1, String campoFecha2, String dias_ok, String dias_fail) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("year", year);
            map.put("fecha1", campoFecha1);
            map.put("fecha2", campoFecha2);
            map.put("dias_ok", dias_ok);
            map.put("dias_fail", dias_fail);
            session = sqlSessionFactory.openSession();
            object = session.selectOne("Octubre", map);

            if (object == null) {
                object = new ReportKPICABOT();
                object.setOperaciones_totales(0);
                object.setOperaciones_fail(0);
                object.setOperaciones_ok(0);
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

    public void getTerrestreKPI_1_Noviembre(Integer year, String campoFecha1, String campoFecha2, String dias_ok, String dias_fail) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("year", year);
            map.put("fecha1", campoFecha1);
            map.put("fecha2", campoFecha2);
            map.put("dias_ok", dias_ok);
            map.put("dias_fail", dias_fail);
            session = sqlSessionFactory.openSession();
            object = session.selectOne("Noviembre", map);

            if (object == null) {
                object = new ReportKPICABOT();
                object.setOperaciones_totales(0);
                object.setOperaciones_fail(0);
                object.setOperaciones_ok(0);
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

    public void getTerrestreKPI_1_Diciembre(Integer year, String campoFecha1, String campoFecha2, String dias_ok, String dias_fail) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("year", year);
            map.put("fecha1", campoFecha1);
            map.put("fecha2", campoFecha2);
            map.put("dias_ok", dias_ok);
            map.put("dias_fail", dias_fail);
            session = sqlSessionFactory.openSession();
            object = session.selectOne("Diciembre", map);

            if (object == null) {
                object = new ReportKPICABOT();
                object.setOperaciones_totales(0);
                object.setOperaciones_fail(0);
                object.setOperaciones_ok(0);
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

}
