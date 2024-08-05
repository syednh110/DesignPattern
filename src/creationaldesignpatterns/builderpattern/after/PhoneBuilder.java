package creationaldesignpatterns.builderpattern.after;

import creationaldesignpatterns.builderpattern.before.Phone;

public class PhoneBuilder {

    private String companyName;
    private String processor;
    private int ram;
    private int battery;
    private int rom;

    public PhoneBuilder setCompanyName(String companyName){
        this.companyName=companyName;
        return this;
    }

    public PhoneBuilder setProcessor(String processor){
        this.processor=processor;
        return this;
    }
    public PhoneBuilder setRam(int ram){
        this.ram = ram;
        return this;
    }
    public PhoneBuilder setRom(int rom){
        this.rom = rom;
        return this;
    }
    public PhoneBuilder setBattery(int battery){
        this.battery=battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(companyName,processor,ram,battery,rom);
    }
}
