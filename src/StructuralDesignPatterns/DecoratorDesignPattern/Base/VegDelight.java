package StructuralDesignPatterns.DecoratorDesignPattern.Base;

import StructuralDesignPatterns.DecoratorDesignPattern.Base.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public double cost() {
        return 100;
    }
}
