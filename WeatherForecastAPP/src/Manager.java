
import java.sql.Connection;
import java.sql.DriverManager;
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
public class Manager extends User{
    public Manager(int userID, String username, String password, String location, String email, String Subscription, String role, int managerID){
        super(userID, username, password, location, email, Subscription, role, managerID);
    }
    
    @Override
    public void addEmployee(User emp){
        
    }
    
    
    @Override
    public void sendRequest(User reciever){
        
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
            Statement st = con.createStatement();
            
            //send the request
            String sqlstr="insert into requsts (`sender_id`, `reciever_id`, `req_status`) values('"+Login.currentUser.getUserID()+"','"+reciever.getUserID()+"','on-hold')";
            st.executeUpdate(sqlstr);
            
            //notify the user about the request
            String message = "User with name " + Login.currentUser.getUsername() + " has requested you to be his Employee.";
            sqlstr="insert into notifications (`sender_id`, `reciever_id`, `message`) values('"+Login.currentUser.getUserID()+"','"+reciever.getUserID()+"','"+message+"')";
            st.executeUpdate(sqlstr);
            con.close();
            JOptionPane.showMessageDialog(null, "Sent Request Successfully.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
