package BehavioralDesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem;

public class ErrorLog extends Logging {
    public ErrorLog(Logging logging) {
        super(logging);
    }

    @Override
    public void log(String type) {
        if(type.equals("ERROR")){
            System.out.println("There is some ERROR messages !");
        }
        else{
            super.log(type);
        }
    }
}
