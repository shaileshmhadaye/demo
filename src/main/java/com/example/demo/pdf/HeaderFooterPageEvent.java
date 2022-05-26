package com.example.demo.pdf;
/*
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfWriter;*/

import java.io.IOException;

/*public class HeaderFooterPageEvent extends PdfPageEventHelper {

    public void onStartPage(PdfWriter writer, Document document) {
        String hdfcimg = "/home/webwerks/hdfc.png";
        String fastagimg = "/home/webwerks/fastag.png";
        Image image;
        Image fastagimage;
        try {
            fastagimage = Image.getInstance(fastagimg);
            fastagimage.setAlignment(Element.ALIGN_RIGHT);
            fastagimage.setAbsolutePosition(20, 800);
            fastagimage.scalePercent(15.6f, 15.6f);
            writer.getDirectContent().addImage(fastagimage, true);

            image = Image.getInstance(hdfcimg);
            image.setAlignment(Element.ALIGN_RIGHT);
            image.setAbsolutePosition(450, 800);
            image.scalePercent(3.2f, 3.2f);
            writer.getDirectContent().addImage(image, true);

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(""), 30, 800, 0);
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(""), 550, 800, 0);
    }

    public void onEndPage(PdfWriter writer, Document document) {
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("http://www.xxxx-your_example.com/"), 110, 30, 0);
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("page " + document.getPageNumber()), 550, 30, 0);
    }

}*/
