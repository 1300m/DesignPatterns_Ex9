public class App {
    public static void main(String[] args) {
        Game football = new Game(new Football());
        football.start();

        Game basketball = new Game(new Basketball());
        basketball.start();
    }
}