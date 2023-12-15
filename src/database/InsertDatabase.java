/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import teams.Players;

/**
 *
 * @author Carolina Landim 2021226
 */
public class InsertDatabase {
    
    public void InsertDatabase(Players objplayer){
        
        Connection conn = null;
        String teamName = null;
        
        String sql = "INSERT INTO " + teamName + " (name, number, birth, position, goalsScored, background) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // Set parameters for the prepared statement
            pstmt.setString(1, objplayer.getName());
            pstmt.setInt(2, objplayer.getNumber());
            pstmt.setString(3, objplayer.getBirth());
            pstmt.setString(4, objplayer.getPosition());
            pstmt.setInt(5, objplayer.getGoalsScored());
            pstmt.setString(6,objplayer.getBackground());

            // Execute the update
            pstmt.executeUpdate();
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
