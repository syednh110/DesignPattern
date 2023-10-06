package BehavioralDesignPatterns.VisitorDesignPattern.Visitor;

import BehavioralDesignPatterns.VisitorDesignPattern.Visitable.Liquor;
import BehavioralDesignPatterns.VisitorDesignPattern.Visitable.Necessity;
import BehavioralDesignPatterns.VisitorDesignPattern.Visitable.Tobacco;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    @Override
    public double visit(Liquor liquor) {
        System.out.println("Liquid Item: Price with Tax");
        return Double.parseDouble(decimalFormat.format(liquor.getPrice()*.18+ liquor.getPrice()));
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity Item: Price with Tax");
        return Double.parseDouble(decimalFormat.format(necessity.getPrice()));
    }

    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(decimalFormat.format(tobacco.getPrice()*.32+ tobacco.getPrice()));
    }
}
