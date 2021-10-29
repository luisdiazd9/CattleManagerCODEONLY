/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


import javax.swing.JComboBox;

/**
 *
 * @author PC
 */
public class TipoUsuarios {
    
    public static void Tipo(JComboBox ComboTipo) {
        
        ComboTipo.addItem("Administrador");
        ComboTipo.addItem("Usuario");
        
    }
    
}
