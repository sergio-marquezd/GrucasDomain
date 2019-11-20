/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.domain.config;

/**
 *
 * @author GrucasDev
 */
public class _Email {
    
    public static String HOST = "mail.grucas.com";
    public static String PORT = "10025";
    public static String USERNAME = "notificaciones@grucas.com";
    public static String PASSWORD = "noti_grucas$";
    public static String SSL = "false";
    public static String STARTTLS = "false";
    public static String SERVER_SSL = "";
    public static String FROM = "notificaciones@grucas.com";
    
    public static String SERVICE_DESK_USERNAME = "soporte@grucas.com";
    public static String SERVICE_DESK_PASSWORD = "s0p0rtedac";
    public static String SERVICE_DESK_FROM = "soporte@grucas.com";

    public static String EMAIL_BODY_TOP = "<html>\n"
            + "\n"
            + "	<head>\n"
            + "		<title>Notificaciones Grucas Logistica</title>\n"
            + "	</head>\n"
            + "		<style type=\"text/css\">\n"
            + "			body{\n"
            + "			  background-color: #FFFFF;\n"
            + "			  width: 700px;\n"
            + "			  float: center;\n"
            + "			  font-family: verdana;\n"
            + "			}\n"
            + "\n"
            + "			h4{\n"
            + "				color: #ff6600;\n"
            + "				font-weight: bold;\n"
            + "			}\n"
            + "\n"
            + "			h3{\n"
            + "				color: #FC4500;\n"
            + "				text-align: center;\n"
            + "				font-weight: bold;\n"
            + "			}\n"
            + "\n"
            + "			hr{\n"
            + "				border-top: 4px solid #ff6600;\n"
            + "			}\n"
            + "\n"
            + "			table{\n"
            + "				background-color: #F3F3F3;\n"
            + "				margin: 0 auto;\n"
            + "				padding: 15px;\n"
            + "			}\n"
            + "\n"
            + "			td{\n"
            + "				height: 95px;\n"
            + "			}\n"
            + "\n"
            + "			tr{\n"
            + "					\n"
            + "			}\n"
            + "\n"
            + "			td.footer{\n"
            + "				background: rgb(255,119,0);\n"
            + "				background: linear-gradient(0deg, rgba(255,119,0,1) 0%, rgba(251,153,62,1) 69%, rgba(255,180,57,1) 94%);\n"
            + "				color: white;\n"
            + "				width: 582px; \n"
            + "				height: 50px; \n"
            + "				text-align: center;\n"
            + "			}\n"
            + "		</style>\n"
            + "	<body>"
            + "\n"
            + "	<table>\n";
    
    
    public static String EMAIL_BODY_BUTTOM
            = "		<tr>\n"
            + "			<td class=\"footer\">\n"
            + "				<p>www.grucas.com</p>\n"
            + "			</td>\n"
            + "		</tr>\n"
            + "	</table>\n"
            + "\n"
            + "	</body>\n"
            + "\n"
            + "</html>";
    
}