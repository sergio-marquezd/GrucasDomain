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
public class FactorySession {

    private static Map<String, Object> sessions;
    private static final String[] enviroments = new String[]{"catalogos", "home"};

    static {

        try {

            if (sessions == null) {
                sessions = new HashMap();

                for (int i = 0; i < enviroments.length; i++) {
                    Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
                    sessions.put(enviroments[i], new SqlSessionFactoryBuilder().build(reader, enviroments[i]));
                }

            }

        } catch (IOException ex) {
            Logger.getLogger(FactorySession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static SqlSessionFactory getSqlSessionFactory(String enviroment) {
        return (SqlSessionFactory) sessions.get(enviroment);
    }

    public static Connection getConnection(String env) {
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) sessions.get(env);
        return sqlSessionFactory.openSession().getConnection();
    }

}
