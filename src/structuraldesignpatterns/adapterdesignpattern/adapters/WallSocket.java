package structuraldesignpatterns.adapterdesignpattern.adapters;

import structuraldesignpatterns.adapterdesignpattern.model.Volt;

public interface WallSocket {
    Volt getVoltage();
}
