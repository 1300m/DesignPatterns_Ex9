public class Basketball extends Game {
    @Override
    protected void initializeGame() {
        System.out.println("Initalizing basketball game...");
    }

    @Override
    protected void playingGame() {
        System.out.println("Playing basketball game...");
    }

    @Override
    protected void showResult() {
        System.out.println("Showing the results for the basketball game...");
    }
}
