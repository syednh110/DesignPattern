package StructuralDesignPatterns.DecoratorDesignPattern.Topping;

import StructuralDesignPatterns.DecoratorDesignPattern.Base.BasePizza;

public class ExtraChessTopping extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraChessTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public double cost() {
        return this.basePizza.cost() + 15;
    }
}
