package BehavioralDesignPatterns.ChainOfResponsibilityDesignPattern.SecureSystem;

/**
 *  Basic validation interface
 */
public abstract class MiddleWare {
    private MiddleWare next;
    /**
     * Builds chains of middleware objects.
     */
    public static MiddleWare link(MiddleWare first, MiddleWare... chain){
        MiddleWare head = first;
        for(MiddleWare middleWare: chain){
            head.next = middleWare;
            head = middleWare;
        }
        return first;
    }
    /**
     * Subclasses will implement this method with concrete checks.
     */
    public abstract boolean check(String mail,String password);

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    public boolean checkNext(String mail,String password){
        if(next==null)
            return true;
        return next.check(mail, password);
    }
}
