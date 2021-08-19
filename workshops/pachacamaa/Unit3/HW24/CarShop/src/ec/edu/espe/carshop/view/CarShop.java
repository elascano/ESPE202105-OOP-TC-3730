/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.carshop.view;

/**
 *
 * @author Alexander Pachacama BUILDER ESPE-DCC0
 */
public class CarShop extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form CarShop
     */
    public CarShop() {
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

        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnuMainEntrance = new javax.swing.JMenu();
        MnuUser = new javax.swing.JMenu();
        ItmCreateUser = new javax.swing.JMenuItem();
        ItmPassword = new javax.swing.JCheckBoxMenuItem();
        MnuProducts = new javax.swing.JMenu();
        MnuModel = new javax.swing.JMenu();
        MnuDescription = new javax.swing.JMenu();
        MnuExit = new javax.swing.JMenu();

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MnuMainEntrance.setText("MainEntrance");
        jMenuBar1.add(MnuMainEntrance);

        MnuUser.setText("User");

        ItmCreateUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        ItmCreateUser.setText("Create");
        ItmCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmCreateUserActionPerformed(evt);
            }
        });
        MnuUser.add(ItmCreateUser);

        ItmPassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        ItmPassword.setSelected(true);
        ItmPassword.setText("Password");
        ItmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmPasswordActionPerformed(evt);
            }
        });
        MnuUser.add(ItmPassword);

        jMenuBar1.add(MnuUser);

        MnuProducts.setText("Products");
        jMenuBar1.add(MnuProducts);

        MnuModel.setText("Model");
        jMenuBar1.add(MnuModel);

        MnuDescription.setText("Description");
        jMenuBar1.add(MnuDescription);

        MnuExit.setText("Exit");
        MnuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MnuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(MnuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_MnuExitMouseClicked

    private void ItmCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmCreateUserActionPerformed
        // TODO add your handling code here:
        FrmCreateUser frmCreateuser = new FrmCreateUser();
        frmCreateuser.setVisible(true);
    }//GEN-LAST:event_ItmCreateUserActionPerformed

    private void ItmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItmPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(CarShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CarShop().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItmCreateUser;
    private javax.swing.JCheckBoxMenuItem ItmPassword;
    private javax.swing.JMenu MnuDescription;
    private javax.swing.JMenu MnuExit;
    private javax.swing.JMenu MnuMainEntrance;
    private javax.swing.JMenu MnuModel;
    private javax.swing.JMenu MnuProducts;
    private javax.swing.JMenu MnuUser;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
