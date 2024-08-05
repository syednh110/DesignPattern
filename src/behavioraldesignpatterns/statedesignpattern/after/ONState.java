package behavioraldesignpatterns.statedesignpattern.after;

public class ONState implements State{

    @Override
    public void chageState() {
        System.out.println("System is ON");
    }
}
