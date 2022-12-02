package BehavioralDesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem;

import BehavioralDesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem.Logging;

public class InfoLog extends Logging {

    public InfoLog(Logging logging) {
        super(logging);
    }

    @Override
    public void log(String type) {
        if(type.equals("INFO")){
            System.out.println("There is some INFO Messages");
        }
        else{
            super.log(type);
        }
    }
}
