package BehavioralDesignPatterns.ObserverDesignPattern.NotifySystem.Obserable;

import BehavioralDesignPatterns.ObserverDesignPattern.NotifySystem.Observer.NotificationObserver;

public interface StockObserable {
    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void notifyUser();

    void setStock(int stock);
    int getStockCount();
}
