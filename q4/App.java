public class App {
    public static void main(String[] args) {
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();
        Alarm alarm = new Alarm();

        AlarmMediator mediator = new AlarmMediator();
        mediator.setSprinkler(sprinkler);
        mediator.setCoffeePot(coffeePot);
        mediator.setAlarm(alarm);

        sprinkler.setMediator(mediator);
        coffeePot.setMediator(mediator);
        alarm.setMediator(mediator);

        alarm.doAlarm();
    }    
}
