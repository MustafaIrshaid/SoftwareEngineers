/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ameed
 */
public class UserProfile extends javax.swing.JFrame {

    /**
     * Creates new form UserProfile
     * @param pageUser
     */
    
    public UserProfile(User pageUser) {
        initComponents();
        this.profileUser = pageUser;
        this.userName.setText(pageUser.getUsername());
        this.location.setText(pageUser.getLocation());
        if(pageUser.getimg() == null){
            userImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anonymous-user-icon-2.jpg")));
        }
        else {userImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(pageUser.getimg())));}
        this.setDefaultCloseOperation(UserProfile.HIDE_ON_CLOSE);
        if(Login.currentUser.getUserID() == pageUser.getUserID()){
            this.jLabel_editIcon.setVisible(true);
            this.jButton1_sendNotification.setVisible(false);
            this.jButton_sendRequest.setVisible(false);
        } else {
            this.jLabel_editIcon.setVisible(false);
            this.jButton1_sendNotification.setVisible(true);
            if(Login.currentUser.getSubscription().toLowerCase().equals("manager"))
                this.jButton_sendRequest.setVisible(true);
            else
                this.jButton_sendRequest.setVisible(false);
        }
    }
    
    public UserProfile() {
        initComponents();
        this.setDefaultCloseOperation(UserProfile.HIDE_ON_CLOSE);
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
        userImg = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        jButton1_sendNotification = new javax.swing.JButton();
        jButton_sendRequest = new javax.swing.JButton();
        jLabel_editIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userImg.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(0, 153, 153)));

        userName.setForeground(new java.awt.Color(255, 0, 0));
        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setText("Name");
        userName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        location.setForeground(new java.awt.Color(255, 0, 0));
        location.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        location.setText("Location");
        location.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1_sendNotification.setText("Send Notification");
        jButton1_sendNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_sendNotificationActionPerformed(evt);
            }
        });

        jButton_sendRequest.setText("Send Request");
        jButton_sendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sendRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 183, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1_sendNotification, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jButton_sendRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(userImg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userImg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1_sendNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_sendRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel_editIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editIcon.png"))); // NOI18N
        jLabel_editIcon.setText("jLabel1");
        jLabel_editIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_editIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_editIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_editIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_sendNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_sendNotificationActionPerformed
        new NotificationFromUserToUser(profileUser).setVisible(true);
    }//GEN-LAST:event_jButton1_sendNotificationActionPerformed

    private void jButton_sendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sendRequestActionPerformed
        Login.currentUser.sendRequest(profileUser);
        dispose();
    }//GEN-LAST:event_jButton_sendRequestActionPerformed

    private void jLabel_editIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_editIconMouseClicked
        ProfileSettings ps=new ProfileSettings();
        ps.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel_editIconMouseClicked

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
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProfile().setVisible(true);
            }
        });
    }

    // Custom declaration
    private User profileUser;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_sendNotification;
    private javax.swing.JButton jButton_sendRequest;
    private javax.swing.JLabel jLabel_editIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel location;
    private javax.swing.JLabel userImg;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
