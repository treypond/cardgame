package csc439TeamPeacock;

import java.util.*;

public class Hand {

    PlayingCard card1;
    PlayingCard card2;
    PlayingCard card3;
    PlayingCard card4;
    PlayingCard card5;
    PlayingCard card6;

    /**
     * The constructor for the Hand object takes six playing cards in the parameters and assigns them
     * to the internal member variables above. As well, two cards are set to be face up when the hand
     * is created, for game playing purposes.
     * @param card1
     * @param card2
     * @param card3
     * @param card4
     * @param card5
     * @param card6
     */
    public Hand(PlayingCard card1, PlayingCard card2, PlayingCard card3, PlayingCard card4, PlayingCard card5, PlayingCard card6) {
        this.card1 = card1;
        this.card2 = card2;
        this.card3 = card3;
        this.card4 = card4;
        this.card5 = card5;
        this.card6 = card6;

        Random rand = new Random();

        int sentinel = 2;

        while(sentinel > 0) {
            int seed = rand.nextInt(6);

            if (seed == 0 && card1.faceDownGetter()) {
                card1.faceDownSetter(false);
                sentinel--;
            }
            if (seed == 1 && card2.faceDownGetter()) {
                card2.faceDownSetter(false);
                sentinel--;
            }
            if (seed == 2 && card3.faceDownGetter()) {
                card3.faceDownSetter(false);
                sentinel--;
            }
            if (seed == 3 && card4.faceDownGetter()) {
                card4.faceDownSetter(false);
                sentinel--;
            }
            if (seed == 4 && card5.faceDownGetter()) {
                card5.faceDownSetter(false);
                sentinel--;
            }
            if (seed == 5 && card6.faceDownGetter()) {
                card6.faceDownSetter(false);
                sentinel--;
            }
        }
    }

    /**
     * This method returns an array of the cards contained within the Hand object. This is meant
     * to be passed to a View object for display purposes.
     * @return
     */
    public PlayingCard[] getHand(){
        PlayingCard[] listToReturn = new PlayingCard[6];
        listToReturn[0] = card1;
        listToReturn[1] = card2;
        listToReturn[2] = card3;
        listToReturn[3] = card4;
        listToReturn[4] = card5;
        listToReturn[5] = card6;
        return listToReturn;
    }

}
