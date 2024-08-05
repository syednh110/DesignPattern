package behavioraldesignpatterns.chainofresponsibilitydesignpattern.securesystem;

public class RoleCheckMiddleWare extends MiddleWare{
    @Override
    public boolean check(String mail, String password) {
        if(mail.equals("syednh110@gmail.com")){
            System.out.println("Hello Admin!");
            return true;
        }
        System.out.println("Hello User!");
        return checkNext(mail, password);
    }
}
