package BehavioralDesignPatterns.StrategyDesignPattern.PaymentOption;

public class DebitCard implements Payment{

    private String cardNumber;
    private Integer cvv;
    private Integer expiry;

    public DebitCard(String cardNumber, Integer cvv, Integer expiry) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiry = expiry;
    }

    @Override
    public void doPayment(Double amount) {
        System.out.println(amount + "is paid using Debit Card");
    }
}
