package BehavioralDesignPatterns.ObserverDesignPattern.NotifySystem;

import BehavioralDesignPatterns.ObserverDesignPattern.NotifySystem.Obserable.IphoneObserable;
import BehavioralDesignPatterns.ObserverDesignPattern.NotifySystem.Obserable.StockObserable;
import BehavioralDesignPatterns.ObserverDesignPattern.NotifySystem.Observer.EmailNotification;
import BehavioralDesignPatterns.ObserverDesignPattern.NotifySystem.Observer.MobileNotification;
import BehavioralDesignPatterns.ObserverDesignPattern.NotifySystem.Observer.NotificationObserver;

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
