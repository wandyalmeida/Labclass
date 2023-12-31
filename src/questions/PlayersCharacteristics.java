package questions;

import java.util.Scanner;
import teams.Players;

/**
 *
 * @author Charles Rocha
 */
public class PlayersCharacteristics {

    Scanner userInput = new Scanner(System.in);
    Players teamPlayer = new Players();
    String name;
    int number;
    String birth;
    String position;
    int goalsScored;
    String background;

    public void userInput() {
        System.out.println("Please enter the player's name:");
        name = userInput.next();
        System.out.println("Please enter the player's number:");
        number = userInput.nextInt();
        System.out.println("Please enter the player's date of birth: ");
        birth = userInput.next();
        System.out.println("Please enter the player's position: ");
        position = userInput.next();
        System.out.println("Please enter the number of goals the player has scored: ");
        goalsScored = userInput.nextInt();
        System.out.println("Please enter the player's background:");
        background = userInput.next();

        teamPlayer.setName(name);
        teamPlayer.setNumber(number);
        teamPlayer.setBirth(birth);
        teamPlayer.setPosition(position);
        teamPlayer.setGoalsScored(goalsScored);
        teamPlayer.setBackground(background);
    }
}
