package BehavioralDesignPatterns.MeditorDesignPattern.ECommerceSite.after;

import BehavioralDesignPatterns.MeditorDesignPattern.ECommerceSite.before.ECommerceSite;

public class NewCustomer {
    private String address;


    public NewCustomer(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
