package structuraldesignpatterns.compositedesignpattern.calculator;

public class Main {
    public static void main(String[] args) throws Exception{
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression seven = new Number(7);
        ArithmeticExpression five = new Number(5);
        ArithmeticExpression expression = new Expression(two,seven,Operation.ADD);
        System.out.println(expression.evaluate());
        ArithmeticExpression parentExpression = new Expression(five,expression,Operation.MULTIPLICATION);
        System.out.println(parentExpression.evaluate());


    }
}
