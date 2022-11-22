package StructuralDesignPatterns.ProxyDesignPattern;

public class Main {

    public static void main(String[] args) {
        ExpensiveOperationProxy expensiveOperationProxy = new ExpensiveOperationProxy();

        expensiveOperationProxy.operation();
        expensiveOperationProxy.operation();

        expensiveOperationProxy.operation();
    }
}
