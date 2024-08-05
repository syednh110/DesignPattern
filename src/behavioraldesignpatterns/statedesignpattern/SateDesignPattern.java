package behavioraldesignpatterns.statedesignpattern;

import behavioraldesignpatterns.statedesignpattern.after.ContextSwitch;
import behavioraldesignpatterns.statedesignpattern.after.OFFState;
import behavioraldesignpatterns.statedesignpattern.after.ONState;
import behavioraldesignpatterns.statedesignpattern.before.SwitchDesign;

public class SateDesignPattern {
    public static void main(String[] args) {
        //Simple design
        SwitchDesign onstate = new SwitchDesign();
        onstate.setState("ON");
        onstate.stateChange();

        onstate.setState("OFF");
        onstate.stateChange();

        System.out.println("-----------------------------");
        //After Design
        ContextSwitch stateSwitch = new ContextSwitch();
        ONState onState = new ONState();
        stateSwitch.setState(onState);
        stateSwitch.chageState();

        OFFState offState = new OFFState();
        stateSwitch.setState(offState);
        stateSwitch.chageState();
    }
}
