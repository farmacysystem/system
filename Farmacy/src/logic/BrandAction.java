/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.AddItem;

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
            java.sql.PreparedStatement st  = myConnection.getConnection().prepareStatement(qeury);
            st.setString(1, name);
            st.execute();
            result=true;
          
        } catch (Exception ex) {
            Logger.getLogger(BrandAction.class.getName()).log(Level.SEVERE, null, ex);
            result = false;
        }
        
        return result;
    }
    public static String getBrandId(String name)
    {
        String sql="SELECT * FROM brand where name=?";
        String id=null;
        DBConnection db=new DBConnection(); 
        Connection con=db.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
                id=rs.getString("id");
        } catch (SQLException ex) {
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    public static boolean brandUpdate(int id,String name)
    {
        boolean result = false;
        String qeury = "UPDATE brand SET name=? WHERE id=?";
        DBConnection myConnection = new DBConnection();
        try {
            java.sql.PreparedStatement st  = myConnection.getConnection().prepareStatement(qeury);
            st.setString(1, name);
            st.setInt(2, id);
            st.execute();
            result=true;         
        } catch (Exception ex) {
            Logger.getLogger(BrandAction.class.getName()).log(Level.SEVERE, null, ex);
            result = false;
        }
        
        return result;
    }
    
}
