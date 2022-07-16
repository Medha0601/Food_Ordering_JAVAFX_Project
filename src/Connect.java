import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
   
public class Connect {  
    private static Connection con; 
    
    public static Connection ConnectDb() {  
       
        try {  
            System.out.println("1");
            Class.forName("org.sqlite.JDBC");
            System.out.println("1");
            // db parameters  
            String url = "jdbc:sqlite:C:loginDB.db";  
            // create a connection to the database  
            Connection con = DriverManager.getConnection(url);  
              
            System.out.println("Connection to SQLite has been established.");  
            return con;
              
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {  
            System.out.println(e);  
            return null;
        } 
    }  
    
}