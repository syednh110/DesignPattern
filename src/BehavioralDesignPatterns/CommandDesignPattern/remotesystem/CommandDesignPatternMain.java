package BehavioralDesignPatterns.CommandDesignPattern.remotesystem;

import BehavioralDesignPatterns.CommandDesignPattern.remotesystem.command.TVOff;
import BehavioralDesignPatterns.CommandDesignPattern.remotesystem.command.TVOn;
import BehavioralDesignPatterns.CommandDesignPattern.remotesystem.command.TVVolUp;
import BehavioralDesignPatterns.CommandDesignPattern.remotesystem.invoker.Remote;
import BehavioralDesignPatterns.CommandDesignPattern.remotesystem.request.Device;
import BehavioralDesignPatterns.CommandDesignPattern.remotesystem.request.ElectronicDevice;

public class CommandDesignPatternMain {
    public static void main(String[] args) {
    //Remote System
        ElectronicDevice electronicDevice = Device.getTelevision();
        TVOn tvOn = new TVOn(electronicDevice);

        Remote remote = new Remote(tvOn);
        remote.process();

        TVOff tvOff = new TVOff(electronicDevice);
        remote = new Remote(tvOff);
        remote.process();

        TVVolUp tvVolUp = new TVVolUp(electronicDevice);
        remote = new Remote(tvVolUp);
        remote.process();
        remote.process();
        remote.process();
    }
}
