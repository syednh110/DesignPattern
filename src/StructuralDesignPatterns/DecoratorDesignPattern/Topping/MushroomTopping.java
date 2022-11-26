package StructuralDesignPatterns.DecoratorDesignPattern.Topping;

import StructuralDesignPatterns.DecoratorDesignPattern.Base.BasePizza;

public class MushroomTopping extends ToppingDecorator{
    BasePizza basePizza;

    public MushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public double cost() {
        return this.basePizza.cost() + 20.0;
    }
}
