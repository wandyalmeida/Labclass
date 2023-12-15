package FirstMenu;

import java.util.Scanner;
import questions.PlayersCharacteristics;


/**
 *
 * @author wandw
 */
public class initialScreen {
    Scanner sc = new java.util.Scanner(System.in);
    int option;
    PlayersCharacteristics questions = new PlayersCharacteristics();
    
    public void startMenu(){
        System.out.println("Welcome! What would you like to do today? Please enter the number corresponding to your choice.");
        System.out.println("1. Enter a new player to a team.");
        System.out.println("2. See the players on a team.");
        System.out.println("3. Simulate a number of matches.");
        System.out.println("4. Exit the programme."); 
        option = sc.nextInt();
        
        switch (option){
            case 1:
                questions.userInput();
                    
            case 2:
             
            case 3:
            
            case 4:
                
            default:
                
            
        }
        
    }
    
}