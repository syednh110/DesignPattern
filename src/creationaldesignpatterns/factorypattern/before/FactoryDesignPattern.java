package creationaldesignpatterns.factorypattern.before;

import creationaldesignpatterns.factorypattern.allOS.Andriod;
import creationaldesignpatterns.factorypattern.allOS.OS;
import creationaldesignpatterns.factorypattern.allOS.Window;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        OS operatingSystem = new Andriod();
        operatingSystem.specification();

        OS operatingSystem1 = new Window();
        operatingSystem1.specification();
    }
}
