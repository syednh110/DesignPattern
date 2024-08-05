package creationaldesignpatterns.builderpattern;

import creationaldesignpatterns.builderpattern.after.PhoneBuilder;
import creationaldesignpatterns.builderpattern.before.Phone;

public class BuilderMain {

    public static void main(String[] args) {
        //Before Builder pattern
        Phone phone = new Phone("Linovo","Mediatek",8,4300,128);
        System.out.println(phone.toString());

        //After Builder pattern
        PhoneBuilder builder = new PhoneBuilder();
        Phone newPhone = builder.setCompanyName("Oneplus").setRam(4).setProcessor("Snapdragon").setBattery(4500).getPhone();
        System.out.println(newPhone);
    }
}
