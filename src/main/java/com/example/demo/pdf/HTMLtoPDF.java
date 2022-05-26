package com.example.demo.pdf;

//import com.pdfcrowd.Pdfcrowd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HTMLtoPDF {
    public static void main(String[] args) {

        String pdfFilePath = "/home/webwerks/result.pdf";
        String hdfcLogo = "/home/webwerks/hdfc.png";
        String fastagLogo = "/home/webwerks/fastag.png";
        String [] array = new String[]{"Date and Time","Date","Transaction ID", "Narration","Transaction Type",
                "Opening Balance", "Amount","Closing Balance","OD","Vehicle Number","Toll Name", "Toll ID"};
        List<String> list = Arrays.asList(array);
        List<List<String>> result = new ArrayList<>();
        result.add(list);

        /*try {
            // create the API client instance
            Pdfcrowd.HtmlToPdfClient client =
                    new Pdfcrowd.HtmlToPdfClient("demo", "ce544b6ea52a5621fb9d55f8b542d14d");

            // run the conversion and write the result to a file
            client.setAuthor("Pdfcrowd");
            client.setTitle("Hello");
            client.setSubject("Demo");
            client.setKeywords("Pdfcrowd,demo");
            client.setPageWatermark("/home/webwerks/fleetPdfTest.pdf");
            client.setNoBackground(true);

            StringBuilder sb = new StringBuilder();
            sb.append("<html>");
            sb.append("<head>");
            sb.append("<style>\n" +
                    "            .left-header img {\n" +
                    "                float: left;\n" +
                    "                width: 210px;\n" +
                    "                height: 90px;\n" +
                    "                background: #555;\n" +
                    "            }\n" +
                    "            .right-header img {\n" +
                    "                float: right;\n" +
                    "                width: 240px;\n" +
                    "                height: 90px;\n" +
                    "                background: #555;\n" +
                    "            }\n" +
                    "            .title {\n" +
                    "                position: absolute;\n" +
                    "                top: 100px;\n" +
                    "                left: 500px;\n" +
                    "                font-size: 18px;\n" +
                    "            }\n" +
                    "            .container {\n" +
                    "                position: absolute;\n" +
                    "                top: 180px;\n" +
                    "                left: 60px;\n" +
                    "                font-size: 18px;\n" +
                    "                width:85%;\n" +
                    "            }\n" +
                    "            table {\n" +
                    "                width:100%;\n" +
                    "            }\n" +
                    "            table, th, td {\n" +
                    "                border: 1px solid black;\n" +
                    "                border-collapse: collapse;\n" +
                    "            }\n" +
                    "            th, td {\n" +
                    "                padding: 15px;\n" +
                    "                text-align: left;\n" +
                    "            }\n" +
                    "            th {\n" +
                    "                background-color: #d9d9d9;\n" +
                    "                color: black;\n" +
                    "            }\n" +
                                 *//*"#watermark {\n" +
                    "                color: #d0d0d0;\n" +
                    "                font-size: 200pt;\n" +
                    "                -webkit-transform: rotate(-45deg);\n" +
                    "                -moz-transform: rotate(-45deg);\n" +
                    "                position: absolute;\n" +
                    "                width: 100%;\n" +
                    "                height: 100%;\n" +
                    "                margin: 0;\n" +
                    "                z-index: -1;\n" +
                    "                left:-100px;\n" +
                    "                top:-200px;\n" +
                    "            }"+*//*
                    "        </style>");
            sb.append("</head>");
            sb.append("<body>");
            *//*sb.append("<div id=\"watermark\">");
            sb.append("<p>HDFC</p>");
            sb.append("</div>");*//*
            sb.append("<div class=\"left-header\">");
            sb.append("<img src=\"").append(hdfcLogo).append("\" alt=\"logo\" />");
            sb.append("</div>");
            sb.append("<div class=\"right-header\">");
            sb.append("<img src=\"").append(fastagLogo).append("\" alt=\"logo\" />");
            sb.append("</div>");
            sb.append("<div class=\"title\"><h2>Table Title</h2></div>");
            sb.append("<div class=\"container\">");
            sb.append("<table>");
            sb.append("<tr>");
            for (String str : result.get(0)){
                sb.append("<th>");
                sb.append(str);
                sb.append("</th>");
            }
            sb.append("</tr>");
            for (List<String> list1 : result){
                sb.append("<tr>");
                for (String string : list1){
                    sb.append("<td>");
                    sb.append(string);
                    sb.append("</td>");
                }
                sb.append("</tr>");
            }
            sb.append("</table>");
            sb.append("</div>");
            sb.append("</body>");
            sb.append("</html>");
            client.convertStringToFile(sb.toString(), pdfFilePath);
        }
        catch(Exception e) {
            e.printStackTrace();
        }*/
    }
}
