package BehavioralDesignPatterns.VisitorDesignPattern.Visitor;

import BehavioralDesignPatterns.VisitorDesignPattern.Visitable.Liquor;
import BehavioralDesignPatterns.VisitorDesignPattern.Visitable.Necessity;
import BehavioralDesignPatterns.VisitorDesignPattern.Visitable.Tobacco;

public interface Visitor {
    double visit(Liquor liquor);
    double visit(Necessity necessity);
    double visit(Tobacco tobacco);
}
