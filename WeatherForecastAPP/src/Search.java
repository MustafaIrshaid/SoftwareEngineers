
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
public class Search {
    public static ArrayList<User> searchUser(String name){
        Connection con=null;
        ArrayList<User> matchedUsers = new ArrayList<>();
        try{
             Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
        String sq1 = "select * from user where username LIKE '%"+name+"%'";
        Statement st = con.createStatement();
        ResultSet rs=st.executeQuery(sq1);
        while(rs.next()){
            matchedUsers.add(new User(rs.getInt(1),rs.getString(2),"",rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9)));
        }  
        con.close();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return matchedUsers;
    }
    
    public static User searchForUser(int id, String name){
        User matchedUser = new User();
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softproj","root","");
            String sq1 = "select * from user where username = '"+name+"'"
                                              + "or user_id = '"+ id +"'";
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery(sq1);
            if(rs.next()){
                matchedUser = new User(rs.getInt(1),rs.getString(2),"",rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9));
            }  
            con.close();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return matchedUser;
    }
    
}
