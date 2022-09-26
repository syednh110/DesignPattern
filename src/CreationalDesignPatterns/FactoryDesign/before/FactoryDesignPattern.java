package CreationalDesignPatterns.FactoryDesign.before;

import CreationalDesignPatterns.FactoryDesign.allOS.Andriod;
import CreationalDesignPatterns.FactoryDesign.allOS.OS;
import CreationalDesignPatterns.FactoryDesign.allOS.Window;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        OS operatingSystem = new Andriod();
        operatingSystem.specification();

        OS operatingSystem1 = new Window();
        operatingSystem1.specification();
    }
}
