package creationaldesignpatterns.singletonpattern.after;

public class EagerSingleton {
    private static final EagerSingleton eagerSingleton = new EagerSingleton();
    private EagerSingleton() {
    }

    public static synchronized EagerSingleton getInstance(){
        return  eagerSingleton;
    }
}
