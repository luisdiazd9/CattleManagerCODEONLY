/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import reglas.*;
import java.io.*;

/**
 *
 * @author Usuario
 */
public class DatosCertificado {
    
        public void generarCertificado(Vaca vaca) {
        FileWriter fileWriter;
        PrintWriter printWriter;
        String numeroCertificado = "Certificado CO"+ String.valueOf(vaca.getIdentificacion())+".txt";
        Certificado datos = new Certificado(vaca);
        datos.generarCerficado();
        try {
            fileWriter = new FileWriter(numeroCertificado, true);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println(datos.getCertificado());
            fileWriter.close();
        } catch (Exception exception) {
            System.out.println("Error");
        }
    }
    
}
