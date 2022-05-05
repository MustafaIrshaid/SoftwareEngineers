/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IrshaiD
 */
public class userInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainDesign
     */
    public userInterface() {
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

        jButton2 = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1_Welcome = new javax.swing.JLabel();
        jLabel2_Notify = new javax.swing.JLabel();
        jLabel3_Requests = new javax.swing.JLabel();
        jButton1_WeatherInfo = new javax.swing.JButton();
        jButton3_SearchForUsers = new javax.swing.JButton();
        jButton4_addFeedBack = new javax.swing.JButton();
        jLabel1_Settings = new javax.swing.JLabel();
        jLabel2_name = new javax.swing.JLabel();
        jLabel1_Logout = new javax.swing.JLabel();
        jLabel2_Notify2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jMenuItem1.setText("jMenuItem1");
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1_Welcome.setText("Welcome ,");

        jLabel2_Notify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notificationBell.png"))); // NOI18N
        jLabel2_Notify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_NotifyMouseClicked(evt);
            }
        });

        jLabel3_Requests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Requests.png"))); // NOI18N
        jLabel3_Requests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3_RequestsMouseClicked(evt);
            }
        });

        jButton1_WeatherInfo.setBackground(new java.awt.Color(255, 255, 255));
        jButton1_WeatherInfo.setText("Get Weather Information");
        jButton1_WeatherInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_WeatherInfoActionPerformed(evt);
            }
        });

        jButton3_SearchForUsers.setBackground(new java.awt.Color(255, 255, 255));
        jButton3_SearchForUsers.setText("Search For Users");
        jButton3_SearchForUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_SearchForUsersActionPerformed(evt);
            }
        });

        jButton4_addFeedBack.setBackground(new java.awt.Color(255, 255, 255));
        jButton4_addFeedBack.setText("Add Feed Back");
        jButton4_addFeedBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_addFeedBackActionPerformed(evt);
            }
        });

        jLabel1_Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/setting.png"))); // NOI18N
        jLabel1_Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_SettingsMouseClicked(evt);
            }
        });

        jLabel2_name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2_name.setForeground(new java.awt.Color(52, 152, 219));
        jLabel2_name.setText("Name");
        jLabel2_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_nameMouseClicked(evt);
            }
        });

        jLabel1_Logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel1_Logout.setText("Logout");
        jLabel1_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_LogoutMouseClicked(evt);
            }
        });

        jLabel2_Notify2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cloud-50.png"))); // NOI18N
        jLabel2_Notify2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_Notify2MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Main Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1_Welcome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2_Notify)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3_Requests)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1_Settings)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1_Logout))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4_addFeedBack, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jButton1_WeatherInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3_SearchForUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 144, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel2_Notify2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2_Notify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3_Requests, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2_name)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2_Notify2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1_WeatherInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4_addFeedBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3_SearchForUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_Logout))
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

    private void jButton4_addFeedBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_addFeedBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4_addFeedBackActionPerformed

    private void jLabel2_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_nameMouseClicked
        Login.currentUser.showProfile();
    }//GEN-LAST:event_jLabel2_nameMouseClicked

    private void jLabel2_NotifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_NotifyMouseClicked
        new NotificationsFrame(Login.currentUser).setVisible(true);
    }//GEN-LAST:event_jLabel2_NotifyMouseClicked

    private void jLabel3_RequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_RequestsMouseClicked
        new RequestsFrame(Login.currentUser, "Have requested you to join his employees.").setVisible(true);
    }//GEN-LAST:event_jLabel3_RequestsMouseClicked

    private void jButton1_WeatherInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_WeatherInfoActionPerformed
        WeatherForecastMSG msg=new WeatherForecastMSG();
        msg.setVisible(true);
    }//GEN-LAST:event_jButton1_WeatherInfoActionPerformed

    private void jButton3_SearchForUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_SearchForUsersActionPerformed
        new SearchFrame().setVisible(true);
    }//GEN-LAST:event_jButton3_SearchForUsersActionPerformed

    private void jLabel1_SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_SettingsMouseClicked
        ProfileSettings ps=new ProfileSettings();
        ps.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1_SettingsMouseClicked

    private void jLabel1_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_LogoutMouseClicked
        Login.currentUser = null;
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1_LogoutMouseClicked

    private void jLabel2_Notify2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_Notify2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2_Notify2MouseClicked

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
            java.util.logging.Logger.getLogger(userInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userInterface().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_WeatherInfo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3_SearchForUsers;
    private javax.swing.JButton jButton4_addFeedBack;
    private javax.swing.JLabel jLabel1_Logout;
    private javax.swing.JLabel jLabel1_Settings;
    private javax.swing.JLabel jLabel1_Welcome;
    private javax.swing.JLabel jLabel2_Notify;
    private javax.swing.JLabel jLabel2_Notify2;
    public javax.swing.JLabel jLabel2_name;
    private javax.swing.JLabel jLabel3_Requests;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
