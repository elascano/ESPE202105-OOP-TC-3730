/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Job_Register_System.view;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class JobRegisterSystem extends javax.swing.JFrame {

    /**
     * Creates new form JobRegisterSystem
     */
    public JobRegisterSystem() {
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

        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Mnu_Exit = new javax.swing.JMenu();
        Mnu_User = new javax.swing.JMenu();
        Itm_Create = new javax.swing.JMenuItem();
        Itm_Login = new javax.swing.JMenuItem();
        Mnu_Documents = new javax.swing.JMenu();
        Itm_Experience = new javax.swing.JMenuItem();
        Itm_Available_Work = new javax.swing.JMenu();
        Itm_Available_Works = new javax.swing.JMenuItem();
        Mnu_ArticlesToReview = new javax.swing.JMenu();
        Itm_Review = new javax.swing.JMenuItem();
        Itm_Read_Available = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        Mnu_Exit.setText("Exit");
        Mnu_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mnu_ExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(Mnu_Exit);

        Mnu_User.setText("User");

        Itm_Create.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        Itm_Create.setText("Create");
        Itm_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itm_CreateActionPerformed(evt);
            }
        });
        Mnu_User.add(Itm_Create);

        Itm_Login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        Itm_Login.setText("Login ");
        Itm_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itm_LoginActionPerformed(evt);
            }
        });
        Mnu_User.add(Itm_Login);

        jMenuBar1.add(Mnu_User);

        Mnu_Documents.setText("Documents");

        Itm_Experience.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        Itm_Experience.setText("Experience");
        Itm_Experience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itm_ExperienceActionPerformed(evt);
            }
        });
        Mnu_Documents.add(Itm_Experience);

        jMenuBar1.add(Mnu_Documents);

        Itm_Available_Work.setText("Work List");

        Itm_Available_Works.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        Itm_Available_Works.setText("Available");
        Itm_Available_Works.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itm_Available_WorksActionPerformed(evt);
            }
        });
        Itm_Available_Work.add(Itm_Available_Works);

        jMenuBar1.add(Itm_Available_Work);

        Mnu_ArticlesToReview.setText("Articles ");

        Itm_Review.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        Itm_Review.setText("Review");
        Itm_Review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itm_ReviewActionPerformed(evt);
            }
        });
        Mnu_ArticlesToReview.add(Itm_Review);

        Itm_Read_Available.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        Itm_Read_Available.setText(" Read Available");
        Itm_Read_Available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itm_Read_AvailableActionPerformed(evt);
            }
        });
        Mnu_ArticlesToReview.add(Itm_Read_Available);

        jMenuBar1.add(Mnu_ArticlesToReview);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Mnu_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mnu_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Mnu_ExitMouseClicked

    private void Itm_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Itm_CreateActionPerformed
       FrmCreateUser frmCreateuser = new FrmCreateUser();
       frmCreateuser.setVisible(true);
    }//GEN-LAST:event_Itm_CreateActionPerformed

    private void Itm_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Itm_LoginActionPerformed
         FrmLoginUser frmLoginuser = new FrmLoginUser();
       frmLoginuser.setVisible(true);
    }//GEN-LAST:event_Itm_LoginActionPerformed

    private void Itm_ExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Itm_ExperienceActionPerformed
         FrmExperiencieUser frmExperiencieuser = new FrmExperiencieUser();
     frmExperiencieuser.setVisible(true);
    }//GEN-LAST:event_Itm_ExperienceActionPerformed

    private void Itm_Available_WorksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Itm_Available_WorksActionPerformed
       FrmWorksAvailable frmWorksavailable = new FrmWorksAvailable();
       frmWorksavailable.setVisible(true);
    }//GEN-LAST:event_Itm_Available_WorksActionPerformed

    private void Itm_ReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Itm_ReviewActionPerformed
         FrmReviewArticles frmReviewarticles = new FrmReviewArticles();
       frmReviewarticles .setVisible(true);
    }//GEN-LAST:event_Itm_ReviewActionPerformed

    private void Itm_Read_AvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Itm_Read_AvailableActionPerformed
        FrmReadAvailable frmReadavailable = new FrmReadAvailable();
       frmReadavailable.setVisible(true);
    }//GEN-LAST:event_Itm_Read_AvailableActionPerformed

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
            java.util.logging.Logger.getLogger(JobRegisterSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JobRegisterSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JobRegisterSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JobRegisterSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JobRegisterSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Itm_Available_Work;
    private javax.swing.JMenuItem Itm_Available_Works;
    private javax.swing.JMenuItem Itm_Create;
    private javax.swing.JMenuItem Itm_Experience;
    private javax.swing.JMenuItem Itm_Login;
    private javax.swing.JMenuItem Itm_Read_Available;
    private javax.swing.JMenuItem Itm_Review;
    private javax.swing.JMenu Mnu_ArticlesToReview;
    private javax.swing.JMenu Mnu_Documents;
    private javax.swing.JMenu Mnu_Exit;
    private javax.swing.JMenu Mnu_User;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
