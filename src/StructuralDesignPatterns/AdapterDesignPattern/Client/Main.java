package StructuralDesignPatterns.AdapterDesignPattern.Client;

import StructuralDesignPatterns.AdapterDesignPattern.AdapterImps.MobileAdapterImps;
import StructuralDesignPatterns.AdapterDesignPattern.AdapterImps.WallSocketImps;
import StructuralDesignPatterns.AdapterDesignPattern.Adapters.MobileAdapter;
import StructuralDesignPatterns.AdapterDesignPattern.Adapters.WallSocket;

public class Main {
    public static void main(String[] args) {
        WallSocket wallSocket = new WallSocketImps();

        MobileAdapter mobileAdapter = new MobileAdapterImps(wallSocket);

        System.out.println(mobileAdapter.get24Voltage());
    }
}
