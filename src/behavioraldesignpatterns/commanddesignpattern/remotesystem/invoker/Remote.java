package behavioraldesignpatterns.commanddesignpattern.remotesystem.invoker;

import behavioraldesignpatterns.commanddesignpattern.remotesystem.command.Command;

public class Remote {
    Command command;

    public Remote(Command command) {
        this.command = command;
    }

    public void process(){
        command.execute();
    }
}
