package BehavioralDesignPatterns.StateDesignPattern.after;

public class ContextSwitch implements State{
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    @Override
    public void chageState() {
        this.state.chageState();
    }
}
