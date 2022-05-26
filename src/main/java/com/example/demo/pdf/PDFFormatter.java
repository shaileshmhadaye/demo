package com.example.demo.pdf;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.events.PdfDocumentEvent;*/

public class PDFFormatter {

    public static void main(String[] args) {

        String path = "/home/webwerks/fleetPdfTest.pdf";

        String [] array = new String[]{"Date and Time","Date","Transaction ID", "Narration","Transaction Type",
                "Opening Balance", "Amount","Closing Balance","OD","Vehicle Number","Toll Name", "Toll ID"};
        List<String> list = Arrays.asList(array);
        List<List<String>> result = new ArrayList<>();
        result.add(list);

        /*try {
            PdfWriter pdfWriter = new PdfWriter(path);
            PdfDocument pdfDoc = new PdfDocument(pdfWriter);

            Document document = new Document(pdfDoc, new PageSize(595, 842));
            //HeaderFooterPageEvent event = new HeaderFooterPageEvent();

            System.out.println("Done");
            //ImageData data = ImageDataFactory.create("C:/home/hdfcfastag.jpeg");


            String imgPath = "/images";
            System.out.println("imgPath:::" + imgPath);

            String absoluteImgPath = ""*//*getServletContext().getRealPath(imgPath)*//*;
            System.out.println("absoluteImgPath:::" + absoluteImgPath);
            absoluteImgPath = "/home/webwerks/hdfc.png";
            String imagepath = "/home/webwerks/fastag.png";

            System.out.println("absoluteImgPath:::" + absoluteImgPath);
            ImageData data = ImageDataFactory.create(absoluteImgPath);
            Image image = new Image(data);
            image.scaleToFit(110,60);
            ImageData fastagdata = ImageDataFactory.create(imagepath);
            Image fastag = new Image(fastagdata);
            fastag.scaleToFit(110, 60);
            // Image image1 = new Image(data1);
            image.setHorizontalAlignment(HorizontalAlignment.RIGHT);
            fastag.setHorizontalAlignment(HorizontalAlignment.LEFT);
            // image.addStyle(new Style().setMargins(10, 10, 8, 10));
            ImageBackgroundHelper handler = new ImageBackgroundHelper(image);
            ImageBackgroundHelper fhandler = new ImageBackgroundHelper(fastag);
            pdfDoc.addEventHandler(PdfDocumentEvent.END_PAGE, handler);
            pdfDoc.addEventHandler(PdfDocumentEvent.END_PAGE, fhandler);

            // Adding image to the document
            // document.add(image);

            // document.setMargins(0, 0, 0, 0);


            Table table = new Table(result.get(0).size()).useAllAvailableWidth();
            table.setWidth(100);
            table.setWidth(UnitValue.PERCENT);
            table.addStyle(new Style().setMargins(25, 10, 10, 10));
            // table.addStyle(new Style().setPaddings(15, 0, 0, 0));
            table.setHorizontalAlignment(HorizontalAlignment.CENTER);

            System.out.println("Done");

            for (int i = 0; i < result.size(); i++) {
                List<String> tabledata1 = result.get(i);

                for (int j = 0; j < tabledata1.size(); j++) {


                    //GrayColor gray = new GrayColor(someFloatBetweenZeroAndOneInclusive); // no alpha

                    table.addCell(tabledata1.get(j));

                    table.getCell(0, j).setBackgroundColor(ColorConstants.LIGHT_GRAY);
                    table.getCell(i, j).setWidth(5);
                    table.getCell(i, j).setWidth(UnitValue.PERCENT);

                    // Cell cell = table.getCell(i, j); cell.setWidth(5);
                    // cell.setWidth(UnitValue.PERCENT); kar check

                }

                // table data font size
                table.setFontSize(9);

            }

            document.add(table);

            document.close();
            // writer.close();

            System.out.println("Done");

            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }*/
    }
}
