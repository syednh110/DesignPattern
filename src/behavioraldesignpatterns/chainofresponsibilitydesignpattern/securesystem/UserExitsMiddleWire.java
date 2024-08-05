package behavioraldesignpatterns.chainofresponsibilitydesignpattern.securesystem;

/**
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 */
public class UserExitsMiddleWire extends MiddleWare{
    private Server server;

    public UserExitsMiddleWire(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String mail, String password) {
        if(!server.hasEmail(mail)){
            System.out.println("User is not registered!");
            return false;
        }
        if(!server.isValidPassword(mail, password)){
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(mail, password);
    }
}
