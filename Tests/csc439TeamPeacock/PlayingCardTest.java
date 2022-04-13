package csc439TeamPeacock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCardTest {

    @Test
    void suitGetter() {
        PlayingCard testCard = new PlayingCard("Hearts", 9, false, false);
        assertEquals("Hearts", testCard.suitGetter());
    }

    @Test
    void numberGetter() {
        PlayingCard testCard = new PlayingCard("Hearts", 5, false, false);
        assertEquals(5, testCard.numberGetter());
    }

    @Test
    void wildcardGetter() {
        PlayingCard testCard = new PlayingCard("Hearts", 6, true, false);
        assertEquals(true, testCard.wildcardGetter());
    }

    @Test
    void isRed() {
        PlayingCard testCard = new PlayingCard("Hearts", 6, false, false);
        assertEquals(true, testCard.isRed());

        PlayingCard testCard2 = new PlayingCard("Spades", 10, false, false);
        assertEquals(false, testCard2.isRed());
    }

    @Test
    void faceDownGetter() {
        PlayingCard testCard = new PlayingCard("Hearts", 6, false, false);
        assertEquals(false, testCard.faceDownGetter());
    }

    @Test
    void faceDownSetter() {
        PlayingCard testCard = new PlayingCard("Hearts", 6, false, false);
        testCard.faceDownSetter(true);
        assertEquals(true, testCard.faceDownGetter());

        PlayingCard testCard2 = new PlayingCard("Hearts", 6, false, true);
        testCard2.faceDownSetter(false);
        assertEquals(false, testCard2.faceDownGetter());
    }

    @Test
    void numberToCardConverter() {
        PlayingCard testCard = new PlayingCard("Hearts", 6, false, false);
        assertEquals("6", testCard.numberToCardConverter());

        PlayingCard testCard2 = new PlayingCard("Hearts", 1, false, false);
        assertEquals("Ace", testCard2.numberToCardConverter());

        PlayingCard testCard3 = new PlayingCard("Hearts", 11, false, false);
        assertEquals("Jack", testCard3.numberToCardConverter());

        PlayingCard testCard4 = new PlayingCard("Hearts", 12, false, false);
        assertEquals("Queen", testCard4.numberToCardConverter());

        PlayingCard testCard5 = new PlayingCard("Hearts", 13, false, false);
        assertEquals("King", testCard5.numberToCardConverter());
    }

    @Test
    void cardToString() {
        PlayingCard testCard = new PlayingCard("Hearts", 6, false, false);
        assertEquals("6 of Hearts", testCard.cardToString());
    }
}