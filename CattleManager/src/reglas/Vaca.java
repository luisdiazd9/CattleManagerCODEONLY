/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Vaca {
    
    private int identificacion;
    private boolean sexo;
    private String raza;
    private int codigoMadre;
    private Date fechaNacimiento;
    private Date fechaIncorporacion;
    private Date fechaSacrificio;
    private String uso;
    private boolean estado;

    public Vaca(int identificacion, boolean sexo, String raza, int codigoMadre, Date fechaNacimiento, Date fechaIncorporacion, String uso) {
        this.identificacion = identificacion;
        this.sexo = sexo;
        this.raza = raza;
        this.codigoMadre = codigoMadre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIncorporacion = fechaIncorporacion;
        this.uso = uso;
        this.estado = false;
    }
    
    public void sacrificioVaca(Date fechaSacrificioVaca){
        int respuesta = JOptionPane.showConfirmDialog(null, "El estado del bovino cambiará a sacrificado. Seleccione NO para cancelar", "Confirmación de cambio", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0){
            estado = true;
            fechaSacrificio = fechaSacrificioVaca;
        }
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getCodigoMadre() {
        return codigoMadre;
    }

    public void setCodigoMadre(int codigoMadre) {
        this.codigoMadre = codigoMadre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaSacrificio() {
        return fechaSacrificio;
    }

    public void setFechaSacrificio(Date fechaSacrificio) {
        this.fechaSacrificio = fechaSacrificio;
    }
    
    
    
    
}
