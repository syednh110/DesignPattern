package behavioraldesignpatterns.visitordesignpattern.Visitable;

import behavioraldesignpatterns.visitordesignpattern.Visitor.Visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
