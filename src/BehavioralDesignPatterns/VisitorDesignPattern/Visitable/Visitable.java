package BehavioralDesignPatterns.VisitorDesignPattern.Visitable;

import BehavioralDesignPatterns.VisitorDesignPattern.Visitor.Visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
