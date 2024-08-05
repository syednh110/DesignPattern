package structuraldesignpatterns.facadedesignpattern;

import structuraldesignpatterns.facadedesignpattern.allFeature.HtmlDoc;
import structuraldesignpatterns.facadedesignpattern.allFeature.PDFDoc;
import structuraldesignpatterns.facadedesignpattern.allFeature.WordDoc;
import structuraldesignpatterns.facadedesignpattern.allFeatureImps.HtmlDocImp;
import structuraldesignpatterns.facadedesignpattern.allFeatureImps.PDFDocImp;
import structuraldesignpatterns.facadedesignpattern.allFeatureImps.WordDocImp;

public class FacadeProcess {
    HtmlDoc htmlDoc;
    PDFDoc pdfDoc;
    WordDoc wordDoc;

    public FacadeProcess() {
        this.htmlDoc = new HtmlDocImp();
        this.pdfDoc = new PDFDocImp();
        this.wordDoc = new WordDocImp();
    }

    public void getHtmlDoc(){
        htmlDoc.processHtmlDoc();
    }

    public void getPdfDoc(){
        pdfDoc.processPDFDoc();
    }

    public void getWordDoc(){
        wordDoc.processWordDoc();
    }
}
