
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ameed
 */
public class Admin extends User {
    public Admin(int userID, String username, String password, String location, String email, String Subscription, String role, int managerID , String img){
        super(userID, username, password, location, email, Subscription, role, managerID , img);
    }
    
    @Override
    public void notifyUsers(String msg){
        Connection con=null;
        try{
           Class.forName("com.mysql.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
//           String getid = "select * from user where role != 'admin'";
//           ResultSet rs=st.executeQuery(getid);
           Statement st = con.createStatement();
           String sqlstr="insert into notifications (`sender_id`, `message`) values('"+Login.currentUser.getUserID()+"','"+msg+"')";
           System.out.println(sqlstr);
           Statement st1 = con.createStatement();
           st1.executeUpdate(sqlstr);
//           int id;
//           while(rs.next()){
//               id=rs.getInt("user_id");
//               String sqlstr="insert into notifications (`sender_id`, `reciever_id`, `message`) values('"+Login.currentUser.getUserID()+"','"+id+"','"+msg+"')";
//               Statement st1 = con.createStatement();
//               st1.executeUpdate(sqlstr);
//           }
           con.close();
       
             JOptionPane.showMessageDialog(null, "done!");
        }
        
         catch(Exception e){
                 JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
