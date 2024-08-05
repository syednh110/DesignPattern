package behavioraldesignpatterns.meditordesignpattern.ecommercesite;

import behavioraldesignpatterns.meditordesignpattern.ecommercesite.after.Mediator;
import behavioraldesignpatterns.meditordesignpattern.ecommercesite.before.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(" Chandanpatti laheria Sarai");
        customer.buy("pens",20);

        // After Mediator pattern
        Mediator mediator = new Mediator();
        mediator.buy("pens",10);
    }
}
