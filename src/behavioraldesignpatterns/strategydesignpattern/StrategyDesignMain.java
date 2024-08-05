package behavioraldesignpatterns.strategydesignpattern;

import behavioraldesignpatterns.strategydesignpattern.Model.Product;
import behavioraldesignpatterns.strategydesignpattern.PaymentOption.PhonePay;

public class StrategyDesignMain {
    public static void main(String[] args) {
        ShoppingCard shoppingCard = new ShoppingCard();

        Product p1 = new Product("Hair Oil","1001",200.0);
        Product p2 = new Product("Fair Lovely","1002",300.0);

        shoppingCard.addItem(p1);
        shoppingCard.addItem(p2);

        shoppingCard.doPayment(new PhonePay("8987279252@ybl"));
    }
}
