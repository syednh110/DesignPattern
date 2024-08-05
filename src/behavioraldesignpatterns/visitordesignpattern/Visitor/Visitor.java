package behavioraldesignpatterns.visitordesignpattern.Visitor;

import behavioraldesignpatterns.visitordesignpattern.Visitable.Liquor;
import behavioraldesignpatterns.visitordesignpattern.Visitable.Necessity;
import behavioraldesignpatterns.visitordesignpattern.Visitable.Tobacco;

public interface Visitor {
    double visit(Liquor liquor);
    double visit(Necessity necessity);
    double visit(Tobacco tobacco);
}
