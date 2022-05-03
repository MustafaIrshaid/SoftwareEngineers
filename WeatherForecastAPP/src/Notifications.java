
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
    private int NID, recieverID, senderID;
    private String message, senderName;

    
    public Notifications(int n_id, int reciever_id, int sender_id, String message, String senderName){
        this.NID = n_id;
        this.recieverID = reciever_id;
        this.senderID = sender_id;
        this.message = message;
        this.senderName = senderName;
    }
    
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
    
    public static ArrayList<Notifications> getNotifications(User reciever){
        ArrayList<Notifications> temp = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
            Statement st = con.createStatement();
            String sqlstr="select * from notifications,user where reciever_id = '"+reciever.getUserID()+"'  and notifications.sender_id = user.user_id";
            ResultSet rs = st.executeQuery(sqlstr);
            while(rs.next()){
                temp.add(new Notifications(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4), rs.getString("username")));
            }
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
//        Collections.sort(temp, Collections.reverseOrder()); 
        return temp;
    }
    public int getNID() {
        return NID;
    }

    public void setNID(int NID) {
        this.NID = NID;
    }

    public int getRecieverID() {
        return recieverID;
    }

    public void setRecieverID(int recieverID) {
        this.recieverID = recieverID;
    }

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
