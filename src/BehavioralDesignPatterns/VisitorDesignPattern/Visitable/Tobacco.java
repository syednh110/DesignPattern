package BehavioralDesignPatterns.VisitorDesignPattern.Visitable;

import BehavioralDesignPatterns.VisitorDesignPattern.Visitor.Visitor;

public class Tobacco implements Visitable{
    private double price;

    public Tobacco(double price) {
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
