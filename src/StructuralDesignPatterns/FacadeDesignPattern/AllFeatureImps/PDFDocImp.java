package StructuralDesignPatterns.FacadeDesignPattern.AllFeatureImps;

import StructuralDesignPatterns.FacadeDesignPattern.AllFeature.PDFDoc;

public class PDFDocImp implements PDFDoc {
    @Override
    public void processPDFDoc() {
        System.out.println("PDF Document is printing !");
    }
}
