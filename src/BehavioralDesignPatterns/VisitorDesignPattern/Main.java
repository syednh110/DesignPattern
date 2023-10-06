package BehavioralDesignPatterns.VisitorDesignPattern;

import BehavioralDesignPatterns.VisitorDesignPattern.Visitable.Liquor;
import BehavioralDesignPatterns.VisitorDesignPattern.Visitable.Necessity;
import BehavioralDesignPatterns.VisitorDesignPattern.Visitable.Tobacco;
import BehavioralDesignPatterns.VisitorDesignPattern.Visitor.TaxVisitor;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();

        Necessity necessity = new Necessity(50);
        Liquor liquor = new Liquor(70);
        Tobacco tobacco = new Tobacco(80);

        System.out.println(necessity.accept(taxVisitor));
        System.out.println(liquor.accept(taxVisitor));
        System.out.println(tobacco.accept(taxVisitor));
        List<Integer> array = new LinkedList<>();
        Set<Integer> set = new TreeSet<>();
        Set<Integer> linkset = new LinkedHashSet<>();



    }
}
