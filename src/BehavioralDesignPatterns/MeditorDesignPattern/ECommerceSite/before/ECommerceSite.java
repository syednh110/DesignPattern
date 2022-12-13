package BehavioralDesignPatterns.MeditorDesignPattern.ECommerceSite.before;

import java.util.HashMap;
import java.util.Map;

public class ECommerceSite {
    private Customer customer;
    private Driver driver;
    private Map<String,Integer> stock;

    public ECommerceSite(Customer customer) {
        this.customer = customer;
        this.stock = new HashMap<>();
        this.driver = new Driver();
        stock.put("pens",100);
        stock.put("pencils",200);
        stock.put("eraser",50);
    }

    public boolean checkInStock(String item, int quantity) {
        if(stock.containsKey(item) && stock.get(item)>quantity){
            return true;
        }
        else{
            return false;
        }
    }

    public void sell(String item, int quantity) {
        int newStock = stock.get(item) - quantity;
        stock.put(item,newStock);

        driver.deliver(item,quantity,customer);
    }
}
