package BehavioralDesignPatterns.CommandDesignPattern.remotesystem.command;

import BehavioralDesignPatterns.CommandDesignPattern.remotesystem.request.ElectronicDevice;

public class TVOn implements Command {
    ElectronicDevice electronicDevice;

    public TVOn(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.on();
    }
}
