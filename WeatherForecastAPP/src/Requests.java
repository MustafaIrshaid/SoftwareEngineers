
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
public class Requests {
    private int RID, recieverID, senderID;
    private String senderName;

    
    public Requests(int r_id, int reciever_id, int sender_id, String senderName){
        this.RID = r_id;
        this.recieverID = reciever_id;
        this.senderID = sender_id;
        this.senderName = senderName;
    }
    public static void addRequests(User sender, User reciever){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
            Statement st = con.createStatement();
            String sqlstr="insert into requsts (`sender_id`, `reciever_id`, `req_status`) values('"+sender.getUserID()+"','"+reciever.getUserID()+"','on-hold')";
            st.executeUpdate(sqlstr);
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static ArrayList<Requests> getRequests(User reciever){
        ArrayList<Requests> temp = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
            Statement st = con.createStatement();
            
            //Requests table to get the Requests with"on-hold" status for this user, and user table to get the sender's name 
            String sqlstr="select * from requsts,user where reciever_id = '"+reciever.getUserID()+"'"
                                                          + "and req_status = 'on-hold'"
                                                          + "and requsts.sender_id = user.user_id";
            ResultSet rs = st.executeQuery(sqlstr);
            while(rs.next()){
                temp.add(new Requests(rs.getInt(1),rs.getInt(2),rs.getInt(3), rs.getString("username")));
            }
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
//        Collections.sort(temp, Collections.reverseOrder()); 
        return temp;
    }
    
    public static String respondRequestMessage(String respond, int recieverID){
        String recieverName = Search.searchForUser(recieverID, "").getUsername();
        return String.format("%s has %s your request to join his employees.", recieverName, respond);
    }
    
    public static void respondRequest(Requests req, String respond){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
            Statement st = con.createStatement();
            String sqlstr;
            sqlstr="insert into notifications (`sender_id`, `reciever_id`, `message`) values('"+req.getRecieverID()+"','"
                                                                                                   +req.getSenderID()+"','"
                                                                                                   +Requests.respondRequestMessage(respond, req.recieverID)+ "')";
            st.executeUpdate(sqlstr);
            
            //Update Requests table according to the user's response
            sqlstr="UPDATE `requsts` SET `req_status`='"+respond+"' WHERE r_id='"+req.getRID()+"'";
            st.executeUpdate(sqlstr);
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
    
    public int getRID() {
        return RID;
    }

    public void setRID(int RID) {
        this.RID = RID;
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

}
