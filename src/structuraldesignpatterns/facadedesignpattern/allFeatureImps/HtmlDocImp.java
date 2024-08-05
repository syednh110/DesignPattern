package structuraldesignpatterns.facadedesignpattern.allFeatureImps;

import structuraldesignpatterns.facadedesignpattern.allFeature.HtmlDoc;

public class HtmlDocImp implements HtmlDoc {
    @Override
    public void processHtmlDoc() {
        System.out.println("Html Doc is printing !");
    }
}
