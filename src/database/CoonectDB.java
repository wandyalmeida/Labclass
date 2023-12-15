/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Carolina Landim 2021226
 */
public class CoonectDB {
    
    
    // Connect the Database
    public Connection connectDB(){
        
        Connection conn = null;
        
        try{

            String dbName = "world_cup";
            String DB_URL = "jdbc:mysql://localhost/" + dbName;
            String USER = "football";
            String PASS = "Java is almost as good as football";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/", USER, PASS);
        }catch(SQLException e){
            System.out.println("Error CreateDB" + e);
        }
        return conn;
}
}
