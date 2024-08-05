package structuraldesignpatterns.decoratordesignpattern;

import structuraldesignpatterns.decoratordesignpattern.base.BasePizza;
import structuraldesignpatterns.decoratordesignpattern.base.FarmHouse;
import structuraldesignpatterns.decoratordesignpattern.base.Magerita;
import structuraldesignpatterns.decoratordesignpattern.topping.ExtraChessTopping;
import structuraldesignpatterns.decoratordesignpattern.topping.MushroomTopping;

public class Main {

    public static void main(String[] args) {
        BasePizza pizza = new ExtraChessTopping(new FarmHouse());
        System.out.println(pizza.cost());

        pizza = new MushroomTopping(new Magerita());
        System.out.println(pizza.cost());

    }
}
