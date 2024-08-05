package behavioraldesignpatterns.commanddesignpattern.remotesystem;

import behavioraldesignpatterns.commanddesignpattern.remotesystem.command.TVOff;
import behavioraldesignpatterns.commanddesignpattern.remotesystem.command.TVOn;
import behavioraldesignpatterns.commanddesignpattern.remotesystem.command.TVVolUp;
import behavioraldesignpatterns.commanddesignpattern.remotesystem.invoker.Remote;
import behavioraldesignpatterns.commanddesignpattern.remotesystem.request.Device;
import behavioraldesignpatterns.commanddesignpattern.remotesystem.request.ElectronicDevice;

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
