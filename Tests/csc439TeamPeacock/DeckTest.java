package csc439TeamPeacock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void getSize() {
        Deck testDeck = new Deck();
        assertEquals(52, testDeck.getSize());
    }

    @Test
    void getRandomCard() {
        Deck testDeck = new Deck();
        PlayingCard testCard = testDeck.getRandomCard();
        assertEquals(51, testDeck.getSize());
        assertEquals(PlayingCard.class, testCard.getClass());
    }
}