package StructuralDesignPatterns.FacadeDesignPattern.AllFeatureImps;

import StructuralDesignPatterns.FacadeDesignPattern.AllFeature.WordDoc;

public class WordDocImp implements WordDoc {
    @Override
    public void processWordDoc() {
        System.out.println("Word Doc is printing !");
    }
}
