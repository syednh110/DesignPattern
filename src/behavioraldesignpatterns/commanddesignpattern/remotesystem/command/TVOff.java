package behavioraldesignpatterns.commanddesignpattern.remotesystem.command;

import behavioraldesignpatterns.commanddesignpattern.remotesystem.request.ElectronicDevice;

public class TVOff implements Command {
    ElectronicDevice electronicDevice;

    public TVOff(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();
    }
}
