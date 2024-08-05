package structuraldesignpatterns.proxydesignpattern;

public class ExpensiveOperationProxy {

    ExpensiveOperation expensiveOperation;

    public void operation(){
        if(expensiveOperation == null){
            this.expensiveOperation = new ExpensiveOperation();
        }
        expensiveOperation.operation();
    }
}
