package csc439TeamPeacock;

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

        //If the number of players is greater than 4, use two decks. Otherwise use one.
        if(gameView.displayTitleScreen() > 4){
            Shoe gameShoe = new Shoe(2);
        }
        else{
            Shoe gameShoe = new Shoe(1);
        }



    }

}
