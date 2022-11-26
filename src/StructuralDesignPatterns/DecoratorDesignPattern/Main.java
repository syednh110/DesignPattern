package StructuralDesignPatterns.DecoratorDesignPattern;

import StructuralDesignPatterns.DecoratorDesignPattern.Base.BasePizza;
import StructuralDesignPatterns.DecoratorDesignPattern.Base.FarmHouse;
import StructuralDesignPatterns.DecoratorDesignPattern.Base.Magerita;
import StructuralDesignPatterns.DecoratorDesignPattern.Topping.ExtraChessTopping;
import StructuralDesignPatterns.DecoratorDesignPattern.Topping.MushroomTopping;

public class Main {

    public static void main(String[] args) {
        BasePizza pizza = new ExtraChessTopping(new FarmHouse());
        System.out.println(pizza.cost());

        pizza = new MushroomTopping(new Magerita());
        System.out.println(pizza.cost());

    }
}
