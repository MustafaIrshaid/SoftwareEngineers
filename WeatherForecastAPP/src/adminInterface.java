/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mohammad
 */
public class adminInterface extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public adminInterface() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1_Welcome = new javax.swing.JLabel();
        jButton1_WeatherInfo = new javax.swing.JButton();
        jButton3_SearchForUsers = new javax.swing.JButton();
        jLabel2_name = new javax.swing.JLabel();
        jButton3_GetFeedBack = new javax.swing.JButton();
        jButton4_NotifyUsers = new javax.swing.JButton();
        jLabel2_Notify1 = new javax.swing.JLabel();
        jLabel3_Requests1 = new javax.swing.JLabel();
        jLabel1_Logout1 = new javax.swing.JLabel();
        jLabel1_Settings1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1_Welcome.setText("Welcome ,");

        jButton1_WeatherInfo.setText("Get Weather Information");
        jButton1_WeatherInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_WeatherInfoActionPerformed(evt);
            }
        });

        jButton3_SearchForUsers.setText("Search For Users");
        jButton3_SearchForUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_SearchForUsersActionPerformed(evt);
            }
        });

        jLabel2_name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2_name.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2_name.setText("Name");
        jLabel2_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_nameMouseClicked(evt);
            }
        });

        jButton3_GetFeedBack.setText("Get Feed Back");
        jButton3_GetFeedBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_GetFeedBackActionPerformed(evt);
            }
        });

        jButton4_NotifyUsers.setText("Notify All Users");
        jButton4_NotifyUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_NotifyUsersActionPerformed(evt);
            }
        });

        jLabel2_Notify1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notificationBell.png"))); // NOI18N
        jLabel2_Notify1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_Notify1MouseClicked(evt);
            }
        });

        jLabel3_Requests1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Requests.png"))); // NOI18N
        jLabel3_Requests1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3_Requests1MouseClicked(evt);
            }
        });

        jLabel1_Logout1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1_Logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel1_Logout1.setText("Logout");
        jLabel1_Logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_Logout1MouseClicked(evt);
            }
        });

        jLabel1_Settings1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/setting.png"))); // NOI18N
        jLabel1_Settings1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_Settings1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3_GetFeedBack, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4_NotifyUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jButton1_WeatherInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3_SearchForUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1_Welcome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2_Notify1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3_Requests1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1_Settings1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1_Logout1)))
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2_name))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2_Notify1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3_Requests1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(jButton1_WeatherInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3_SearchForUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3_GetFeedBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4_NotifyUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_Logout1)
                    .addComponent(jLabel1_Settings1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_WeatherInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_WeatherInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_WeatherInfoActionPerformed

    private void jButton3_SearchForUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_SearchForUsersActionPerformed
        new SearchFrame().setVisible(true);
    }//GEN-LAST:event_jButton3_SearchForUsersActionPerformed

    private void jLabel2_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_nameMouseClicked
        Login.currentUser.showProfile();
    }//GEN-LAST:event_jLabel2_nameMouseClicked

    private void jButton4_NotifyUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_NotifyUsersActionPerformed
       dispose();
        new createNot().setVisible(true);
    }//GEN-LAST:event_jButton4_NotifyUsersActionPerformed

    private void jButton3_GetFeedBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_GetFeedBackActionPerformed
         dispose();
        new getfeedbacks().setVisible(true);
    }//GEN-LAST:event_jButton3_GetFeedBackActionPerformed

    private void jLabel2_Notify1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_Notify1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2_Notify1MouseClicked

    private void jLabel3_Requests1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_Requests1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3_Requests1MouseClicked

    private void jLabel1_Logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_Logout1MouseClicked
        Login.currentUser = null;
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1_Logout1MouseClicked

    private void jLabel1_Settings1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_Settings1MouseClicked
        ProfileSettings ps=new ProfileSettings();
        ps.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1_Settings1MouseClicked

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
            java.util.logging.Logger.getLogger(adminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_WeatherInfo;
    private javax.swing.JButton jButton3_GetFeedBack;
    private javax.swing.JButton jButton3_SearchForUsers;
    private javax.swing.JButton jButton4_NotifyUsers;
    private javax.swing.JLabel jLabel1_Logout1;
    private javax.swing.JLabel jLabel1_Settings1;
    private javax.swing.JLabel jLabel1_Welcome;
    private javax.swing.JLabel jLabel2_Notify1;
    public javax.swing.JLabel jLabel2_name;
    private javax.swing.JLabel jLabel3_Requests1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
