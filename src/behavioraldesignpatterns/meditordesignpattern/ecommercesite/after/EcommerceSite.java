package behavioraldesignpatterns.meditordesignpattern.ecommercesite.after;

import java.util.HashMap;
import java.util.Map;

public class EcommerceSite {
    private Map<String,Integer> stock;

    public EcommerceSite() {
        this.stock = new HashMap<>();
        stock.put("pens",100);
        stock.put("pencils",200);
        stock.put("erasers",50);
    }

    public boolean checkStock(String item, int quantity) {
        if(stock.containsKey(item) && stock.get(item)>= quantity){
            return true;
        }
        else{
            return false;
        }
    }

    public void sell(String item, int quantity) {
        int newQuantity = stock.get(item) - quantity;
        stock.put(item,newQuantity);
    }
}
