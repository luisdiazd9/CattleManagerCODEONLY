/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import login.SqlUsuarios;
import reglas.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import login.SqlUsuarios;
import login.TipoUsuarios;
import login.Hash;
import static presentacion.Login.frmHome;

/**
 *
 * @author Usuario
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoCt.png")).getImage());
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelClave = new javax.swing.JLabel();
        labelConfirmar = new javax.swing.JLabel();
        labelConfirmar1 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        botonCrear = new javax.swing.JButton();
        fieldConfirmar = new javax.swing.JPasswordField();
        fieldClave = new javax.swing.JPasswordField();
        fieldNombre = new javax.swing.JTextField();
        fieldUsuario = new javax.swing.JTextField();
        labelNombre1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setMinimumSize(new java.awt.Dimension(412, 560));
        setPreferredSize(new java.awt.Dimension(412, 560));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelClave.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelClave.setText("Contraseña:");
        getContentPane().add(labelClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        labelConfirmar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelConfirmar.setText("Confirmar");
        getContentPane().add(labelConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        labelConfirmar1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelConfirmar1.setText("contraseña:");
        getContentPane().add(labelConfirmar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        labelNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelNombre.setText("Tipo de usuario:");
        getContentPane().add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        labelUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelUsuario.setText("Usuario:");
        getContentPane().add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        comboTipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        getContentPane().add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 130, 30));

        botonCrear.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        botonCrear.setText("Crear usuario");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        getContentPane().add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

        fieldConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(fieldConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 130, 30));

        fieldClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(fieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 130, 30));

        fieldNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(fieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 130, 30));

        fieldUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(fieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 130, 30));

        labelNombre1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelNombre1.setText("Nombre:");
        getContentPane().add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registroImagen.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void limpiar() {
        fieldUsuario.setText("");
        fieldNombre.setText("");
        fieldClave.setText("");
        fieldConfirmar.setText("");
    }
    
    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        // TODO add your handling code here:

        SqlUsuarios modSql = new SqlUsuarios();
        login.Registro mod = new login.Registro();

        String contra = new String(fieldClave.getPassword());
        String contraConf = new String(fieldConfirmar.getPassword());
        if (fieldUsuario.getText().equals("") || fieldNombre.getText().equals("") || contra.equals("") || contraConf.equals("")) {

            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");

        } else {
            if (contra.equals(contraConf)) {

                try {
                    if (modSql.existeUsuario(fieldUsuario.getText()) == 0) {

                        String nuevaContra = Hash.sha2(contra);

                        mod.setUsuario(fieldUsuario.getText());
                        mod.setContraseña(nuevaContra);
                        mod.setNombre(fieldNombre.getText());
                        mod.setCorreo("hola@chao.com");
                        int tipo = comboTipo.getSelectedIndex();
                        if (tipo == 0) {

                            mod.setId_tipo(1);

                        } else if (tipo == 1) {
                            mod.setId_tipo(2);
                        }
                        //mod.setId_tipo(1);//Cambiar
                        try {
                            if (modSql.registrar(mod)) {
                                JOptionPane.showMessageDialog(null, "Registrado!");
                                limpiar();
                                this.dispose();
                                frmHome = new Principal(mod);
                                frmHome.setVisible(true);

                            } else {
                                JOptionPane.showMessageDialog(null, "Error al guardar");
                            }

                        } catch (SQLException ex) {
                            Logger.getLogger(presentacion.Registro.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(presentacion.Registro.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(presentacion.Registro.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario ya existe");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(presentacion.Registro.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(presentacion.Registro.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas deben coincidir");
            }
        }

    }//GEN-LAST:event_botonCrearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrear;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JPasswordField fieldClave;
    private javax.swing.JPasswordField fieldConfirmar;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel labelClave;
    private javax.swing.JLabel labelConfirmar;
    private javax.swing.JLabel labelConfirmar1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables
}
