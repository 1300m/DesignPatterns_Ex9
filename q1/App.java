public class App {
    public static void main(String[] args) {
        Game football = new Football();
        football.start();

        Game basketball = new Basketball();
        basketball.start();
    }
}