package behavioraldesignpatterns.commanddesignpattern.remotesystem.request;

public class Device {

    public static ElectronicDevice getTelevision(){
        return new Television();
    }
}
