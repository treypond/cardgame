package csc439TeamPeacock;

abstract class View {

    abstract int displayTitleScreen();

    abstract void displayHand(PlayingCard[] handToDisplay);

    abstract void getInput();

    abstract void outputMessage(String message);


}
