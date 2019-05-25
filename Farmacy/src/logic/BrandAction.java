/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import db.DBConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chamo
 */
public class BrandAction {
    public static boolean brandAdd(String name)
    {
        boolean result = false;
        String qeury = "INSERT brand (name) VALUES(?)";
        DBConnection myConnection = new DBConnection();
        try {
            java.sql.PreparedStatement st  =  myConnection.getConnection().prepareStatement(qeury);
            st.setString(1, name);
            st.execute();
            result=true;
          
        } catch (Exception ex) {
            Logger.getLogger(BrandAction.class.getName()).log(Level.SEVERE, null, ex);
            result = false;
        }
        
        return result;
    }
    
}
