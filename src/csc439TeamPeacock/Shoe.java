package csc439TeamPeacock;

import java.util.*;

/**
 * This is the Shoe object to hold multiple decks. The number of decks to store is
 * given in the constructor for the object. There are also two methods, one to get the number of
 * decks within the shoe, and one to remove a deck (for when one becomes empty during play).
 * @author Team Peacock
 * @version 1.0
 */

public class Shoe {

    ArrayList<Deck> playingShoe;

    /**
     * This constructor creates a certain number of deck objects (specified by the numberOfDecks
     * parameter) and then adds them to the playingShoe variable.
     * @param numberOfDecks
     */
    public Shoe(int numberOfDecks) {

        playingShoe = new ArrayList<>();

        for(int i = 0; i < numberOfDecks; i++){
            Deck deckToInsert = new Deck();
            playingShoe.add(deckToInsert);
        }

    }

    /**
     * This method returns the number of decks currently contained in the shoe.
     * @return
     */
    public int numberOfDecks(){
        return playingShoe.size();
    }

    /**
     * This method removes a deck from the shoe. It is assumed that only empty decks will be removed.
     * The index of the deck to be removed is required as a parameter for the method, and the size
     * of the updated shoe is returned to confirm that a deck has been removed.
     * @param index
     * @return
     */
    public int removeDeck(int index){
        playingShoe.remove(index);
        return playingShoe.size();
    }

    public PlayingCard getRandomCard(){
        Random ran = new Random();
        int seed = ran.nextInt(playingShoe.size());

        //If the deck selected was empty, remove it and pick a different one
        if(playingShoe.get(seed).getSize() == 0){
            playingShoe.remove(seed);
            seed = ran.nextInt(playingShoe.size());
            return playingShoe.get(seed).getRandomCard();
        }

        return playingShoe.get(seed).getRandomCard();
    }

}
