package BehavioralDesignPatterns.ChainOfResponsibilityDesignPattern.SecureSystem;

/**
 * ConcreteHandler. Checks whether there are too many failed login requests.
 */
public class ThrottlingMiddleWire extends MiddleWare{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleWire(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String mail, String password) {
        if (System.currentTimeMillis() > currentTime + 60000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return checkNext(mail, password);
    }
}
