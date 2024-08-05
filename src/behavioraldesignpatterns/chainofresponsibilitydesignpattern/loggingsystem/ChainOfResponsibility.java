package behavioraldesignpatterns.chainofresponsibilitydesignpattern.loggingsystem;

public class ChainOfResponsibility {

    public static void main(String[] args) {
        Logging logmessages = new InfoLog(new DebugLog(new ErrorLog(null)));

        logmessages.log("ERROR");
    }

}
