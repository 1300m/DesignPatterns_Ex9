public class Sprinkler {
    AlarmMediator mediator;

    public void setMediator(AlarmMediator mediator) {
        this.mediator = mediator;
    }

    public void doSprinkler() {
        mediator.doSprinkler();
    }
}
