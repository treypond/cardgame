package csc439TeamPeacock;

import java.util.ArrayList;

abstract class View {

    abstract int displayTitleScreen();

    abstract void displayHand(PlayingCard[] handToDisplay);

    abstract int getInput();

    abstract void outputMessage(String message);

    abstract void displayTurn(Player player);

    abstract void displayActions(ArrayList<String> actionList);


}
