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
import model.Item;
import model.RefModel;
import model.Stock;
import view.AddItem;

/**
 *
 * @author chamo
 */
public class ItemAction {
    public static boolean registerItem(Item item)
    {
        boolean result = false;
        String qeury = "INSERT item (id,name,brand_id) VALUES(?,?,?)";
        DBConnection myConnection = new DBConnection();
        try {
            java.sql.PreparedStatement st  = DBConnection.getConnection().prepareStatement(qeury);
            st.setString(1, item.getId());
            st.setString(2, item.getName());
            st.setInt(3, item.getBrandId());
            st.execute();
            result=true;
          
        } catch (Exception ex) {
            Logger.getLogger(BrandAction.class.getName()).log(Level.SEVERE, null, ex);
            result = false;
        }
        
        return result;
    }
    public static String getItemName(String id1)
    {
        String sql="SELECT * FROM item where id=?";
        String id=null;
        DBConnection db=new DBConnection(); 
        Connection con=db.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, id1);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
                id=rs.getString("name");
        } catch (SQLException ex) {
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    public static boolean stockItem(Stock stock)
    {
        boolean result = false;
        String qeury = "INSERT stock (quantity,recieve_price,sale_price,date,ref_id,item_id) VALUES(?,?,?,now(),?,?)";
        DBConnection myConnection = new DBConnection();
        try {
            java.sql.PreparedStatement st  = DBConnection.getConnection().prepareStatement(qeury);
            st.setDouble(1, stock.getQuantity());
            st.setDouble(2, stock.getRecievePrice());
            st.setDouble(3, stock.getSalePrice());
            st.setInt(4, stock.getRefId());
            st.setString(5, stock.getItemId());
            st.execute();
            result=true;
          
        } catch (Exception ex) {
            Logger.getLogger(BrandAction.class.getName()).log(Level.SEVERE, null, ex);
            result = false;
        }
        
        return result;
    }
}
