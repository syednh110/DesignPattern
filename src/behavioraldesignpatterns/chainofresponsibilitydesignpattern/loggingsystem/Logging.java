package behavioraldesignpatterns.chainofresponsibilitydesignpattern.loggingsystem;

public abstract class Logging {
    private Logging nextlogging;
    public Logging(Logging nextlogging){
        this.nextlogging = nextlogging;
    }

    public void log(String type){
        if(nextlogging!=null){
            nextlogging.log(type);
        }
    }
}
