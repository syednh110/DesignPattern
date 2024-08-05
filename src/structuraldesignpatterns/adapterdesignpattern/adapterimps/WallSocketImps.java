package structuraldesignpatterns.adapterdesignpattern.adapterimps;

import structuraldesignpatterns.adapterdesignpattern.adapters.WallSocket;
import structuraldesignpatterns.adapterdesignpattern.model.Volt;

public class WallSocketImps implements WallSocket {

    @Override
    public Volt getVoltage() {
        return new Volt(240);
    }
}
