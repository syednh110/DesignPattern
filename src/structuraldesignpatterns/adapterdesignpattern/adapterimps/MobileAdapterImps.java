package structuraldesignpatterns.adapterdesignpattern.adapterimps;

import structuraldesignpatterns.adapterdesignpattern.adapters.MobileAdapter;
import structuraldesignpatterns.adapterdesignpattern.adapters.WallSocket;
import structuraldesignpatterns.adapterdesignpattern.model.Volt;

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
