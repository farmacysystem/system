/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import db.DBConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.RefModel;

/**
 *
 * @author chamo
 */
public class Ref {
    public static boolean addRef(RefModel ref)
    {
        boolean result = false;
        String qeury = "INSERT ref (name,telephone) VALUES(?,?)";
        DBConnection myConnection = new DBConnection();
        try {
            java.sql.PreparedStatement st  = DBConnection.getConnection().prepareStatement(qeury);
            st.setString(1, ref.getName());
            st.setString(2, ref.getPhone());
            st.execute();
            result=true;
          
        } catch (Exception ex) {
            Logger.getLogger(BrandAction.class.getName()).log(Level.SEVERE, null, ex);
            result = false;
        }
        
        return result;
    }
    
}
