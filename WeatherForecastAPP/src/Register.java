
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
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jTextField1_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2_password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1_SignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2_signin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1_location = new javax.swing.JComboBox<>();
        jComboBox1_email = new javax.swing.JComboBox<>();
        jRadioButton1_User = new javax.swing.JRadioButton();
        jRadioButton2_Manager = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(329, 371));

        jLabel4.setText("User Name");

        jLabel5.setText("Password");

        jButton1_SignUp.setText("Sign up");
        jButton1_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SignUpActionPerformed(evt);
            }
        });

        jLabel1.setText("Already have an account ?");

        jLabel2_signin.setText("Sign in");
        jLabel2_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_signinMouseClicked(evt);
            }
        });

        jLabel2.setText("Email");

        jLabel3.setText("Location");

        jComboBox1_location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nablus", "Jerusalem", "Hebron", "Rammallah", "Jenin", "Tulkarem" }));

        jComboBox1_email.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@hotmail.com", "@outlook.com", "@gmail.com" }));

        buttonGroup1.add(jRadioButton1_User);
        jRadioButton1_User.setSelected(true);
        jRadioButton1_User.setText("User");
        jRadioButton1_User.setAutoscrolls(true);

        buttonGroup1.add(jRadioButton2_Manager);
        jRadioButton2_Manager.setText("Manager");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton1_User)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2_Manager))
                    .addComponent(jComboBox1_location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_name, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jButton1_SignUp)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2_password, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2_signin))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField1_email, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1_location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1_User)
                    .addComponent(jRadioButton2_Manager))
                .addGap(18, 18, 18)
                .addComponent(jButton1_SignUp)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2_signin))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SignUpActionPerformed
        
        String nam=jTextField1_name.getText();
        String pass=jTextField2_password.getText();
        String email1=jTextField1_email.getText();
        String email2=jComboBox1_email.getSelectedItem().toString();
        String email=email1+email2;
        String loc=jComboBox1_location.getSelectedItem().toString();
        jRadioButton1_User.setActionCommand("user");
        jRadioButton2_Manager.setActionCommand("manager");
        String sub=buttonGroup1.getSelection().getActionCommand();
        System.out.println(sub);
        
        Connection con=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
            Statement st = con.createStatement();  
            String sq1 = "select * from user where username='"+nam+"' or email='"+email+"'";
            ResultSet rs=st.executeQuery(sq1);
            if(!rs.next()){
                if(email.length() > 0 && nam.length() > 0 && pass.length() > 0){
                    String sqlstr="insert into user (`username`, `password`, `location` , `email`,`subscription`, `role`) values('"+nam+"','"+pass+"','"+loc+"','"+email+"','"+sub+"','user')";
                    st.executeUpdate(sqlstr);
                    JOptionPane.showMessageDialog(null, "done");
                    new Login().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Please enter all of your informations");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Email or Username has been used already");
            }
            con.close();
        }
        
         catch(Exception e){
                 JOptionPane.showMessageDialog(null, e);
                 }

           
    }//GEN-LAST:event_jButton1_SignUpActionPerformed

    private void jLabel2_signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_signinMouseClicked
        Login main=new Login();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2_signinMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1_SignUp;
    private javax.swing.JComboBox<String> jComboBox1_email;
    private javax.swing.JComboBox<String> jComboBox1_location;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_signin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1_User;
    private javax.swing.JRadioButton jRadioButton2_Manager;
    private javax.swing.JTextField jTextField1_email;
    private javax.swing.JTextField jTextField1_name;
    private javax.swing.JTextField jTextField2_password;
    // End of variables declaration//GEN-END:variables
}
