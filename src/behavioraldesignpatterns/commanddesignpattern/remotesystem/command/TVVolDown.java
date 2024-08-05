package behavioraldesignpatterns.commanddesignpattern.remotesystem.command;

import behavioraldesignpatterns.commanddesignpattern.remotesystem.request.ElectronicDevice;

public class TVVolDown implements Command {
    ElectronicDevice electronicDevice;

    public TVVolDown(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volDown();
    }
}
