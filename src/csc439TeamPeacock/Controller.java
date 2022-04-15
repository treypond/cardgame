package csc439TeamPeacock;

import java.util.ArrayList;
import java.util.Stack;

public class Controller {

    View gameView;

    /**
     * This is the constructor for the controller object. It takes a view object as its parameter
     * and uses that for all input and output.
     * @param gameView
     */
    public Controller(View gameView) {
        this.gameView = gameView;
    }

    /**
     * This is the method called to begin a game of Golf. It contains most of the game logic.
     */
    public void playGame(){

        int numOfPlayers = gameView.displayTitleScreen();
        Shoe gameShoe;

        //If the number of players is greater than 4, use two decks. Otherwise use one.
        if(numOfPlayers > 4){
            gameShoe = new Shoe(2);
        }
        else{
            gameShoe = new Shoe(1);
        }

        //Create an array of Players
        ArrayList<Player>players=new ArrayList<Player>();

        for(int i=0; i < numOfPlayers; i++){
            players.add(new Player(getHand(gameShoe),""+i));
        }

        //Now that players have been created and assigned hands, begin taking turns and playing the game.
        //The game continues until the gameOver variable has been set to true
        int turn = 0;
        boolean gameOver = false;

        //This Stack object will act as the discard pile. When a card is picked up from the top, it is popped
        //off of the Stack, and when a card gets put on top it is pushed onto the stack.
        Stack discardPile = new Stack();

        while(!(gameOver)){

            //Display the current players turn
            gameView.displayTurn(players.get(turn));

            //Display the current players hand
            gameView.displayHand(players.get(turn).hand.getHand());

            //At this point, the player hasn't decided whether they want to draw from the deck or
            //from the discard pile. So those two options are represented with a false in the ActionList method.
            gameView.displayActions(players.get(turn).ActionList(false));

            int action = gameView.getInput();
            if(action == 1){
                //Add code for drawing from the deck (using shoe.getRandomCard)
            }

            if(action == 2){
                //Add code for taking the top card off of the discard pile (using discardPile.pop)
            }



        }


    }

    /**
     * This method generates a 6 card deck from the Shoe.
     * @return
     */
    public Hand getHand(Shoe gameShoe){
        PlayingCard card1 = gameShoe.getRandomCard();
        PlayingCard card2 = gameShoe.getRandomCard();
        PlayingCard card3= gameShoe.getRandomCard();
        PlayingCard card4= gameShoe.getRandomCard();
        PlayingCard card5= gameShoe.getRandomCard();
        PlayingCard card6= gameShoe.getRandomCard();

        Hand hand= new Hand(card1,card2,card3,card4,card5,card6);
        return hand;
    }

}
