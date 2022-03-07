package csc439TeamPeacock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCardTest {

    @Test
    void suitGetter() {
        PlayingCard testCard = new PlayingCard("Hearts", 9, false);
        assertEquals("Hearts", testCard.suitGetter());
    }

    @Test
    void numberGetter() {
        PlayingCard testCard = new PlayingCard("Hearts", 5, false);
        assertEquals(5, testCard.numberGetter());
    }

    @Test
    void wildcardGetter() {
        PlayingCard testCard = new PlayingCard("Hearts", 6, true);
        assertEquals(true, testCard.wildcardGetter());
    }

    @Test
    void isRed() {
        PlayingCard testCard = new PlayingCard("Hearts", 6, false);
        assertEquals(true, testCard.isRed());

        PlayingCard testCard2 = new PlayingCard("Spades", 10, false);
        assertEquals(false, testCard2.isRed());
    }
}