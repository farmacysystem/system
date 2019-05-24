
package db;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {

   

    
    public static Connection getConnection(){
        String url="jdbc:mysql://localhost:3306/farmacydb";
        String userName = "root";
        String pwd = "";
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, pwd);
            
        } catch (Exception ex) {
           
        }
        return con;
    }
    
}
