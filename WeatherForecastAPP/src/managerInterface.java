/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IrshaiD
 */
public class managerInterface extends javax.swing.JFrame {

    /**
     * Creates new form managerInterface
     */
    public managerInterface() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1_Welcome = new javax.swing.JLabel();
        jButton1_WeatherInfo = new javax.swing.JButton();
        jButton3_SearchForUsers = new javax.swing.JButton();
        jLabel2_name = new javax.swing.JLabel();
        jButton3_GiveFeedBack = new javax.swing.JButton();
        jButton4_notifyEmployees = new javax.swing.JButton();
        jLabel1_Logout1 = new javax.swing.JLabel();
        jLabel2_Notify1 = new javax.swing.JLabel();
        jLabel3_Requests1 = new javax.swing.JLabel();
        jLabel1_Settings = new javax.swing.JLabel();

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

        jLabel2_name.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2_name.setText("Name");
        jLabel2_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_nameMouseClicked(evt);
            }
        });

        jButton3_GiveFeedBack.setText("Give Feed Back");

        jButton4_notifyEmployees.setText("Notify My Employees");

        jLabel1_Logout1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1_Logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel1_Logout1.setText("Logout");
        jLabel1_Logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_Logout1MouseClicked(evt);
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

        jLabel1_Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/setting.png"))); // NOI18N
        jLabel1_Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_SettingsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3_GiveFeedBack, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4_notifyEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(jButton1_WeatherInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton3_SearchForUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1_Welcome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2_name))
                            .addComponent(jLabel1_Settings))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2_Notify1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3_Requests1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1_Logout1))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2_Notify1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3_Requests1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(396, 396, 396)
                        .addComponent(jLabel1_Logout1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2_name))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jButton1_WeatherInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3_SearchForUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3_GiveFeedBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4_notifyEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2_nameMouseClicked

    private void jLabel1_Logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_Logout1MouseClicked
        Login.currentUser = null;
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1_Logout1MouseClicked

    private void jLabel2_Notify1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_Notify1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2_Notify1MouseClicked

    private void jLabel3_Requests1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_Requests1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3_Requests1MouseClicked

    private void jLabel1_SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_SettingsMouseClicked
        ProfileSettings ps=new ProfileSettings();
        ps.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1_SettingsMouseClicked

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
            java.util.logging.Logger.getLogger(managerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_WeatherInfo;
    private javax.swing.JButton jButton3_GiveFeedBack;
    private javax.swing.JButton jButton3_SearchForUsers;
    private javax.swing.JButton jButton4_notifyEmployees;
    private javax.swing.JLabel jLabel1_Logout1;
    private javax.swing.JLabel jLabel1_Settings;
    private javax.swing.JLabel jLabel1_Welcome;
    private javax.swing.JLabel jLabel2_Notify1;
    public javax.swing.JLabel jLabel2_name;
    private javax.swing.JLabel jLabel3_Requests1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
