
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
public class User {
    private int userID;
    private String username;
    private String password;
    private String location;
    private String email;
    private String subscription;
    private String role;
    private int managerID;

    public User(){
        
    }
    public User(int userID, String username, String password, String location, String email, String Subscription, String role, int managerID){
        this.userID = userID;
        this.email = email;
        this.location = location;
        this.managerID = managerID;
        this.password = password;
        this.role = role;
        this.subscription = Subscription;
        this.username = username;
    }
    
    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubscription() {
        return subscription;
    }

    public String getRole() {
        return role;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }
    
    public void sendNotification(User reciever, String message){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
            Statement st = con.createStatement();
            String sqlstr="insert into notifications (`sender_id`, `reciever_id`, `message`) values('"+Login.currentUser.getUserID()+"','"+reciever.getUserID()+"','"+message+"')";
            st.executeUpdate(sqlstr);
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void showProfile(){
        new UserProfile(this).setVisible(true);
    }
    
    public void showNotifications(){
        
    }
    
    public void showRequests(){
        
    }
    
    public void removeManager(){ 
    }
    
    public void requestModifyingLocation(){
    }
    
    public void addEmployee(User emp){
    }
    
    public void notifyUsers(String msg){
    }
    
    public void sendRequest(User reciever){
    }
//    public void suggestChanges(){
//    }
}
