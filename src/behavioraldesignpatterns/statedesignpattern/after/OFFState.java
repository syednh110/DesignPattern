package behavioraldesignpatterns.statedesignpattern.after;

public class OFFState implements State{
    @Override
    public void chageState() {
        System.out.println("System is OFF");
    }
}
