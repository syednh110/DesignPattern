package BehavioralDesignPatterns.StateDesignPattern;

import BehavioralDesignPatterns.StateDesignPattern.after.ContextSwitch;
import BehavioralDesignPatterns.StateDesignPattern.after.OFFState;
import BehavioralDesignPatterns.StateDesignPattern.after.ONState;
import BehavioralDesignPatterns.StateDesignPattern.before.SwitchDesign;

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
