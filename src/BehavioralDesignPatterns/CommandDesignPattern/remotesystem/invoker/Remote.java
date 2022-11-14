package BehavioralDesignPatterns.CommandDesignPattern.remotesystem.invoker;

import BehavioralDesignPatterns.CommandDesignPattern.remotesystem.command.Command;

public class Remote {
    Command command;

    public Remote(Command command) {
        this.command = command;
    }

    public void process(){
        command.execute();
    }
}
