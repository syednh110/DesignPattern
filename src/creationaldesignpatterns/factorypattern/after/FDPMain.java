package creationaldesignpatterns.factorypattern.after;

import creationaldesignpatterns.factorypattern.allOS.OS;

public class FDPMain {

    public static void main(String[] args) {
        OSfactory factory = new OSfactory();
        OS operatingSystem = factory.getOS("open");
        operatingSystem.specification();
    }
}
