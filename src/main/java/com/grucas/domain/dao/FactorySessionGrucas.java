/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author Grucas
 */
public class FactorySessionGrucas {

    private static Map<String, Object> GRUCAS_SESSIONS;
    private static final String[] ENV_ARRAY_GRUCAS = new String[]{"catalogos"};

    static {

        try {

            if (GRUCAS_SESSIONS == null) {
                GRUCAS_SESSIONS = new HashMap();

                for (int i = 0; i < ENV_ARRAY_GRUCAS.length; i++) {
                    Reader reader = Resources.getResourceAsReader("grucas_conf.xml");
                    GRUCAS_SESSIONS.put(ENV_ARRAY_GRUCAS[i], new SqlSessionFactoryBuilder().build(reader, ENV_ARRAY_GRUCAS[i]));
                }

            }

        } catch (IOException ex) {
            Logger.getLogger(FactorySessionGrucas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static SqlSessionFactory getGrucasSqlSessionFactory(String enviroment) {
        return (SqlSessionFactory) GRUCAS_SESSIONS.get(enviroment);
    }

    public static Connection getGrucasConnection(String env) {
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) GRUCAS_SESSIONS.get(env);
        return sqlSessionFactory.openSession().getConnection();
    }

}
