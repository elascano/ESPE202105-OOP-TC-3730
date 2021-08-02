/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.controller;

import ec.edu.espe.purchaseandsalesrecordgui.view.FrmMenuOption;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.dbmanager.MongoDB;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan Lituma
 */
public class FrmDatabaseSetup extends javax.swing.JFrame {

    MongoDB mongoDB = MongoDB.getInstance();
    public static MongoDatabase database;

    /**
     * Creates new form FrmDatabaseSetup
     */
    public FrmDatabaseSetup() {
        initComponents();
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserDatabase = new javax.swing.JTextField();
        pswDatabase = new javax.swing.JPasswordField();
        btnLogInDatabase = new javax.swing.JButton();
        txtNameDatabase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        jlbDatabaseTitle = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User");

        jLabel2.setText("Password");

        txtUserDatabase.setText("Luis");
        txtUserDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserDatabaseActionPerformed(evt);
            }
        });

        pswDatabase.setText("123");

        btnLogInDatabase.setText("Log In");
        btnLogInDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInDatabaseActionPerformed(evt);
            }
        });

        txtNameDatabase.setText("DatabaseStore");

        jLabel3.setText("Name of Database");

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jlbDatabaseTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/databaseTitle.png"))); // NOI18N
        jlbDatabaseTitle.setText("Database");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogInDatabase)
                        .addGap(117, 117, 117)
                        .addComponent(btnReturn)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbDatabaseTitle)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserDatabase)
                            .addComponent(pswDatabase)
                            .addComponent(txtNameDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlbDatabaseTitle)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pswDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogInDatabase)
                    .addComponent(btnReturn))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInDatabaseActionPerformed
        // TODO add your handling code here:        
        database = mongoDB.conecction(txtUserDatabase.getText(), pswDatabase.getText(), txtNameDatabase.getText());

        if (database != null) {
            JOptionPane.showMessageDialog(null, "Correct!");
            FrmMenuOption frmMenuOption = new FrmMenuOption();
            frmMenuOption.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Incorret User/Password ");
            this.setVisible(true);
        }
    }//GEN-LAST:event_btnLogInDatabaseActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FrmMenuOption frmMenuOption = new FrmMenuOption();
        frmMenuOption.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtUserDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserDatabaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserDatabaseActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDatabaseSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDatabaseSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDatabaseSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDatabaseSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDatabaseSetup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogInDatabase;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlbDatabaseTitle;
    private javax.swing.JPasswordField pswDatabase;
    private javax.swing.JTextField txtNameDatabase;
    private javax.swing.JTextField txtUserDatabase;
    // End of variables declaration//GEN-END:variables
}
