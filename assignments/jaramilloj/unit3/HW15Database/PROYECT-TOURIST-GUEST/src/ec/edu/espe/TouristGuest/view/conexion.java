
package ec.edu.espe.TouristGuest.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conexion {
     private static Connection cn;
     private static final String driver = "com.mysql.jdbc.Driver";
     private static final String url = "jdbc:mysql://localhost/Register_Forms";
     private static final String user = "root";
     private static final String password = "";
     public Connection conectar(){
         cn = null;
     try{
         Class.forName(driver);
         cn = DriverManager.getConnection(url,user,password);
     }catch (Exception e){
         System.out.println(e.getMessage());
     }
         return cn;
     }   
     
     Connection connection;   
     PreparedStatement ps;   
        
       
        
}
