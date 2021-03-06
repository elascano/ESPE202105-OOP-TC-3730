/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.repository.view;

/**
 *
 * @author Jennifer Beltran
 */
public class Repository extends javax.swing.JFrame {

    /**
     * Creates new form DocumentStore
     */
    public Repository() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuExit = new javax.swing.JMenu();
        MenuUsers = new javax.swing.JMenu();
        ItemCreateUser = new javax.swing.JMenuItem();
        ItemChangePassword = new javax.swing.JMenuItem();
        MenuProduct = new javax.swing.JMenu();
        ItemAdd = new javax.swing.JMenuItem();
        ItemRead = new javax.swing.JMenuItem();
        ItemReview = new javax.swing.JMenuItem();
        Menu = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MenuExit.setText("Exit");
        MenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuExit);

        MenuUsers.setText("Users");

        ItemCreateUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        ItemCreateUser.setText("Create");
        ItemCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCreateUserActionPerformed(evt);
            }
        });
        MenuUsers.add(ItemCreateUser);

        ItemChangePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        ItemChangePassword.setText("Change Password");
        ItemChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemChangePasswordActionPerformed(evt);
            }
        });
        MenuUsers.add(ItemChangePassword);

        jMenuBar1.add(MenuUsers);

        MenuProduct.setText("Product");

        ItemAdd.setText("Add");
        ItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAddActionPerformed(evt);
            }
        });
        MenuProduct.add(ItemAdd);

        ItemRead.setText("Read");
        ItemRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemReadActionPerformed(evt);
            }
        });
        MenuProduct.add(ItemRead);

        ItemReview.setText("Review");
        ItemReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemReviewActionPerformed(evt);
            }
        });
        MenuProduct.add(ItemReview);

        jMenuBar1.add(MenuProduct);

        Menu.setText("List");
        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_MenuExitMouseClicked

    private void ItemCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCreateUserActionPerformed
        FrmCreateUser frmCreateuser = new FrmCreateUser();
        frmCreateuser.setVisible(true);   
    }//GEN-LAST:event_ItemCreateUserActionPerformed

    private void ItemChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemChangePasswordActionPerformed
        FrmChangePassword frmChangepassword = new FrmChangePassword();
        frmChangepassword.setVisible(true); 
    }//GEN-LAST:event_ItemChangePasswordActionPerformed

    private void ItemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAddActionPerformed
        FrmProductAdd frmProductadd = new FrmProductAdd();
        frmProductadd.setVisible(true); 
    }//GEN-LAST:event_ItemAddActionPerformed

    private void ItemReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemReviewActionPerformed
        FrmProductReview frmProductreview = new FrmProductReview();
        frmProductreview.setVisible(true);
    }//GEN-LAST:event_ItemReviewActionPerformed

    private void ItemReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemReadActionPerformed
        FrmProductRead frmProductread = new FrmProductRead();
        frmProductread.setVisible(true);
    }//GEN-LAST:event_ItemReadActionPerformed

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
            java.util.logging.Logger.getLogger(Repository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Repository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Repository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Repository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Repository().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemAdd;
    private javax.swing.JMenuItem ItemChangePassword;
    private javax.swing.JMenuItem ItemCreateUser;
    private javax.swing.JMenuItem ItemRead;
    private javax.swing.JMenuItem ItemReview;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenu MenuExit;
    private javax.swing.JMenu MenuProduct;
    private javax.swing.JMenu MenuUsers;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
