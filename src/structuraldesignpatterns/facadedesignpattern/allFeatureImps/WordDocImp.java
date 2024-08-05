package structuraldesignpatterns.facadedesignpattern.allFeatureImps;

import structuraldesignpatterns.facadedesignpattern.allFeature.WordDoc;

public class WordDocImp implements WordDoc {
    @Override
    public void processWordDoc() {
        System.out.println("Word Doc is printing !");
    }
}
