package BehavioralDesignPatterns.ObserverDesignPattern.NotifySystem.Observer;

import BehavioralDesignPatterns.ObserverDesignPattern.NotifySystem.Obserable.StockObserable;

public class MobileNotification implements NotificationObserver{
    private String mobileNumber;
    private StockObserable stockObserable;

    public MobileNotification(String mobileNumber, StockObserable stockObserable) {
        this.mobileNumber = mobileNumber;
        this.stockObserable = stockObserable;
    }

    @Override
    public void update() {
        sendNotification(mobileNumber);
    }

    private void sendNotification(String mobileNumber) {
        System.out.println("Notification has been sent at "+mobileNumber);
    }
}
