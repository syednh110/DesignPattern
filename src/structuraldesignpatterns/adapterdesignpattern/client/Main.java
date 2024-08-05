package structuraldesignpatterns.adapterdesignpattern.client;

import structuraldesignpatterns.adapterdesignpattern.adapterimps.MobileAdapterImps;
import structuraldesignpatterns.adapterdesignpattern.adapterimps.WallSocketImps;
import structuraldesignpatterns.adapterdesignpattern.adapters.MobileAdapter;
import structuraldesignpatterns.adapterdesignpattern.adapters.WallSocket;

public class Main {
    public static void main(String[] args) {
        WallSocket wallSocket = new WallSocketImps();

        MobileAdapter mobileAdapter = new MobileAdapterImps(wallSocket);

        System.out.println(mobileAdapter.get24Voltage());
    }
}
