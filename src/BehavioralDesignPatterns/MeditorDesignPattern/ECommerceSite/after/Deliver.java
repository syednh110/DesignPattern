package BehavioralDesignPatterns.MeditorDesignPattern.ECommerceSite.after;

public class Deliver {
    public void getDelivered(String item, int quantity, NewCustomer newCustomer) {
        System.out.println(quantity + " " + item + " is delivered for " + newCustomer.getAddress());
    }
}
