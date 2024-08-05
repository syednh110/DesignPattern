package structuraldesignpatterns.decoratordesignpattern.topping;

import structuraldesignpatterns.decoratordesignpattern.base.BasePizza;

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
