package StructuralDesignPatterns.FacadeDesignPattern;

import StructuralDesignPatterns.FacadeDesignPattern.AllFeature.HtmlDoc;
import StructuralDesignPatterns.FacadeDesignPattern.AllFeature.PDFDoc;
import StructuralDesignPatterns.FacadeDesignPattern.AllFeature.WordDoc;
import StructuralDesignPatterns.FacadeDesignPattern.AllFeatureImps.HtmlDocImp;
import StructuralDesignPatterns.FacadeDesignPattern.AllFeatureImps.PDFDocImp;
import StructuralDesignPatterns.FacadeDesignPattern.AllFeatureImps.WordDocImp;

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
