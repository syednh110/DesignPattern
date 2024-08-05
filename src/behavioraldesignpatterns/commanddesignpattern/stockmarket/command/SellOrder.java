package behavioraldesignpatterns.commanddesignpattern.stockmarket.command;

import behavioraldesignpatterns.commanddesignpattern.stockmarket.request.Stock;

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
