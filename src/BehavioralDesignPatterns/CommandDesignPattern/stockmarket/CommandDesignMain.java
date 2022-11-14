package BehavioralDesignPatterns.CommandDesignPattern.stockmarket;

import BehavioralDesignPatterns.CommandDesignPattern.stockmarket.command.BuyOrder;
import BehavioralDesignPatterns.CommandDesignPattern.stockmarket.command.SellOrder;
import BehavioralDesignPatterns.CommandDesignPattern.stockmarket.invoker.StockBroker;
import BehavioralDesignPatterns.CommandDesignPattern.stockmarket.request.Stock;

public class CommandDesignMain {
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyOrder buyOrder = new BuyOrder(stock);
        SellOrder sellOrder = new SellOrder(stock);

        StockBroker stockBroker = new StockBroker();
        stockBroker.placeOrder(buyOrder);
        stockBroker.placeOrder(sellOrder);

        stockBroker.executeOrder();

    }
}
