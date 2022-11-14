package BehavioralDesignPatterns.CommandDesignPattern.stockmarket.invoker;

import BehavioralDesignPatterns.CommandDesignPattern.stockmarket.command.Order;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {

    List<Order> list;
    public StockBroker(){
        this.list = new ArrayList<>();
    }

    public void placeOrder(Order order){
        list.add(order);
    }

    public void executeOrder(){
        for(Order order: list){
            order.execute();
        }
        list.clear();
    }
}
