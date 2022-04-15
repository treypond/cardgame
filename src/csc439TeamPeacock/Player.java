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
    public ArrayList<String> ActionList(){
        ArrayList<String> actionList= new ArrayList<String>();
        //Add code to determine and action to actionList
        return actionList;
    }


}
