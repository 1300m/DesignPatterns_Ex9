public class Game {
    private GameStrategy gameStrategy;

    public Game(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public final void start() {
        gameStrategy.initializeGame();
        gameStrategy.playingGame();
        gameStrategy.showResult();
    }
}
