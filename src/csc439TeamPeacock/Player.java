package csc439TeamPeacock;
import java.util.*;
/**
 * This is the Player class.
 * @author Team Peacock
 * @version 1.0
 */

public class Player {

    Hand hand;
    String name;


    /**
     * This creates the player
     * @param hand
     * @param name
     */
    public Player(Hand hand, String name){

        this.hand=hand;
        this.name=name;
    }

    /**
     *  This is a method that returns an arraylist of all the possible actions available to the player.
     * @return
     */
    public ArrayList<String> ActionList(boolean cardHasBeenDrawn){
        ArrayList<String> actionList= new ArrayList<String>();

        //List of actions the player can take on their turn if they have already picked up a card from the deck.
        if(cardHasBeenDrawn) {
            actionList.add("Discard card");
            actionList.add("Replace a card in your hand");
            return actionList;
        }

        //List of actions that a player can take on their turn, assuming they haven't already picked up a card.
        actionList.add("Draw from shoe");
        actionList.add("Draw from discard pile");

        return actionList;
      


      

    }

    
   

}
