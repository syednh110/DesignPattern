package behavioraldesignpatterns.commanddesignpattern.stockmarket.command;

import behavioraldesignpatterns.commanddesignpattern.stockmarket.request.Stock;

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
