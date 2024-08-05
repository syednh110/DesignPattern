package behavioraldesignpatterns.observerdesignpattern.obserable;

import behavioraldesignpatterns.observerdesignpattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObserable implements StockObserable{
    private List<NotificationObserver> list = new ArrayList<>();
    private int stock =0;


    @Override
    public void add(NotificationObserver notificationObserver) {
        list.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        list.remove(notificationObserver);
    }

    @Override
    public void notifyUser() {
        for(NotificationObserver notificationObserver1: list){
            notificationObserver1.update();
        }
    }

    @Override
    public void setStock(int stock) {
        if(this.stock==0){
            notifyUser();
        }
        this.stock +=stock;
    }

    @Override
    public int getStockCount() {
        return stock;
    }


}
