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

    private boolean isFaceDown;

    /**
     * The constructor for the card class assigns values to the variables above. A card has a number, a suit, and a
     * boolean value for whether or not it is wild.
     * @param suit
     * @param number
     * @param isWildCard
     */
    public PlayingCard(String suit, int number, boolean isWildCard, boolean isFaceDown) {
        this.suit = suit;
        this.number = number;
        this.isWildcard = isWildCard;
        this.isFaceDown = isFaceDown;
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

    /**
     * This method simply returns whether or not a card is face down. A value of
     * true indicates that a card is face down.
     * @return
     */
    public boolean faceDownGetter(){
        return isFaceDown;
    }

    /**
     * This method is used to set a card to be face down or not. If wantToBeFacedown is set to true
     * then the user wants the playing card to be face down, if set to false then the user
     * wants the playing card to be face up.
     * @param wantToBeFacedown
     */
    public void faceDownSetter(boolean wantToBeFacedown){

        //If you want the card to be face down and it isn't face down already, then set it to face down.
        if(wantToBeFacedown && !isFaceDown){
            isFaceDown = true;
        }

        //If you don't want the card to be face down and it is, then set it to face up again.
        if(!wantToBeFacedown && isFaceDown){
            isFaceDown = false;
        }
    }

    /**
     * This method converts the number of a card to its corresponding value in an actual card deck.
     * Face cards are assumed to be 11-13, with 1 indicating an ace.
     * @return
     */
    public String numberToCardConverter(){
        if(number == 1){
            return "Ace";
        }
        if(number < 11){
            return Integer.toString(number);
        }
        if(number == 11){
            return "Jack";
        }
        if(number == 12){
            return "Queen";
        }

        return "King";
    }

    /**
     * This method is used to convert the values of a card into a string for output purposes. If
     * a card is face down then state it as such, don't return the value of the card (since it can't be seen).
     * @return
     */
    public String cardToString(){
        if(isFaceDown){
            return "Face down card";
        }

        return numberToCardConverter() + " of " + suitGetter();
    }
}
