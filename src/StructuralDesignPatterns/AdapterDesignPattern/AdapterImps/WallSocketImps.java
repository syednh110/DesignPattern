package StructuralDesignPatterns.AdapterDesignPattern.AdapterImps;

import StructuralDesignPatterns.AdapterDesignPattern.Adapters.WallSocket;
import StructuralDesignPatterns.AdapterDesignPattern.Model.Volt;

public class WallSocketImps implements WallSocket {

    @Override
    public Volt getVoltage() {
        return new Volt(240);
    }
}
