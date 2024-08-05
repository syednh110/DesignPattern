package behavioraldesignpatterns.meditordesignpattern.ecommercesite.before;

public class Customer {
    private String address;
    private ECommerceSite eCommerceSite;

    public Customer(String address) {
        this.address = address;
        this.eCommerceSite = new ECommerceSite(this);
    }

    public String getAddress() {
        return address;
    }
    public void buy(String item, int quantity){
        if(eCommerceSite.checkInStock(item,quantity)){
            eCommerceSite.sell(item,quantity);
        }
    }
}
