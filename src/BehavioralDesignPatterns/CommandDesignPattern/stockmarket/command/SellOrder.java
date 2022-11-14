package BehavioralDesignPatterns.CommandDesignPattern.stockmarket.command;

import BehavioralDesignPatterns.CommandDesignPattern.stockmarket.command.Order;
import BehavioralDesignPatterns.CommandDesignPattern.stockmarket.request.Stock;

public class SellOrder implements Order {
    Stock stock;

    public SellOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sellStock();
    }
}
