/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import datos.DatosCertificado;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Usuario
 */
public class Certificado {

    private Vaca datos;
    private DatosCertificado archivo;
    private String certificado;

    public Certificado(Vaca datos) {
        this.datos = datos;
    }

    public void generarCerficado() {
        DateFormat formatoFecha= new SimpleDateFormat("dd/MM/YYYY") ;
        certificado="DOCUMENTO DE IDENTIFICACIÓN PARA BOVINOS";
        certificado = certificado + "\nCÓDIGO: CO-" + String.valueOf(datos.getIdentificacion());
        certificado = certificado + "\nFECHA DE NACIMIENTO: " + formatoFecha.format(datos.getFechaNacimiento());
        if (datos.isSexo()) {
            certificado = certificado + "\nSEXO: MACHO";
        } else {
            certificado = certificado + "\nSEXO: HEMBRA";
        }
        certificado = certificado + "\nCÓDIGO MADRE: CO" + String.valueOf(datos.getCodigoMadre());
        certificado = certificado + "\nRAZA: " + datos.getRaza();
        certificado = certificado + "\nPROPÓSITO: " + datos.getUso();
        certificado = certificado + "\nFECHA DE INCORPORACIÓN A LA EXPLOTACIÓN: " + formatoFecha.format(datos.getFechaIncorporacion());
        certificado = certificado + "\nFECHA DE SACRIFICIO: " + formatoFecha.format(datos.getFechaSacrificio());
    }

    public Vaca getDatos() {
        return datos;
    }

    public void setDatos(Vaca datos) {
        this.datos = datos;
    }

    public DatosCertificado getArchivo() {
        return archivo;
    }

    public void setArchivo(DatosCertificado archivo) {
        this.archivo = archivo;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

}
