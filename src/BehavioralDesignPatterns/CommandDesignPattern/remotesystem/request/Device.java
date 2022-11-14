package BehavioralDesignPatterns.CommandDesignPattern.remotesystem.request;

public class Device {

    public static ElectronicDevice getTelevision(){
        return new Television();
    }
}
