package StructuralDesignPatterns.CompositeDesignPattern.Calculator;

public class Expression implements ArithmeticExpression{
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }


    @Override
    public int evaluate() throws Exception {
        System.out.println("Operation: "+operation);
        int value = 0;
        switch (operation){
            case ADD: value = leftExpression.evaluate() + rightExpression.evaluate();
            break;
            case DIVIDE: value = leftExpression.evaluate() / rightExpression.evaluate();
            break;
            case SUBTRACT: value = leftExpression.evaluate() - rightExpression.evaluate();
            break;
            case MULTIPLICATION: value = leftExpression.evaluate() * rightExpression.evaluate();
            break;
            default: throw new Exception("Wrong expression chosen");
        }
        return value;
    }
}
