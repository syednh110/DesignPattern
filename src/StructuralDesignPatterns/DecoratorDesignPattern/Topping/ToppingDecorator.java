package StructuralDesignPatterns.DecoratorDesignPattern.Topping;

import StructuralDesignPatterns.DecoratorDesignPattern.Base.BasePizza;

public abstract class ToppingDecorator extends BasePizza {

    public abstract double cost();
}
