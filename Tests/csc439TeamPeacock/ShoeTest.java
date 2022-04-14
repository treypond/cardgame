package csc439TeamPeacock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoeTest {

    @Test
    void numberOfDecks() {
        Shoe testShoe = new Shoe(2);
        assertEquals( 2, testShoe.numberOfDecks());

        Shoe testShoe2 = new Shoe(3);
        assertEquals(3, testShoe2.numberOfDecks());
    }

    @Test
    void removeDeck() {
        Shoe testShoe = new Shoe(8);
        assertEquals(7, testShoe.removeDeck(1));
        assertEquals(6, testShoe.removeDeck(5));
    }

    @Test
    void getRandomCard() {
        Shoe testShoe = new Shoe(2);
        PlayingCard testCard = testShoe.getRandomCard();
        assertEquals(PlayingCard.class, testCard.getClass());

        Shoe testShoe2 = new Shoe(2);
        for(int i = 0; i < 52; i++){
            testShoe2.playingShoe.get(1).getRandomCard();
        }

        for (int i = 0; i < 30; i++){
            testShoe2.getRandomCard();
        }

        assertEquals(1, testShoe2.numberOfDecks());
    }
}