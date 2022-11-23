package StructuralDesignPatterns.AdapterDesignPattern.Adapters;

import StructuralDesignPatterns.AdapterDesignPattern.Model.Volt;

public interface WallSocket {
    Volt getVoltage();
}
