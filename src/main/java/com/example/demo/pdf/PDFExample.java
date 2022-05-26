package com.example.demo.pdf;

/*import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.layout.property.UnitValue;*/
/*import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PDFExample {

    public static void main(String[] args) {
        String path = "/home/webwerks/fleetPdfTest.pdf";

        String [] array = new String[]{"Date and Time","Date","Transaction ID", "Narration","Transaction Type",
                "Opening Balance", "Amount","Closing Balance","OD","Vehicle Number","Toll Name", "Toll ID"};
        java.util.List<String> list = Arrays.asList(array);
        List<List<String>> result = new ArrayList<>();
        result.add(list);

        /*try {
            Document document = new Document(PageSize.A4);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(path));
            HeaderFooterPageEvent event = new HeaderFooterPageEvent();
            writer.setPageEvent(event);
            document.open();
            document.addCreator("creator");
            document.addAuthor("author");
            document.addTitle("title");

            Paragraph paragraph = new Paragraph(
                    " ",new Font(Font.FontFamily.HELVETICA, 18));
            document.add(paragraph);
            document.add(Chunk.NEWLINE);

            PdfPTable table = new PdfPTable(result.get(0).size());
            table.setWidthPercentage(100);

            for (int i = 0; i < result.size(); i++) {
                List<String> tabledata1 = result.get(i);

                for (int j = 0; j < tabledata1.size(); j++) {
                    PdfPCell cell = new PdfPCell(new Phrase(tabledata1.get(j), new Font(Font.FontFamily.HELVETICA, 9)));
                    cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    table.addCell(cell);
                }

            }
            document.add(table);
            document.close();
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}
