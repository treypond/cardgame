package csc439TeamPeacock;

import java.util.ArrayList;

public class Controller {

    View gameView;
   Shoe gameShoe;
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

        //If the number of players is greater than 4, use two decks. Otherwise use one.
        if(numOfPlayers > 4){
             gameShoe = new Shoe(2);
        }
        else{
             gameShoe = new Shoe(1);
        }
        ArrayList<Player>players=new ArrayList<Player>();

        for(int i=0;i<numOfPlayers;i++){
               players.add(new Player(getHand(),""+i));
        }









    }

    /**
     * This method generates a 6 card deck from the Shoe.
     * @return
     */
    public Hand getHand(){
        PlayingCard card1 = gameShoe.getRandomCard();
        PlayingCard card2 =  gameShoe.getRandomCard();
        PlayingCard card3= gameShoe.getRandomCard();
        PlayingCard card4= gameShoe.getRandomCard();
        PlayingCard card5= gameShoe.getRandomCard();
        PlayingCard card6= gameShoe.getRandomCard();

           Hand hand= new Hand(card1,card2,card3,card4,card5,card6);
        return hand;
    }

}
