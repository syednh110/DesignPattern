package behavioraldesignpatterns.observerdesignpattern.obserable;

import behavioraldesignpatterns.observerdesignpattern.observer.NotificationObserver;

public interface StockObserable {
    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void notifyUser();

    void setStock(int stock);
    int getStockCount();
}
