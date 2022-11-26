package StructuralDesignPatterns.DecoratorDesignPattern.Base;

import StructuralDesignPatterns.DecoratorDesignPattern.Base.BasePizza;

public class FarmHouse extends BasePizza {
    @Override
    public double cost() {
        return 120;
    }
}
