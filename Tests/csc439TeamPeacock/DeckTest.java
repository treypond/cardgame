package csc439TeamPeacock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void getSize() {
        Deck testDeck = new Deck();
        assertEquals(52, testDeck.getSize());
    }

}