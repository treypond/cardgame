package csc439TeamPeacock;

public class Main {

    public void main(String args[]) {

        Controller gameController = new Controller(new CLIView());
        gameController.playGame();

    }

}
