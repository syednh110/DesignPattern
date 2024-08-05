package behavioraldesignpatterns.commanddesignpattern.remotesystem.command;

import behavioraldesignpatterns.commanddesignpattern.remotesystem.request.ElectronicDevice;

public class TVVolUp implements Command {
    ElectronicDevice electronicDevice;

    public TVVolUp(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volUp();
    }
}
