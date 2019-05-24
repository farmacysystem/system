/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAMOD
 */
public class login {
    public boolean checkUserCredentials(String userName,String password){
        DBConnection con=new DBConnection();
        String sql="SELECT password FROM user where userName=?";
        try {
            PreparedStatement p=   con.getConnection().prepareStatement(sql);
             p.setString(1, userName);
           ResultSet r= p.executeQuery();
          String storedpassword="";
          
           if(r.next())
             storedpassword=r.getString("password");
             if(storedpassword.equals(password)){
                 return true;
                 
             }
             else{
                 return false;
                 
             }
           
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
            
        }
        
        
    }

    public boolean checkUserCredentials(String username, char[] password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
