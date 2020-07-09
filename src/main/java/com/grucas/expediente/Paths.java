/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.expediente;

import com.grucas.expediente.model.ExpedienteServerService;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

/**
 *
 * @author GRUCAS
 */
public class Paths {
    
    public static String ROOT_PATH = "";
    public static final String SEPARADOR = System.getProperty("file.separator");

    public static String getPathFotografiaPrevios(String rfc_cliente, String folio_operacion){
        ROOT_PATH = getRootPath();
        
        String path = 
                getPathOperaciones(rfc_cliente, folio_operacion) + SEPARADOR + "Fotografias";

        if(!createPath(new File(path))){
            System.out.println("ERROR .- No se pudo crear la ruta : " + path );
        }
        return path;
    }
    
    public static String getPathOperaciones(String rfc_cliente, String folio_operacion){
        ROOT_PATH = getRootPath();
        
        String path = 
                ROOT_PATH + SEPARADOR
                + "ED_Operaciones" + SEPARADOR
                + rfc_cliente + SEPARADOR
                + getYear() + SEPARADOR 
                + folio_operacion;

        if(!createPath(new File(path))){
            System.out.println("ERROR .- No se pudo crear la ruta : " + path );
        }
        return path;
    }
    
    public static String getPathCompras(){
        return "";
    }
    
    public static String getPathExpedienteInternoClientes(){
        return "";
    }
    
    public static String getPathCalidad(){
        return "";
    }
    
    
    
    
    
    public static String getRootPath(){
        String rootPath = "";
        
        try {
            /**
             * IP Del servidor. 192.168.2.113 = web.grucas.com
             */
            if("192.168.2.113".equals(InetAddress.getLocalHost().getHostAddress().trim())){
                ExpedienteServerService domain = new ExpedienteServerService();
                domain.getServer();
                rootPath = domain.getObject().getPath_documents();
            }else{
                rootPath = System.getProperty("catalina.base");
            }
        } catch (UnknownHostException ex) {
            //rootPath = System.getProperty("catalina.base") + SEPARADOR;
            ex.printStackTrace();
        }
        
        return rootPath;
    }
    
    public static String getYear(){
        LocalDateTime now = LocalDateTime.now();
        String year = now.getYear() + "";
        return year;
    }
    
    public static Boolean createPath(File path){
        if (path.exists()) {
            return true;
        } else {
            if (path.mkdirs()) {
                return true;
            } else {
                return false;
            }
        }
    }
    
}