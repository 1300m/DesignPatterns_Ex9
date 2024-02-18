public class CoffeePot {
    AlarmMediator mediator;

    public void setMediator(AlarmMediator mediator) {
        this.mediator = mediator;
    }
    
    public void doCoffeePot() {
        mediator.doCoffeePot();
    }

}
