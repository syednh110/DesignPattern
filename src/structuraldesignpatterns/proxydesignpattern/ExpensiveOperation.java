package structuraldesignpatterns.proxydesignpattern;

public class ExpensiveOperation {
    public ExpensiveOperation() {
        System.out.println("Creating Expensive Operation !");
    }

    public void operation(){
        System.out.println("Fetching Expensive Operation data !");
    }
}
