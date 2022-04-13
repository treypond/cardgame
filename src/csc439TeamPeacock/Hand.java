package csc439TeamPeacock;

import java.util.*;

public class Hand {

    PlayingCard card1;
    PlayingCard card2;
    PlayingCard card3;
    PlayingCard card4;
    PlayingCard card5;
    PlayingCard card6;

    public Hand(PlayingCard card1, PlayingCard card2, PlayingCard card3, PlayingCard card4, PlayingCard card5, PlayingCard card6) {
        this.card1 = card1;
        this.card2 = card2;
        this.card3 = card3;
        this.card4 = card4;
        this.card5 = card5;
        this.card6 = card6;

        Random rand = new Random();

        int seed = rand.nextInt(6);

        if (seed == 0){
            card1.faceDownSetter(false);
        }
        if (seed == 1){
            card2.faceDownSetter(false);
        }
        if (seed == 2){
            card3.faceDownSetter(false);
        }
        if (seed == 3){
            card4.faceDownSetter(false);
        }
        if (seed == 4){
            card5.faceDownSetter(false);
        }
        if (seed == 5){
            card6.faceDownSetter(false);
        }

    }

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
