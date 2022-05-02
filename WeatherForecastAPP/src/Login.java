
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IrshaiD
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Login() {
        initComponents();
    }
    
    public static User currentUser;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1_Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2_Password = new javax.swing.JTextField();
        jButton1_Sign_in = new javax.swing.JButton();
        jLabel4_ForgetPassword = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5_Sign_Up = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("UserName");

        jTextField1_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_NameActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        jButton1_Sign_in.setText("Sign in");
        jButton1_Sign_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_Sign_inMouseClicked(evt);
            }
        });
        jButton1_Sign_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_Sign_inActionPerformed(evt);
            }
        });

        jLabel4_ForgetPassword.setText("Forgot Password ?");
        jLabel4_ForgetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4_ForgetPasswordMouseClicked(evt);
            }
        });

        jLabel3.setText("Don't have an account ?");

        jLabel5_Sign_Up.setText("Sign Up");
        jLabel5_Sign_Up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5_Sign_UpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1_Sign_in)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField2_Password)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel4_ForgetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5_Sign_Up)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4_ForgetPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1_Sign_in)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5_Sign_Up))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_NameActionPerformed

    private void jButton1_Sign_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_Sign_inActionPerformed
        String nam=jTextField1_Name.getText();
        String pass=jTextField2_Password.getText();
        
        Connection con=null;
        try{
             Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
        String sq1 = "select * from user where username='"+nam+"' and password='"+pass+"'";
        Statement st = con.createStatement();
            ResultSet rs=st.executeQuery(sq1);
            if(rs.next()){
                if(rs.getString(7).toLowerCase().equals("admin")) {
                    currentUser = new Admin(rs.getInt(1),rs.getString(2),"",rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8));
                    adminInterface ad=new adminInterface();
                    ad.jLabel2_name.setText(rs.getString(2));
                    ad.setVisible(true);
                }
                else{
                    if(rs.getString(6).toLowerCase().equals("manager")){
                        currentUser = new Manager(rs.getInt(1),rs.getString(2),"",rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8));
                        managerInterface ma=new managerInterface();
                        ma.jLabel2_name.setText(rs.getString(2));
                        ma.setVisible(true);
                    }
                    else{
                        if(rs.getInt(8) != 0){
                            currentUser = new Employee(rs.getInt(1),rs.getString(2),"",rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8));
                            System.out.println("TEST EMP.");
                        }
                        else{
                            currentUser = new User(rs.getInt(1),rs.getString(2),"",rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8));
                        }
                        userInterface us=new userInterface();
                        us.jLabel2_name.setText(rs.getString(2));
                        us.setVisible(true);
                        
                    }
                }
                dispose();
            }
                else{
                JOptionPane.showMessageDialog(null, "Password is incorrect");
                    
                }
               
        }
        
         catch(Exception e){
                 JOptionPane.showMessageDialog(null, e);
                 }
    }//GEN-LAST:event_jButton1_Sign_inActionPerformed

    private void jLabel4_ForgetPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4_ForgetPasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4_ForgetPasswordMouseClicked

    private void jButton1_Sign_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_Sign_inMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_Sign_inMouseClicked

    private void jLabel5_Sign_UpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5_Sign_UpMouseClicked
        Register reg=new Register();
        reg.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel5_Sign_UpMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Sign_in;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4_ForgetPassword;
    private javax.swing.JLabel jLabel5_Sign_Up;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1_Name;
    private javax.swing.JTextField jTextField2_Password;
    // End of variables declaration//GEN-END:variables
}
