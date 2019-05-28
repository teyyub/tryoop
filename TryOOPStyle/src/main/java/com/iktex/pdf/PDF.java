package com.iktex.pdf;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.io.IOException;

/**
 *
 * @author teyyub , 3:13:54 PM
 */
public class PDF {

    private String name = "C:/test/AnimalFarm.pdf";
    private PdfReader pdfReader;
    private String pageContent;

    public PDF(String fileName) throws IOException {
        pdfReader = new PdfReader(fileName);
    }

    public PDF() throws IOException {
        pdfReader = new PdfReader(name);
    }

    public String text() throws IOException {
        int pages = pdfReader.getNumberOfPages();
        for (int i = 1; i <= pages; i++) {
            //Extract the page content using PdfTextExtractor.
            pageContent = PdfTextExtractor.getTextFromPage(pdfReader, i);

            //Print the page content on console.
//            System.out.println("Content on Page " + i + ": " + pageContent);
        }

        //Close the PdfReader.
        pdfReader.close();
        return pageContent;
    }
}
