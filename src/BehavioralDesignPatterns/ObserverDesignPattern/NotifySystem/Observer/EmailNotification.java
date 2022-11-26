package BehavioralDesignPatterns.ObserverDesignPattern.NotifySystem.Observer;

import BehavioralDesignPatterns.ObserverDesignPattern.NotifySystem.Obserable.StockObserable;

public class EmailNotification implements NotificationObserver{
    private StockObserable stockObserable;
    private String email;

    public EmailNotification(StockObserable stockObserable, String email) {
        this.stockObserable = stockObserable;
        this.email = email;
    }

    @Override
    public void update() {
        sendMail(email);
    }

    private void sendMail(String email) {
        System.out.println("Mail has been sent at "+ email);
    }
}
