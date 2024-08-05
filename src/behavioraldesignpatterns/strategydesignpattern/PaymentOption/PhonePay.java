package behavioraldesignpatterns.strategydesignpattern.PaymentOption;

public class PhonePay implements Payment{
    private  String upi;

    public PhonePay(String upi) {
        this.upi = upi;
    }

    @Override
    public void doPayment(Double amount) {
        System.out.println(amount + " is paid using Phonepay");
    }
}
