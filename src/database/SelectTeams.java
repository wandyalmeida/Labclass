/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carolina Landim 2021226
 */
public class SelectTeams {
    
    public void SelectTeams(){
        
        
        try {
                        Connection conn = new ConnectDB().connectDB();
                        Statement stmt = conn.createStatement();
            
                        ResultSet rs = stmt.executeQuery("SELECT * from world_cup;");
                        String name;
                        int number;
                        String birth;
                        String position;
                        int goalsScored;
                        String background;
                        while (rs.next()) {
                            name = rs.getString("name");
                            number = rs.getInt("number");
                            birth = rs.getString("birth");
                            position = rs.getString("position");
                            goalsScored = rs.getInt("goalsScored");
                            background = rs.getString("background");              
                            System.out.println(String.format("Name: %s -- Number: %d -- DoB: %s -- Position: %s -- Number of goals scored: %d", name, number, birth, position, goalsScored));
                            System.out.println("Background:");
                            System.out.println(background);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
    }
    
}
