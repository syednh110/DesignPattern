package StructuralDesignPatterns.FacadeDesignPattern;


//Facade is a structural design pattern that provides a simplified interface to a library,
// a framework, or any other complex set of classes.

import StructuralDesignPatterns.FacadeDesignPattern.AllFeature.HtmlDoc;
import StructuralDesignPatterns.FacadeDesignPattern.AllFeature.PDFDoc;
import StructuralDesignPatterns.FacadeDesignPattern.AllFeature.WordDoc;
import StructuralDesignPatterns.FacadeDesignPattern.AllFeatureImps.HtmlDocImp;
import StructuralDesignPatterns.FacadeDesignPattern.AllFeatureImps.PDFDocImp;
import StructuralDesignPatterns.FacadeDesignPattern.AllFeatureImps.WordDocImp;

public class Client {

    public static void main(String[] args) {
        HtmlDoc htmlDoc = new HtmlDocImp();
        htmlDoc.processHtmlDoc();

        WordDoc wordDoc = new WordDocImp();
        wordDoc.processWordDoc();

        PDFDoc pdfDoc = new PDFDocImp();
        pdfDoc.processPDFDoc();

        ///-------After facade Pattern

        FacadeProcess facadeProcess = new FacadeProcess();
        facadeProcess.getHtmlDoc();
        facadeProcess.getPdfDoc();
        facadeProcess.getWordDoc();
    }
}
