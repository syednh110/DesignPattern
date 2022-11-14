package BehavioralDesignPatterns.CommandDesignPattern.remotesystem.command;

import BehavioralDesignPatterns.CommandDesignPattern.remotesystem.request.ElectronicDevice;

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
