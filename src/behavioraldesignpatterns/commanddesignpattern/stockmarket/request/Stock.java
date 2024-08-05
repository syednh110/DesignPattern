package behavioraldesignpatterns.commanddesignpattern.stockmarket.request;

public class Stock {

    private String StockName = "Google Stock";
    private Double StockPrice = 400.0;
    private  Integer quantity = 10;

    public void buyStock(){
        System.out.println(quantity+ " Google Stock bought at " +quantity*StockPrice);
    }

    public void sellStock() {
        System.out.println(quantity+ " Google Stock sold at " +((quantity*StockPrice)+1000));
    }
}
