/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aadp_lab_soccersimulator;

import FirstMenu.initialScreen;
import database.CreateDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Sam
 * Please put the names and student numbers of the team here:
 * 
 * Name 1: Carolina Landim
 * Number 1: 2021226
 * 
 * Name 2: Charles Rocha
 * Number 2: 2021376
 * 
 * Name 3: Lucas Barbosa
 * Number 3: 2021337
 * 
 * Name 4: Wandwilson Almeida
 * Number 4: 2021230
 * 
 * Name 5: Matthew Logan
 * Number 5: 2021390
 */

public class AADP_Lab_SoccerSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        CreateDB create_schema = new CreateDB();
        create_schema.create_schema();
        initialScreen start = new initialScreen();
        start.startMenu();
    }
        
        
//        int option;
//        boolean exit = false;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Welcome! What would you like to do today? Please enter the number corresponding to your choice.");
//            System.out.println("1. Enter a new player to a team.");
//            System.out.println("2. See the players on a team.");
//            System.out.println("3. Simulate a number of matches.");
//            System.out.println("4. Exit the programme.");            
//            try {
//                option = Integer.parseInt(sc.nextLine());
//                if (option == 1) {
//                    boolean validTeam = false;
//                    String teamName;
//                    System.out.println("Please follow the instructions to enter player data.");
//                    do {
//                        System.out.println("For which team would you like to enter data?");
//                        teamName = sc.nextLine();
//                        for (String team : teams) {
//                            if (teamName.toLowerCase().equals(team.toLowerCase())) {
//                                validTeam = true;
//                                break;
//                            }
//                        }
//                        if (teamName.toLowerCase().equals("exit")) break;
//                        if (!validTeam) System.out.println("That is not one of the teams. Please try again!");
//                    } while (!validTeam);
//                    String name;
//                    int number = 0;
//                    String birth;
//                    String position;
//                    int goalsScored = 0;
//                    String background;
//                    boolean validPlayer = false;
//                    System.out.println("Please enter the player's name: ");
//                    name = sc.nextLine();
//                    System.out.println("Please enter the player's number: ");
//                    do {
//                        try {
//                            number = Integer.parseInt(sc.nextLine()); 
//                            if (number < 1) {
//                                System.out.println("Please enter a positive integer");
//                            } else validPlayer = true;
//
//                        } catch (Exception e) {
//                            System.out.println("That is not a number. please try again!");
//                        }
//                    } while (!validPlayer);                                              
//                    System.out.println("Please enter the player's date of birth: ");
//                    birth = sc.nextLine();         
//                    System.out.println("Please enter the player's position: ");
//                    position = sc.nextLine(); 
//                    System.out.println("Please enter the number of goals the player has scored: ");
//                    validPlayer = false;
//                    do {
//                        try {
//                            goalsScored = Integer.parseInt(sc.nextLine()); 
//                            if (goalsScored < 1) {
//                                System.out.println("Please enter a positive integer");
//                            } else validPlayer = true;
//
//                        } catch (Exception e) {
//                            System.out.println("That is not a number. please try again!");
//                        }
//                    } while (!validPlayer);     
//                    System.out.println("Please enter the player's background: ");
//                    background = sc.nextLine();                          
//                    System.out.println("Thank you for entering a player"); 
//                         
//                } else if (option == 2) {
//                    boolean validTeam = false;
//                    String teamName;
//                    System.out.println("Please follow the instructions to get player data.");
//                    do {
//                        System.out.println("For which team would you like to get player data?");
//                        teamName = sc.nextLine();
//                        for (String team : teams) {
//                            if (teamName.toLowerCase().equals(team.toLowerCase())) {
//                                validTeam = true;
//                                break;
//                            }
//                        }
//                        if (teamName.toLowerCase().equals("exit")) break;
//                        if (!validTeam) System.out.println("That is not one of the teams. Please try again!");
//                    } while (!validTeam);
//                                    
//                } else if (option == 3) {
//                    System.out.println("How many matches would you like to simulate?");
//                    Boolean validNum = false;
//                    int numMatches = 0;
//                    do {
//                        try {
//                            numMatches = Integer.parseInt(sc.nextLine()); 
//                            if (numMatches < 1) {
//                                System.out.println("Please enter a positive integer");
//                            } else validNum = true;
//
//                        } catch (Exception e) {
//                            System.out.println("That is not a number. please try again!");
//                        }
//                    } while (!validNum);
//                    for (int matchNum = 1; matchNum <= numMatches; matchNum++) {
//                        int team1Num = (int) (Math.floor(Math.random() * teams.length));
//                        String team1 = teams[team1Num];
//                        int team2Num;
//                        do {
//                            team2Num = (int) (Math.floor(Math.random() * teams.length));
//                        } while (team1Num == team2Num);
//                        String team2 = teams[team2Num];
//                        int team1Score = (int) (Math.floor(Math.random() * 6));
//                        int team2Score = (int) (Math.floor(Math.random() * 6));
//                        System.out.println("Time for mathch: " + matchNum);
//                        if (team1Score > team2Score) {
//                            System.out.println(String.format("Congratulation %s! %s scored %d goals and %s scored %d goals.", team1, team1, team1Score, team2, team2Score));
//                        } else if (team1Score < team2Score) {
//                            System.out.println(String.format("Congratulation %s! %s scored %d goals and %s scored %d goals.", team2, team1, team1Score, team2, team2Score));
//                        } else {
//                            System.out.println(String.format("It was a draw!! %s scored %d goals and %s scored %d goals.",  team1, team1Score, team2, team2Score));
//                        }
//                    }
//                } else if (option == 4) {
//                    System.out.println("Goodbye, and thank you for using the SoccerSimulator!");
//                    exit = true;
//                } else {
//                    System.out.println("That is an invalid number. Please try again!");
//                }
//            } catch (Exception e) {
//                System.out.println("That is not a number. Please try again!");
//            }         
//        } while (!exit);   
//    }     
}
