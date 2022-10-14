package CreationalDesignPatterns.FactoryPattern.after;

import CreationalDesignPatterns.FactoryPattern.allOS.OS;

public class FDPMain {

    public static void main(String[] args) {
        OSfactory factory = new OSfactory();
        OS operatingSystem = factory.getOS("open");
        operatingSystem.specification();
    }
}
