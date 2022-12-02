package BehavioralDesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem;

public class ChainOfResponsibility {

    public static void main(String[] args) {
        Logging logmessages = new InfoLog(new DebugLog(new ErrorLog(null)));

        logmessages.log("ERROR");
    }

}
