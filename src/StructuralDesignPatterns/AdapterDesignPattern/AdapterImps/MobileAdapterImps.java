package StructuralDesignPatterns.AdapterDesignPattern.AdapterImps;

import StructuralDesignPatterns.AdapterDesignPattern.Adapters.MobileAdapter;
import StructuralDesignPatterns.AdapterDesignPattern.Adapters.WallSocket;
import StructuralDesignPatterns.AdapterDesignPattern.Model.Volt;

public class MobileAdapterImps implements MobileAdapter {

    WallSocket wallSocket;

    public MobileAdapterImps(WallSocket wallSocket) {
        this.wallSocket = wallSocket;
    }

    @Override
    public Volt get24Voltage() {
        Volt v = wallSocket.getVoltage();
        int v24 = v.getVolt()/10;
        return new Volt(v24);
    }
}
