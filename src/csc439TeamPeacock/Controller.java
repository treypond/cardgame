package csc439TeamPeacock;

import java.util.ArrayList;
import java.util.*;



import java.util.Stack;




public class Controller {

    View gameView;


   Shoe gameShoe;

    PlayingCard temp;

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
                int discardNum = gameView.getDiscardNum();
                discardPile.push(players.get(turn).hand.getHand()[discardNum]);

                if(discardNum==0){
                    players.get(turn).hand.card1=gameShoe.getRandomCard();

                    players.get(turn).hand.card1.faceDownSetter(false);
                }
                if(discardNum==1){
                    players.get(turn).hand.card2=gameShoe.getRandomCard();
                    players.get(turn).hand.card2.faceDownSetter(false);
                }
                if(discardNum==2){
                    players.get(turn).hand.card3=gameShoe.getRandomCard();
                    players.get(turn).hand.card3.faceDownSetter(false);
                }
                if(discardNum==3){
                    players.get(turn).hand.card4=gameShoe.getRandomCard();
                    players.get(turn).hand.card4.faceDownSetter(false);
                }
                if(discardNum==4){
                    players.get(turn).hand.card5=gameShoe.getRandomCard();
                    players.get(turn).hand.card5.faceDownSetter(false);
                }
                if(discardNum==5){
                    players.get(turn).hand.card6=gameShoe.getRandomCard();
                    players.get(turn).hand.card6.faceDownSetter(false);

                }
               
            }

            if(action == 2){
                //Add code for taking the top card off of the discard pile (using discardPile.pop)
                int discardNum = gameView.getDiscardNum();

                temp = (PlayingCard) discardPile.peek();
                discardPile.push(players.get(turn).hand.getHand()[discardNum]);
                if(discardNum==0){
                    players.get(turn).hand.card1=temp;
                    players.get(turn).hand.card1.faceDownSetter(false);
                }
                if(discardNum==1){
                    players.get(turn).hand.card2=temp;
                    players.get(turn).hand.card2.faceDownSetter(false);
                }
                if(discardNum==2){
                    players.get(turn).hand.card3=temp;
                    players.get(turn).hand.card3.faceDownSetter(false);
                }
                if(discardNum==3){
                    players.get(turn).hand.card4=temp;
                    players.get(turn).hand.card4.faceDownSetter(false);
                }
                if(discardNum==4){
                    players.get(turn).hand.card5=temp;
                    players.get(turn).hand.card5.faceDownSetter(false);
                }
                if(discardNum==5){
                    players.get(turn).hand.card6=temp;
                    players.get(turn).hand.card6.faceDownSetter(false);
                }
               
            }

            //Ask the player if they want to quit the game, if they do then set gameOver to true so the loop ends
            int quit = gameView.quitGame();

            if( quit == -1 ){
                gameOver = true;
            }

            //Move to the next players turn
            turn++;

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
