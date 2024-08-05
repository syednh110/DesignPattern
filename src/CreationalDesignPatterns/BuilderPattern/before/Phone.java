package CreationalDesignPatterns.BuilderPattern.before;

public class Phone {

    private String companyName;
    private String processor;
    private int ram;
    private int battery;
    private int rom;

    public Phone(String companyName, String processor, int ram, int battery, int rom) {
        this.companyName = companyName;
        this.processor = processor;
        this.ram = ram;
        this.battery = battery;
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "companyName='" + companyName + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", battery=" + battery +
                ", rom=" + rom +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }



}
