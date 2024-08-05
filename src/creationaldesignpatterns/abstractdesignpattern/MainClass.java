package creationaldesignpatterns.abstractdesignpattern;

public class MainClass {

    public static void main(String[] args) {
        AbstractFactory factory = MainFactory.getFactoryType("MobileFactory");
        Device device = factory.getGadget("Nokia");
        System.out.println(device.specification());
    }

}
