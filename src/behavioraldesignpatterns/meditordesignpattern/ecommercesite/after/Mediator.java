package behavioraldesignpatterns.meditordesignpattern.ecommercesite.after;

public class Mediator {
    private NewCustomer newCustomer;
    private EcommerceSite ecommerceSite;
    private Deliver deliver;

    public Mediator() {
        this.newCustomer = new NewCustomer("Hussaini Muhalla");
        this.ecommerceSite = new EcommerceSite();
        this.deliver = new Deliver();
    }

    public void buy(String item, int quantity){
        if(ecommerceSite.checkStock(item,quantity)){
            ecommerceSite.sell(item,quantity);
            deliver.getDelivered(item,quantity,newCustomer);
        }
    }
}
