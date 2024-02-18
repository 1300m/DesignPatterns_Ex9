public class AlarmMediator implements IMediator {
    private Alarm alarm;
    private Sprinkler sprinkler;
    private CoffeePot coffeePot;

    @Override
    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        sprinkler.doSprinkler();
        coffeePot.doCoffeePot();
    }

    @Override
    public void doSprinkler() {
        System.out.println("I am sprinkler,... doing my task");
        alarm.endAlarm("Sprinkler");
    }

    @Override
    public void doCoffeePot() {
        System.out.println("I am coffe pot,... doing my task");
        alarm.endAlarm("Coffee Pot");
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public void setSprinkler(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    public Sprinkler getSprinkler() {
        return sprinkler;
    }

    public void setCoffeePot(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    public CoffeePot getCoffeePot() {
        return coffeePot;
    }
}
