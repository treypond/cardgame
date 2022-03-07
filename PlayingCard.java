package csc439TeamPeacock;

/**
 * This is the basic class for a playing card. A playing card has several methods for retrieving the values
 * stored within.
 * @author Team Peacock
 * @version 1.0
 */

public class PlayingCard {

    private String suit;

    private int number;

    private boolean isWildcard;

    /**
     * The constructor for the card class assigns values to the variables above. A card has a number, a suit, and a
     * boolean value for whether or not it is wild.
     * @param suit
     * @param number
     * @param isWildCard
     */
    public PlayingCard(String suit, int number, boolean isWildCard) {
        this.suit = suit;
        this.number = number;
        this.isWildcard = isWildCard;
    }

    /**
     * This is a getter for the suit of a card. It returns the value of the suit string.
     * @return
     */
    public String suitGetter(){
        return suit;
    }

    /**
     * This is a getter method for the number of a card. It returns the value of the number variable.
     * @return
     */
    public int numberGetter(){
        return number;
    }

    /**
     * This method is for retrieving whether a card is a wildcard or not.
     * @return
     */
    public boolean wildcardGetter(){
        return isWildcard;
    }

    /**
     * This method is for retrieving whether a card is red or black. The method returns a value of 1 for a red
     * card and a value of 0 for a black card.
     * @return
     */
    public boolean isRed(){
        if (suit == "Hearts" || suit == "Diamonds"){
            return true;
        }
        else{
            return false;
        }
    }
}
