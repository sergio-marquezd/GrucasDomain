package com.grucas.domain.dao;

import com.grucas.domain.model.Empresa;
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
public class EmpresaDAO {

    private Integer id = 0;
    private List<Empresa> objects = null;
    private Empresa object = null;
    private Boolean ok = false;
    private Integer err_code = 0;
    private final SqlSessionFactory sqlSessionFactory;

    public EmpresaDAO(String env) {
        sqlSessionFactory = FactorySessionGrucas.getGrucasSqlSessionFactory(env);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Empresa> getObjects() {
        return objects;
    }

    public void setObjects(List<Empresa> objects) {
        this.objects = objects;
    }

    public Empresa getObject() {
        return object;
    }

    public void setObject(Empresa object) {
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

    public void getEmpresaID() {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            id = session.selectOne("EmpresaMaxID");

            if (id == null) {
                id = 1;
            }

            ok = true;

        } catch (SqlSessionException ex) {
            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");
            ex.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

    public void getEmpresa(String strWhere, String strGroup, String strOrder) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("where", strWhere.length() == 0 ? "" : " WHERE " + strWhere);
            map.put("group", strGroup.length() == 0 ? "" : " GROUP BY " + strGroup);
            map.put("order", strOrder.length() == 0 ? "" : " ORDER BY " + strOrder);

            session = sqlSessionFactory.openSession();
            objects = session.selectList("EmpresaWhere", map);

            ok = true;

        } catch (SqlSessionException ex) {
            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");
            ex.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

    public void getOneEmpresa(String strWhere) {

        SqlSession session = null;

        try {

            Map map = new HashMap();
            map.put("where", strWhere.length() == 0 ? "" : " WHERE " + strWhere);

            session = sqlSessionFactory.openSession();
            object = session.selectOne("EmpresaWhere", map);

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");
            ex.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

    public void EmpresaInsert(Empresa object) {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.insert("EmpresaInsert", object);
            session.commit();
            ok = true;

        } catch (PersistenceException ex) {
            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");
            ex.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();

        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

    public void EmpresaUpdate(Empresa object) {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.update("EmpresaUpdate", object);
            session.commit();

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");
            ex.printStackTrace();
        } catch (Exception exception) {

            exception.printStackTrace();
        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

    public void EmpresaDelete(Integer id) {

        SqlSession session = null;

        try {

            session = sqlSessionFactory.openSession();
            session.delete("EmpresaDelete", id);
            session.commit();

            ok = true;

        } catch (SqlSessionException ex) {

            LoggerImpl.SEVERE(getClass().toString(), ex.toString() + "\n");

            ex.printStackTrace();

        } catch (Exception exception) {
            exception.printStackTrace();

        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

}