package structuraldesignpatterns.facadedesignpattern;


//Facade is a structural design pattern that provides a simplified interface to a library,
// a framework, or any other complex set of classes.

import structuraldesignpatterns.facadedesignpattern.allFeature.HtmlDoc;
import structuraldesignpatterns.facadedesignpattern.allFeature.PDFDoc;
import structuraldesignpatterns.facadedesignpattern.allFeature.WordDoc;
import structuraldesignpatterns.facadedesignpattern.allFeatureImps.HtmlDocImp;
import structuraldesignpatterns.facadedesignpattern.allFeatureImps.PDFDocImp;
import structuraldesignpatterns.facadedesignpattern.allFeatureImps.WordDocImp;

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
