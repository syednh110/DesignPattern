package StructuralDesignPatterns.AdapterDesignPattern.Model;

public class Volt {

    int volt;

    public Volt(int volt) {
        this.volt = volt;
    }

    public int getVolt(){
        return volt;
    }

    @Override
    public String toString() {
        return "Volt{" +
                "volt=" + volt +
                '}';
    }
}
