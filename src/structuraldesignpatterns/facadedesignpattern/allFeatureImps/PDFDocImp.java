package structuraldesignpatterns.facadedesignpattern.allFeatureImps;

import structuraldesignpatterns.facadedesignpattern.allFeature.PDFDoc;

public class PDFDocImp implements PDFDoc {
    @Override
    public void processPDFDoc() {
        System.out.println("PDF Document is printing !");
    }
}
