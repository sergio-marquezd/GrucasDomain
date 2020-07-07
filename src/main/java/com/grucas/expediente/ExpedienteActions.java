/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.expediente;

import com.grucas.expediente.model.ExpedienteGrucas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author GRUCAS
 */
public class ExpedienteActions {
    
    public static Boolean saveDocument(InputStream input, ExpedienteGrucas ed_node) {

        File archivoCopia = null;

        try {
            archivoCopia
                    = new File(ed_node.getPath() + System.getProperty("file.separator") + ed_node.getFilename());

            OutputStream output;
            output = new FileOutputStream(archivoCopia);

            byte[] buffer = new byte[1024];// un buffer de 1 KB
            int bytes = input.read(buffer);
            int data = 0;
            while (bytes > 0) {
                output.write(buffer, 0, bytes);
                data += bytes;//Compruebo el tamaño del archivo en bytes
                long i = System.nanoTime();
                bytes = input.read(buffer);//leo unos bytes del input
                long f = i - System.nanoTime();//Tomo los nanosegundos que han pasado despues de leer
            }

            input.close();
            output.close();
            
            if(archivoCopia.exists()){
                return true;
            }else{
                return false;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("[ERROR] " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("[ERROR] " + e.getMessage());
        }

        return true;
    }

    public static Boolean deleteDocument(){
        return false;
    }    
    
}
