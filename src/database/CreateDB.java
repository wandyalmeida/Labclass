/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Carolina Landim 2021226
 */
public class CreateDB {
    
    // Create Database Schema
    public boolean create_schema(){
       String[] teams = {"Ireland", "Brazil", "Argentina", "Japan", "Mexico", "Senegal", "Tunisia", "Qatar"};
       Connection conn = new ConnectDB().connectDB();
        try {

                Statement stmt = conn.createStatement();
                stmt.execute("CREATE SCHEMA IF NOT EXISTS world_cup;");
                stmt.execute("USE world_cup;");
                for (String team : teams) {
                    stmt.execute(
                            "CREATE TABLE IF NOT EXISTS "+ team + " ("
                                    + "name VARCHAR(30) NOT NULL,"
                                    + "number INT NOT NULL PRIMARY KEY,"
                                    + "birth VARCHAR(30),"
                                    + "position VARCHAR(30),"
                                    + "goalsScored INT,"
                                    + "background TEXT(1000));"
                    );                
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return false;
    }
}