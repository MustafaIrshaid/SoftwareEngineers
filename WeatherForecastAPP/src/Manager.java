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
    
    
}
