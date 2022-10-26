package BehavioralDesignPatterns.ChainOfResponsibilityDesignPattern;

public class DebugLog extends Logging{
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
