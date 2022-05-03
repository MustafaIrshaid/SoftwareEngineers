
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
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
public class Notifications {
    
    public static void addNotificatio(User sender, User reciever, String message){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
            Statement st = con.createStatement();
            String sqlstr="insert into notifications (`sender_id`, `reciever_id`, `message`) values('"+sender.getUserID()+"','"+reciever.getUserID()+"','"+message+"')";
            st.executeUpdate(sqlstr);
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static ArrayList<Notifications> getNotifications(){
        ArrayList<Notifications> temp = new ArrayList<>();
        
//        Collections.sort(temp, Collections.reverseOrder()); 
    return temp;
    }
}
