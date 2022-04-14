package csc439TeamPeacock;

import java.util.*;

/**
 * This is the deck object to hold 52 PlayingCard objects. When called, the constructor generates a full
 * deck of PlayingCards and adds them to a private ArrayList. The class also contains a method to get
 * the size of the deck for when cards are inevitably removed during play and the size of the deck needs to
 * be retrieved.
 * @author Team Peacock
 * @version 1.0
 */

public class Deck {

    private ArrayList<PlayingCard> playingDeck;

    /**
     * The constructor for the class generates 13 playing cards for every suit and adds them
     * to the deck one by one.
     */
    public Deck() {
        playingDeck = new ArrayList<>();

        for(int i = 0; i < 13; i++){
            PlayingCard card = new PlayingCard("Hearts", i+1, false, true);
            playingDeck.add(card);
        }

        for(int i = 0; i < 13; i++){
            PlayingCard card = new PlayingCard("Diamonds", i+1, false, true);
            playingDeck.add(card);
        }

        for(int i = 0; i < 13; i++){
            PlayingCard card = new PlayingCard("Spades", i+1, false, true);
            playingDeck.add(card);
        }

        for(int i = 0; i < 13; i++){
            PlayingCard card = new PlayingCard("Clubs", i+1, false, true);
            playingDeck.add(card);
        }
    }

    /**
     * This is a quick method to return the size of the deck.
     * @return
     */
    public int getSize(){
        return playingDeck.size();
    }


    public PlayingCard getRandomCard(){
        Random ran = new Random();
        int cardNumber = ran.nextInt(playingDeck.size());
        return playingDeck.remove(cardNumber);
    }

}
