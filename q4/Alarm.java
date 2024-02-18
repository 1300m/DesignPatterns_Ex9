public class Alarm {
    AlarmMediator mediator;

    public void setMediator(AlarmMediator mediator) {
        this.mediator = mediator;
    }

    public void doAlarm() {
        mediator.doAlarm();
    }
    public void endAlarm(String from) {
        System.out.println("Alarm event ended from " + from);
    }

}