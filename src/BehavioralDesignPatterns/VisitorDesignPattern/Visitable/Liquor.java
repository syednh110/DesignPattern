package BehavioralDesignPatterns.VisitorDesignPattern.Visitable;

import BehavioralDesignPatterns.VisitorDesignPattern.Visitor.Visitor;

public class Liquor implements Visitable{
    private double price;

    public Liquor(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
