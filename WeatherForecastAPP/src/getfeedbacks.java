

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mohammad
 */
public class getfeedbacks extends javax.swing.JFrame {

    /**
     * Creates new form getfeedbacks
     */
    public getfeedbacks() {
        initComponents();
        getFeedbacks();
        this.setDefaultCloseOperation(getfeedbacks.HIDE_ON_CLOSE);
    }
public static User usertoreply;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        feedBacks = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        backword = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        feedBacks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "user_id", "username", "stars"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        feedBacks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedBacksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(feedBacks);
        if (feedBacks.getColumnModel().getColumnCount() > 0) {
            feedBacks.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton1.setText("reply to uesr");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        backword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-backwards-32.png"))); // NOI18N
        backword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backwordMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-send-letter-48.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(backword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void getFeedbacks(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
           
         String getid = "select * from feedbacks";
           Statement st = con.createStatement();
           ResultSet rs=st.executeQuery(getid);
           int id=0;
           float fbs;
           String name="";
           
           
           while(rs.next()){
             id=rs.getInt("user_id");
             fbs=rs.getFloat("feedback_stars");
             String s=Float.toString(fbs);
             String getname = "select * from user where user_id='"+id+"'";
           Statement st2 = con.createStatement();
           ResultSet rs2=st2.executeQuery(getname);
             while(rs2.next()){
                 name=rs2.getString("username");
                 
             }
              String tbData[]={Integer.toString(id),name,s};
                
                DefaultTableModel tbmode1=(DefaultTableModel)feedBacks.getModel();
                tbmode1.addRow(tbData);
           }
           
           
       
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
         
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = feedBacks.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(null,"please choose some one to reply him");
        }
        else{
                 dispose();
                new reply().setVisible(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void feedBacksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedBacksMouseClicked
        int row = feedBacks.getSelectedRow();
        String []tableData=new String[4];
       String data="";
       tableData[0] = feedBacks.getModel().getValueAt(row, 0).toString();
       tableData[1] = feedBacks.getModel().getValueAt(row, 1).toString();
       tableData[2] = feedBacks.getModel().getValueAt(row, 2).toString();
        
            
       Connection con =null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
         String getid = "select * from feedbacks where user_id ='"+tableData[0]+"'";
           Statement st = con.createStatement();
           ResultSet rs=st.executeQuery(getid);
           while(rs.next()){
               data=rs.getString("decreption");
               jTextArea1.setText(data);
           }
           String usersql="select * from user where user_id='"+Integer.parseInt(tableData[0])+"'";
            Statement st2 = con.createStatement();
           ResultSet rs2=st2.executeQuery(usersql);
            while(rs2.next()){
                usertoreply = new User(rs2.getInt(1),rs2.getString(2),"",rs2.getString(4),rs2.getString(5),rs2.getString(6),rs2.getString(7),rs2.getInt(8),rs2.getString(9));
                     
            }
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
    }//GEN-LAST:event_feedBacksMouseClicked

    private void backwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backwordMouseClicked
        dispose();
        new adminInterface().setVisible(true);
    }//GEN-LAST:event_backwordMouseClicked

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
            java.util.logging.Logger.getLogger(getfeedbacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(getfeedbacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(getfeedbacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(getfeedbacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new getfeedbacks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backword;
    private javax.swing.JTable feedBacks;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
