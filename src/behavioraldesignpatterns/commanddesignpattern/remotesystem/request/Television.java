package behavioraldesignpatterns.commanddesignpattern.remotesystem.request;

public class Television implements ElectronicDevice {
    Integer vol = 0;
    @Override
    public void on() {
        System.out.println("Television is ON");
    }

    @Override
    public void off() {
        System.out.println("Television is OFF");
    }

    @Override
    public void volUp() {
        vol++;
        System.out.println("Volumn up "+ vol);
    }

    @Override
    public void volDown() {
        vol--;
        System.out.println("Volumn down "+ vol);
    }
}
