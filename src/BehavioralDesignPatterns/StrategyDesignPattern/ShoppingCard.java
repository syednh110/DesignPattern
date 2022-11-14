package BehavioralDesignPatterns.StrategyDesignPattern;

import BehavioralDesignPatterns.StrategyDesignPattern.Model.Product;
import BehavioralDesignPatterns.StrategyDesignPattern.PaymentOption.Payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    private List<Product> list;

    public ShoppingCard() {
        this.list = new ArrayList<>();
    }

    void addItem(Product product){
        list.add(product);
    }

    void removeItem(Product product){
        list.remove(product);
    }

    Double calTotalPrice(){
        return list.stream().map(product -> product.getPrice()).reduce(0.0,Double::sum);
    }


    public void doPayment(Payment payment) {
        payment.doPayment(calTotalPrice());
    }
}
