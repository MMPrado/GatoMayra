/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clases.Gato;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ca_tics
 */
public class FrmIntro extends javax.swing.JFrame {

    final JPanel panel = new JPanel();
    private Gato g1;

    /**
     * Creates new form FrmIntro
     */
    public FrmIntro(Gato g1) {
        initComponents();
        setLocationRelativeTo(null);
        this.g1 = g1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtJugador1 = new javax.swing.JTextField();
        txtJugador2 = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rbtnX1 = new javax.swing.JRadioButton();
        rbtnO1 = new javax.swing.JRadioButton();
        rbtnX2 = new javax.swing.JRadioButton();
        rbtnO2 = new javax.swing.JRadioButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102)));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("Juego del Gato");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Jugador #1:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Jugador #2:");

        txtJugador1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtJugador1.setToolTipText("Escriba un nombre");
        txtJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJugador1ActionPerformed(evt);
            }
        });

        txtJugador2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtJugador2.setToolTipText("Escriba un nombre");

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 51, 102));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato_pics/gato.png"))); // NOI18N

        buttonGroup1.add(rbtnX1);
        rbtnX1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbtnX1.setForeground(new java.awt.Color(255, 51, 51));
        rbtnX1.setSelected(true);
        rbtnX1.setText("X");
        rbtnX1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnX1ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtnO1);
        rbtnO1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbtnO1.setForeground(new java.awt.Color(255, 51, 51));
        rbtnO1.setText("O");
        rbtnO1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnO1ItemStateChanged(evt);
            }
        });

        buttonGroup2.add(rbtnX2);
        rbtnX2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbtnX2.setForeground(new java.awt.Color(255, 51, 51));
        rbtnX2.setText("X");
        rbtnX2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnX2ItemStateChanged(evt);
            }
        });

        buttonGroup2.add(rbtnO2);
        rbtnO2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbtnO2.setForeground(new java.awt.Color(255, 51, 51));
        rbtnO2.setSelected(true);
        rbtnO2.setText("O");
        rbtnO2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnO2ItemStateChanged(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato_pics/cerrar-ventana-icono-5596-16.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegresar)
                                    .addComponent(txtJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbtnX2)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtnO2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbtnX1)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtnO1))
                                    .addComponent(txtJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnSalir))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1))
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnX1)
                    .addComponent(rbtnO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnX2)
                    .addComponent(rbtnO2))
                .addGap(44, 44, 44)
                .addComponent(btnRegresar)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
       
       g1.setBanInicio(true);// inicializa la bandera de inicio
        g1.setJugador1(txtJugador1.getText()); // guarda el nombre del jugador 1
        g1.setJugador2(txtJugador2.getText()); // guarda el nombre del jugador 2
        if (rbtnX1.isSelected()) {
            g1.setTiroJ1(1);
            //g1.setTiroJ2(2);
        } else {
            g1.setTiroJ1(2);
            //g1.setTiroJ2(1);
        }// debe de estar completo el formulario, sin campos vacios
        if (txtJugador1.getText().length() == 0 || txtJugador2.getText().length() == 0) {
            JOptionPane.showMessageDialog(panel, "Ingrese nombres", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
             
        } else {
            this.setVisible(false);
            
        }
       
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void rbtnX1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnX1ItemStateChanged
        // TODO add your handling code here:
        if (rbtnX1.isSelected()) {
            rbtnX2.setSelected(false);
        } else {
            rbtnX2.setSelected(true);
        }
    }//GEN-LAST:event_rbtnX1ItemStateChanged

    private void rbtnX2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnX2ItemStateChanged
        // TODO add your handling code here:
        if (rbtnX2.isSelected()) {
            rbtnX1.setSelected(false);
        } else {
            rbtnX1.setSelected(true);
        }
    }//GEN-LAST:event_rbtnX2ItemStateChanged

    private void rbtnO1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnO1ItemStateChanged
        // TODO add your handling code here:
        if (rbtnO1.isSelected()) {
            rbtnO2.setSelected(false);
        } else {
            rbtnO2.setSelected(true);
        }
    }//GEN-LAST:event_rbtnO1ItemStateChanged

    private void rbtnO2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnO2ItemStateChanged
        // TODO add your handling code here:
        if (rbtnO2.isSelected()) {
            rbtnO1.setSelected(false);
        } else {
            rbtnO1.setSelected(true);
        }
    }//GEN-LAST:event_rbtnO2ItemStateChanged

    private void txtJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJugador1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        //permite salir del juego por medio de un boton
        int resp = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir?");
        if (JOptionPane.OK_OPTION == resp) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmIntro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmIntro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmIntro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmIntro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmIntro().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtnO1;
    private javax.swing.JRadioButton rbtnO2;
    private javax.swing.JRadioButton rbtnX1;
    private javax.swing.JRadioButton rbtnX2;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables
}
