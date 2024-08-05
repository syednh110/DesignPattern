package behavioraldesignpatterns.observerdesignpattern;

import behavioraldesignpatterns.observerdesignpattern.obserable.IphoneObserable;
import behavioraldesignpatterns.observerdesignpattern.obserable.StockObserable;
import behavioraldesignpatterns.observerdesignpattern.observer.EmailNotification;
import behavioraldesignpatterns.observerdesignpattern.observer.MobileNotification;
import behavioraldesignpatterns.observerdesignpattern.observer.NotificationObserver;

public class Store {
    public static void main(String[] args) {
        StockObserable stockObserable = new IphoneObserable();

        NotificationObserver notificationObserver = new MobileNotification("8987279252",stockObserable);
        NotificationObserver notificationObserver1 = new EmailNotification(stockObserable,"syednh110@gmail.com");
        stockObserable.add(notificationObserver);
        stockObserable.add(notificationObserver1);
        stockObserable.setStock(100);
    }
}
