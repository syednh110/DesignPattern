package BehavioralDesignPatterns.CommandDesignPattern.remotesystem.command;

import BehavioralDesignPatterns.CommandDesignPattern.remotesystem.request.ElectronicDevice;

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
