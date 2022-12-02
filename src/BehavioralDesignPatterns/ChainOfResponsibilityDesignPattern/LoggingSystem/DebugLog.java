package BehavioralDesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem;

import BehavioralDesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem.Logging;

public class DebugLog extends Logging {
    public DebugLog(Logging logging){
        super(logging);
    }
    @Override
    public void log(String type) {
        if(type.equals("DEBUG")){
            System.out.println("There is something DEBUG messages!");
        }
        else{
            super.log(type);
        }
    }
}
