package structuraldesignpatterns.adapterdesignpattern.adapters;

import structuraldesignpatterns.adapterdesignpattern.model.Volt;

public interface MobileAdapter {
    Volt get24Voltage();
}
