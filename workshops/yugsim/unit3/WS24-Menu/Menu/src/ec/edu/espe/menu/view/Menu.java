/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.menu.view;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MnuExit = new javax.swing.JMenu();
        MnuUsers = new javax.swing.JMenu();
        ItmCreate = new javax.swing.JMenuItem();
        ItmChangePassword = new javax.swing.JMenuItem();
        MnuProduct = new javax.swing.JMenu();
        MnuNew = new javax.swing.JMenuItem();
        MnuOld = new javax.swing.JMenuItem();
        MnuBill = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MnuExit.setText("Exit");
        MnuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MnuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(MnuExit);

        MnuUsers.setText("Create user");

        ItmCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        ItmCreate.setText("Create");
        ItmCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmCreateActionPerformed(evt);
            }
        });
        MnuUsers.add(ItmCreate);

        ItmChangePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        ItmChangePassword.setText("Change Password");
        ItmChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmChangePasswordActionPerformed(evt);
            }
        });
        MnuUsers.add(ItmChangePassword);

        jMenuBar1.add(MnuUsers);

        MnuProduct.setText("List of papers");

        MnuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        MnuNew.setText("New");
        MnuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuNewActionPerformed(evt);
            }
        });
        MnuProduct.add(MnuNew);

        MnuOld.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        MnuOld.setText("Old");
        MnuProduct.add(MnuOld);

        jMenuBar1.add(MnuProduct);

        MnuBill.setText(" Papers per reviewer");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Reviewer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MnuBill.add(jMenuItem1);

        jMenuBar1.add(MnuBill);

        jMenu1.setText("Read paper");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Now");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Later");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_MnuExitMouseClicked

    private void ItmCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmCreateActionPerformed
        FrmCreateUser frmCreateUser = new FrmCreateUser();
        frmCreateUser.setVisible(true);
    }//GEN-LAST:event_ItmCreateActionPerformed

    private void ItmChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmChangePasswordActionPerformed
        FrmCreateUser frmCreateUser = new FrmCreateUser();
        frmCreateUser.setVisible(true);
    }//GEN-LAST:event_ItmChangePasswordActionPerformed

    private void MnuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuNewActionPerformed
        FrmListPapers frmListPapers = new FrmListPapers();
        frmListPapers.setVisible(true);
    }//GEN-LAST:event_MnuNewActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmReviewer frmReviewer = new FrmReviewer();
        frmReviewer.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrmRead frmRead = new FrmRead();
        frmRead.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItmChangePassword;
    private javax.swing.JMenuItem ItmCreate;
    private javax.swing.JMenu MnuBill;
    private javax.swing.JMenu MnuExit;
    private javax.swing.JMenuItem MnuNew;
    private javax.swing.JMenuItem MnuOld;
    private javax.swing.JMenu MnuProduct;
    private javax.swing.JMenu MnuUsers;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
