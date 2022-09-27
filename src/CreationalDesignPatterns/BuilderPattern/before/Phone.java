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
}
