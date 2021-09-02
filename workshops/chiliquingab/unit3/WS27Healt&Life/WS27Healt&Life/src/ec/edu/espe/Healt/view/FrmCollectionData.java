/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Healt.view;

import ec.edu.espe.Healt.controller.PatientController;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class FrmCollectionData extends javax.swing.JFrame {

    /**
     * Creates new form FrmCollectionData
     */
    public FrmCollectionData() {
        initComponents();
        
        buttonGener.add(rdbMale);
        buttonGener.add(rdbFemale);
        
        SpinnerNumberModel num = new  SpinnerNumberModel ();
        
        num.setMaximum(100);
        num.setMinimum(0);
        spnAge.setModel(num);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGener = new javax.swing.ButtonGroup();
        dskPanel = new javax.swing.JDesktopPane();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtAdmissionDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rdbMale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDirection = new javax.swing.JTextArea();
        rdbFemale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtWeith = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        spnAge = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtOcupation = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dskPanel.setBackground(new java.awt.Color(153, 153, 153));

        txtPhoneNumber.setBackground(new java.awt.Color(204, 204, 204));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Id");

        txtAdmissionDate.setBackground(new java.awt.Color(204, 204, 204));
        txtAdmissionDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmissionDateActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Admission Date");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Gender");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Direction");

        rdbMale.setText("Male");
        rdbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMaleActionPerformed(evt);
            }
        });

        txaDirection.setBackground(new java.awt.Color(204, 204, 204));
        txaDirection.setColumns(20);
        txaDirection.setRows(5);
        jScrollPane1.setViewportView(txaDirection);

        rdbFemale.setText("Female");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Weith");

        txtWeith.setBackground(new java.awt.Color(204, 204, 204));
        txtWeith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeithActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Phone number");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("                                                           Healt&Life");
        jLabel7.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Age");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(204, 204, 204));

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtID.setBackground(new java.awt.Color(204, 204, 204));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Ocupation");

        txtOcupation.setBackground(new java.awt.Color(204, 204, 204));
        txtOcupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOcupationActionPerformed(evt);
            }
        });

        dskPanel.setLayer(txtPhoneNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(txtAdmissionDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(rdbMale, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(rdbFemale, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(txtWeith, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(txtEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(txtName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(spnAge, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(txtID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPanel.setLayer(txtOcupation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dskPanelLayout = new javax.swing.GroupLayout(dskPanel);
        dskPanel.setLayout(dskPanelLayout);
        dskPanelLayout.setHorizontalGroup(
            dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dskPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dskPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dskPanelLayout.createSequentialGroup()
                                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11))
                                .addGap(26, 26, 26)
                                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbMale)
                                    .addGroup(dskPanelLayout.createSequentialGroup()
                                        .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdbFemale)
                                            .addGroup(dskPanelLayout.createSequentialGroup()
                                                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnAge, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dskPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtOcupation))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dskPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(txtAdmissionDate))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dskPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtWeith))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dskPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPhoneNumber))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dskPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dskPanelLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dskPanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(68, 68, 68))
        );
        dskPanelLayout.setVerticalGroup(
            dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dskPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dskPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dskPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(spnAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rdbMale))
                .addGap(5, 5, 5)
                .addComponent(rdbFemale)
                .addGap(18, 18, 18)
                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtWeith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtAdmissionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtOcupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dskPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtAdmissionDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmissionDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmissionDateActionPerformed

    private void rdbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbMaleActionPerformed

    private void txtWeithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeithActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeithActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String generButton = "";

        if (rdbFemale.isSelected()) {
            generButton = "Female";
        } else if (rdbMale.isSelected()) {
            generButton = "Male";
        }
        
        String gender = generButton;
        String age = spnAge.getValue().toString();
        String name = txtName.getText();
        String id = txtID.getText();
        String direction = txaDirection.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String email = txtEmail.getText();
        String ocupation = txtOcupation.getText();
        String addmisionDate = txtAdmissionDate.getText();
        
        PatientController patient = new PatientController();
        patient.addPatient(name, ABORT, WIDTH, gender, direction, ERROR, ocupation, email, TOP_ALIGNMENT, addmisionDate);
        
        JOptionPane.showMessageDialog(rootPane, "Tu informacion ha sido guardada correctamente, \nTu codigo de usuario es ");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtOcupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOcupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOcupationActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCollectionData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCollectionData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCollectionData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCollectionData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCollectionData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGener;
    private javax.swing.JDesktopPane dskPanel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JSpinner spnAge;
    private javax.swing.JTextArea txaDirection;
    private javax.swing.JTextField txtAdmissionDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOcupation;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtWeith;
    // End of variables declaration//GEN-END:variables
}