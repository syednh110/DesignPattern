package behavioraldesignpatterns.commanddesignpattern.stockmarket;

import behavioraldesignpatterns.commanddesignpattern.stockmarket.command.BuyOrder;
import behavioraldesignpatterns.commanddesignpattern.stockmarket.command.SellOrder;
import behavioraldesignpatterns.commanddesignpattern.stockmarket.invoker.StockBroker;
import behavioraldesignpatterns.commanddesignpattern.stockmarket.request.Stock;

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
