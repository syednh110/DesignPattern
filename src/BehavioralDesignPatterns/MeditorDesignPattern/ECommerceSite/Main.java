package BehavioralDesignPatterns.MeditorDesignPattern.ECommerceSite;

import BehavioralDesignPatterns.MeditorDesignPattern.ECommerceSite.after.Mediator;
import BehavioralDesignPatterns.MeditorDesignPattern.ECommerceSite.before.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(" Chandanpatti laheria Sarai");
        customer.buy("pens",20);

        // After Mediator pattern
        Mediator mediator = new Mediator();
        mediator.buy("pens",10);
    }
}
