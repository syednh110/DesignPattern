package StructuralDesignPatterns.FacadeDesignPattern.AllFeatureImps;

import StructuralDesignPatterns.FacadeDesignPattern.AllFeature.HtmlDoc;

public class HtmlDocImp implements HtmlDoc {
    @Override
    public void processHtmlDoc() {
        System.out.println("Html Doc is printing !");
    }
}
