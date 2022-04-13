package csc439TeamPeacock;

import java.util.*;

public class CLIView extends View {

    Scanner input = new Scanner(System.in);

    /**
     * This is the default constructor for the CLIView class.
     */
    public CLIView() {}

    /**
     * This method is called at the beginning of a game to select the number of players and
     * welcome the user to the game. The integer returned is the number of players
     * participating in the game.
     * @return
     */
    @Override
    int displayTitleScreen(){

        System.out.println("Welcome to Golf");
        System.out.println("How many players will be playing the game?");
        System.out.println("Enter number of players:");

        return input.nextInt();

    }

    /**
     * This method is used to print out the cards contained within a hand.
     * @param handToDisplay
     */
    @Override
    void displayHand(PlayingCard[] handToDisplay){
        System.out.println(handToDisplay[0].cardToString());
        System.out.println(handToDisplay[1].cardToString());
        System.out.println(handToDisplay[2].cardToString());
        System.out.println(handToDisplay[3].cardToString());
        System.out.println(handToDisplay[4].cardToString());
        System.out.println(handToDisplay[5].cardToString());
    }

    /**
     * This is a filler method for obtaining input from a user. It currently has no purpose.
     */
    @Override
    void getInput(){

    }

    /**
     * This is a filler method for outputting messages to the user. It currently has no purpose.
     * @param message
     */
    @Override
    void outputMessage(String message){
        System.out.println(message);
    }

}
