package com.example.demo.pdf;

//import com.itextpdf.html2pdf.HtmlConverter;
/*import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;*/
import com.itextpdf.html2pdf.HtmlConverter;
/*import com.lowagie.text.DocumentException;
import org.apache.commons.io.FileUtils;
import org.xhtmlrenderer.pdf.ITextRenderer;*/
/*
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class HTMLTOPDFItext {
    public static void main(String[] args) throws IOException {

        String pdfFilePath = "/home/webwerks/reports/result1.pdf";
        String directoryName = "/home/webwerks/reports/";
        File directory = new File(directoryName);
        if (! directory.exists()){
            directory.mkdir();
        }

        String hdfcLogo = "/home/webwerks/hdfc.jpg";
        String fastagLogo = "/home/webwerks/fastag.png";
        String [] array = new String[]{"Date and Time","Date","Transaction ID", "Narration","Transaction Type",
                "Opening Balance", "Amount","Closing Balance","OD","Vehicle Number","Toll Name", "Toll ID"};
        List<String> list = Arrays.asList(array);
        List<List<String>> result = new ArrayList<>();
        result.add(list);
        result.add(list);
        result.add(list);

        StringBuilder stringBuilder = new StringBuilder();

        List<String> txn = result.get(0);
        stringBuilder.append("<html>\n");
        stringBuilder.append("    <head><style>@page {@bottom-right {content: 'Page No.- 'counter(page) \"/\" counter(pages);} @bottom-left {content: 'Generated On-"+new Date()+"'} @bottom-center {content: 'Logged User ID- user'} font-size:13px;} table { page-break-inside:auto } thead { display:table-header-group }");
        stringBuilder.append(" ul li{display: inline-block;width: 50%; padding-bottom: 4px; font-size: 13px}");
        stringBuilder.append("</style></head>");
        stringBuilder.append("    <body style = 'border: 0.5px solid black;'>\n");
        stringBuilder.append("        <div>\n");
        stringBuilder.append("            <img src='").append(hdfcLogo).append("' alt='logo' style='float: left; margin-top:30px; width: 150px; height: 30px;'/>\n");
        stringBuilder.append("        </div>\n");
        stringBuilder.append("        <div style='position:fixed; margin-top:30px; text-align: center; font-size:15px; width:100%;'>\n");
        stringBuilder.append("            <h2>").append("reportName").append("</h2>\n");
        stringBuilder.append("        </div>\n");
        stringBuilder.append("<hr/>");
        stringBuilder.append("        <div>\n");
        stringBuilder.append("          <ul><li><span><b>Customer Name: </b></span> Prithvi Raj</li><li><span><b>Customer ID: </b></span> ").append("userId").append("</li></ul>\n"); //TODO customer name
        stringBuilder.append("          <ul><li><span><b>Mobile No: </b></span>900000030940</li><li><span><b>Wallet ID: </b></span> 1829379</li></ul>\n"); //TODO mobile no and wallet ID
        stringBuilder.append("        </div>\n");
        stringBuilder.append("<hr/>");
        stringBuilder.append("        <div style = 'border: 0.5px solid black; width:90%; margin-top:35px; margin-left:35px;'>\n");
        stringBuilder.append("          <ul><li><span><b> Vehicle Registration Number: </b></span></li><li>").append(txn.get(0)).append("</li></ul>\n");
        stringBuilder.append("          <ul><li><span><b> Transaction Id: </b></span></li><li>").append(txn.get(1)).append("</li></ul>\n");
        stringBuilder.append("          <ul><li><span><b> Plaza Name: </b></span></li><li>").append(txn.get(2)).append("</li></ul>\n");
        stringBuilder.append("          <ul><li><span><b> Transaction Date/Time: </b></span></li><li>").append(txn.get(0)).append("</li></ul>\n");
        stringBuilder.append("          <ul><li><span><b> Transaction Amount: </b></span></li><li>").append(txn.get(0)).append("</li></ul>\n");
        stringBuilder.append("          <ul><li><span><b> Transaction Reference Number: </b></span></li><li>").append(txn.get(0)).append("</li></ul>\n");
        stringBuilder.append("          <ul><li><span><b> Lane ID: </b></span></li><li>").append(txn.get(0)).append("</li></ul>\n");
        stringBuilder.append("          <ul><li><span><b> Lane Direction: </b></span></li><li>").append(txn.get(0)).append("</li></ul>\n");
        stringBuilder.append("        </div>\n");
        stringBuilder.append("    </body>\n");
        stringBuilder.append( "</html>");



        /*stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html lang=\"en\">\n");
        stringBuilder.append("<head><meta charset=\"utf-8\"/>\n");
        stringBuilder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n");
        stringBuilder.append("<link rel=\"stylesheet\" href=\"/home/webwerks/pdf_report/css/bootstrap.min.css\"></link>\n");
        stringBuilder.append("<link rel=\"stylesheet\" href=\"/home/webwerks/pdf_report/css/style.css\"></link>\n");
        stringBuilder.append("<link rel=\"stylesheet\" href=\"/home/webwerks/pdf_report/css/responsive.css\"></link></head>\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("<header>\n");
        stringBuilder.append("  <div class=\"clearfix\"></div>\n");
        stringBuilder.append("</header>\n");
        stringBuilder.append("<section class=\"pt-0\">\n");
        stringBuilder.append("  <div class=\"container\">  \n");
        stringBuilder.append("    <div class=\"whitebx mt-4 transReport\">  \n");
        stringBuilder.append("      <div class=\"transBorder\" >\n");
        stringBuilder.append("        <div class=\"tophead\">\n");
        stringBuilder.append("          <img src=\"/home/webwerks/pdf_report/images/hdfc_logo.jpg\" alt=\"HDFC Bank\" class=\"hdfclogo\"/>\n");
        stringBuilder.append("          <h5 class=\"mb-3\">Transaction Report</h5> \n");
        stringBuilder.append("        </div>\n");
        stringBuilder.append("        <div class=\"secondpart\">\n");
        stringBuilder.append("          <ul><li><span>Customer Name: </span> <b>Prithvi Raj</b></li><li><span>Mobile No: </span> <b>900000030940</b></li></ul>\n");
        stringBuilder.append("          <ul><li><span>From Date: </span> <b>01 Sep 2019</b></li><li><span>Wallet ID: </span>  <b>1829379</b></li></ul>\n");
        stringBuilder.append("        <ul><li><span>To Date: </span><b>16 Dec 20120</b></li></ul>\n");
        stringBuilder.append("          <table class=\"table table-bordered table-striped\">\n");
        stringBuilder.append("            <thead><tr>\n");
        for (String str : result.get(0)){
            stringBuilder.append("<th>");
            stringBuilder.append(str);
            stringBuilder.append("</th>");
        }
        stringBuilder.append("              </tr></thead>\n");
        stringBuilder.append("            <tbody>\n");
        for (int i = 1; i<result.size(); i++){
            stringBuilder.append("<tr>");
            List<String> list1 = result.get(i);
            for (String s : list1) {
                stringBuilder.append("<td>");
                stringBuilder.append(s);
                stringBuilder.append("</td>");
            }
            stringBuilder.append("</tr>");
        }
        stringBuilder.append("   </tbody></table>\n");
        stringBuilder.append("</div> </div></div></div></section></body></html>");*/





        /*stringBuilder.append("<html>\n");
        stringBuilder.append("    <head><style>@page {@bottom-right {content: 'Page No.- 'counter(page) \"/\" counter(pages);} @bottom-left {content: 'Generated On-"+new Date() +"'} @bottom-center {content: 'Logged User ID- userId'} font-size:15px;} table { page-break-inside:auto } thead { display:table-header-group }");
        stringBuilder.append(" ul li{display: inline-block;width: 60%; padding-bottom: 4px; font-size: 13px}");
        stringBuilder.append("</style></head>");
        stringBuilder.append("    <body style = 'border: 0.5px solid black;'>\n");
        stringBuilder.append("        <div>\n");
        stringBuilder.append("            <img src='").append(hdfcLogo).append("' alt='logo' style='float: left; margin-top:25px; width: 150px; height: 30px;'/>\n");
        stringBuilder.append("        </div>\n");
        stringBuilder.append("        <div style='position:fixed; margin-top:25px; text-align: center; font-size:15px; width:100%;'>\n");
        stringBuilder.append("            <h2>").append("report Name").append("</h2>\n");
        stringBuilder.append("        </div>\n");
        stringBuilder.append("<hr/>");
        stringBuilder.append("        <div>\n");
        stringBuilder.append("          <ul><li><span><b>From Date: </b></span>01 Sep 2019</li><li><span><b>To Date: </b></span>16 Dec 20120</li></ul>\n");
        stringBuilder.append("          <ul><li><span><b>Customer Name: </b></span> Prithvi Raj</li><li><span><b>Customer ID: </b></span> 1829379</li></ul>\n");
        stringBuilder.append("          <ul><li><span><b>Mobile No: </b></span>900000030940</li><li><span><b>Wallet ID: </b></span> 1829379</li></ul>\n");
        stringBuilder.append("        </div>\n");
        stringBuilder.append("        <div style='position: fixed; margin-top: 20px; top: 180px; left: 10px; font-size: 10px; width:100%;'>\n");
        stringBuilder.append("            <table style='margin-left: auto; margin-right: auto; width:100%; border: 1px solid #C7C7C7; border-collapse: collapse;'>\n");
        stringBuilder.append("<tr><thead>");
        stringBuilder.append("<th style='padding: 5px; text-align: left; background-color: #a6a6a6; border: 1px solid black; border-collapse: collapse;'>Sr. No</th>");
        for (String str : result.get(0)){
            stringBuilder.append("<th style='padding: 5px; text-align: left; background-color: #a6a6a6; border: 1px solid black; border-collapse: collapse;'>");
            stringBuilder.append(str);
            stringBuilder.append("</th>");
        }
        stringBuilder.append("</thead></tr>");
        for (int i = 1; i<result.size(); i++){
            stringBuilder.append("<tr>");
            stringBuilder.append("<td style='padding: 5px; text-align: left; border: 1px solid #C7C7C7; border-collapse: collapse;'>").append(i).append("</td>");
            List<String> list1 = result.get(i);
            for (String s : list1) {
                stringBuilder.append("<td style='padding: 5px; text-align: left; border: 1px solid #C7C7C7; border-collapse: collapse;'>");
                stringBuilder.append(s);
                stringBuilder.append("</td>");
            }
            stringBuilder.append("</tr>");
        }
        stringBuilder.append("            </table>\n");
        stringBuilder.append("        </div>\n");
        stringBuilder.append("    </body>\n");
        stringBuilder.append( "</html>");*/



        /*String k = "<html>\n" +
                "    <body>\n" +
                "        <div>\n" +
                "            <img src='/home/webwerks/fastag.png' alt='logo' style='float: left; width: 100px; height: 40px; background: #555;'/>\n" +
                "        </div>\n" +
                "        <div>\n" +
                "            <img src='/home/webwerks/hdfc.png' alt='logo' style='float: right; width: 100px; height: 40px; background: #555;'/>\n" +
                "        </div>\n" +
                "        <div style='position: absolute; top: 100px; left: 300px; font-size: 13px;'><h2>Table Title</h2></div>\n" +
                "        <div style='position: absolute; top: 180px; left: 20px; font-size: 13px; width:100%;'>\n" +
                "            <table style='width:100%; border: 1px solid black; border-collapse: collapse;'>\n" +
                "                <tr><th style='padding: 15px; text-align: left; background-color: #d9d9d9; color: black; border: 1px solid black; border-collapse: collapse;'>Firstname</th></tr>\n" +
                "                <tr><td style='padding: 15px; text-align: left; border: 1px solid black; border-collapse: collapse;'></td></tr>\n" +
                "            </table>\n" +
                "        </div>\n" +
                "    </body>\n" +
                "</html>";*/
        OutputStream file = new FileOutputStream(new File(pdfFilePath));
        HtmlConverter.convertToPdf(stringBuilder.toString(), file);
        /*Document document = new Document();
        PdfWriter.getInstance(document, file);
        document.open();
        HTMLWorker htmlWorker = new HTMLWorker(document);
        htmlWorker.parse(new StringReader(stringBuilder.toString()));
        *//*InputStream is = new ByteArrayInputStream(stringBuilder.toString().getBytes());
        XMLWorkerHelper.getInstance().parseXHtml(pdfWriter, document,is);*//*
        document.close();
        file.close();*/
        /*final ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(stringBuilder.toString());
        renderer.layout();
        try (ByteArrayOutputStream fos = new ByteArrayOutputStream(stringBuilder.toString().length())) {
            renderer.createPDF(fos);
            FileUtils.writeByteArrayToFile(new File(pdfFilePath), fos.toByteArray());
        } catch (DocumentException e) {
            e.printStackTrace();
        }*/
    }
}
