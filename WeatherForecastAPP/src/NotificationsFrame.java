
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ameed
 */
public class NotificationsFrame extends javax.swing.JFrame {

    /**
     * Creates new form NotificationsFrame
     * @param reciever
     */
    public NotificationsFrame(User reciever) {
        initComponents();
        String header = this.jLabel1_name.getText();
        this.setResizable(true);
        this.jLabel1_back.setVisible(false);
        this.jLabel1_name.setText(header.replace("Name", reciever.getUsername()));
        userNotifications = Notifications.getNotifications(reciever);
        this.setDefaultCloseOperation(NotificationsFrame.HIDE_ON_CLOSE);
        DefaultTableModel model = (DefaultTableModel)this.jTable1.getModel();
        int rowCount = model.getRowCount();
        for(int i= rowCount - 1 ; i >= 0 ; i--){
            model.removeRow(i);
        }
        if(!userNotifications.isEmpty()){
            this.jPanel2_tablePanel.setVisible(true);
            this.jPanel3_specificNotifications.setVisible(false);
            for(int i=0 ; i<userNotifications.size() ; i++){
                String usersConvertor[] = {userNotifications.get(i).getSenderName(), userNotifications.get(i).getMessage()};
                model.addRow(usersConvertor);
            }
        } else {
            
        }
    }
    
    public NotificationsFrame() {
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
        jLabel1_name = new javax.swing.JLabel();
        jPanel2_tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3_specificNotifications = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_specificNotification = new javax.swing.JTextArea();
        jLabel1_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1_name.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel1_name.setText("Name's Notifications");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "From", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2_tablePanelLayout = new javax.swing.GroupLayout(jPanel2_tablePanel);
        jPanel2_tablePanel.setLayout(jPanel2_tablePanelLayout);
        jPanel2_tablePanelLayout.setHorizontalGroup(
            jPanel2_tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
            .addGroup(jPanel2_tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_tablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)))
        );
        jPanel2_tablePanelLayout.setVerticalGroup(
            jPanel2_tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
            .addGroup(jPanel2_tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_tablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTextArea1_specificNotification.setColumns(20);
        jTextArea1_specificNotification.setRows(5);
        jScrollPane1.setViewportView(jTextArea1_specificNotification);

        javax.swing.GroupLayout jPanel3_specificNotificationsLayout = new javax.swing.GroupLayout(jPanel3_specificNotifications);
        jPanel3_specificNotifications.setLayout(jPanel3_specificNotificationsLayout);
        jPanel3_specificNotificationsLayout.setHorizontalGroup(
            jPanel3_specificNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
            .addGroup(jPanel3_specificNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
        );
        jPanel3_specificNotificationsLayout.setVerticalGroup(
            jPanel3_specificNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
            .addGroup(jPanel3_specificNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
        );

        jLabel1_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel1_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel1_back)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2_tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3_specificNotifications, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_name)
                    .addComponent(jLabel1_back))
                .addContainerGap(430, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(jPanel2_tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(52, Short.MAX_VALUE)
                    .addComponent(jPanel3_specificNotifications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String pressedNotification = userNotifications.get(this.jTable1.getSelectedRow()).getMessage();
        this.jTextArea1_specificNotification.setText(pressedNotification);
        this.jPanel2_tablePanel.setVisible(false);
        this.jPanel3_specificNotifications.setVisible(true);
        this.jLabel1_back.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel1_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_backMouseClicked
        this.jPanel2_tablePanel.setVisible(true);
        this.jPanel3_specificNotifications.setVisible(false);
        this.jLabel1_back.setVisible(false);
    }//GEN-LAST:event_jLabel1_backMouseClicked

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
            java.util.logging.Logger.getLogger(NotificationsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotificationsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotificationsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotificationsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotificationsFrame().setVisible(true);
            }
        });
    }

    // Custom Declerations
    
    ArrayList<Notifications> userNotifications = new ArrayList<>();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1_back;
    private javax.swing.JLabel jLabel1_name;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2_tablePanel;
    private javax.swing.JPanel jPanel3_specificNotifications;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1_specificNotification;
    // End of variables declaration//GEN-END:variables
}
