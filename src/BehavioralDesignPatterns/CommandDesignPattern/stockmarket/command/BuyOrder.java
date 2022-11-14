package BehavioralDesignPatterns.CommandDesignPattern.stockmarket.command;

import BehavioralDesignPatterns.CommandDesignPattern.stockmarket.request.Stock;

public class BuyOrder implements Order {
    Stock stock;

    public BuyOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buyStock();
    }
}
