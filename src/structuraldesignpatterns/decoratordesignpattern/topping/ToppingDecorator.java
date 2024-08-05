package structuraldesignpatterns.decoratordesignpattern.topping;

import structuraldesignpatterns.decoratordesignpattern.base.BasePizza;

public abstract class ToppingDecorator extends BasePizza {

    public abstract double cost();
}
