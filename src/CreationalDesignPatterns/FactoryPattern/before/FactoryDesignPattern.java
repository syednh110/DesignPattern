package CreationalDesignPatterns.FactoryPattern.before;

import CreationalDesignPatterns.FactoryPattern.allOS.Andriod;
import CreationalDesignPatterns.FactoryPattern.allOS.OS;
import CreationalDesignPatterns.FactoryPattern.allOS.Window;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        OS operatingSystem = new Andriod();
        operatingSystem.specification();

        OS operatingSystem1 = new Window();
        operatingSystem1.specification();
    }
}
