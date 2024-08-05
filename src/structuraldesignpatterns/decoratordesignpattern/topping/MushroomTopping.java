package structuraldesignpatterns.decoratordesignpattern.topping;

import structuraldesignpatterns.decoratordesignpattern.base.BasePizza;

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
