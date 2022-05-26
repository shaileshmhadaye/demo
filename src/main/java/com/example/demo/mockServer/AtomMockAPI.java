package com.example.demo.mockServer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class AtomMockAPI {
    @PostMapping("/verificationURLATOM")
    public String getResponse(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter out = response.getWriter();
        try {
            String resp = "<VerifyOutput MerchantID=\"119651\" MerchantTxnID=\"1012123308440048786\"" +
                    " AMT=\"1500.00\" VERIFIED=\"NODATA\" BID=\"\" bankname=\"null\" atomtxnId=\"null\" " +
                    "discriminator=\"null\" surcharge=\"null\" CardNumber=\"\" TxnDate=\"null\" " +
                    "UDF9=\"null\" reconstatus=\"null\" sdt=\"null\" />";
            out.print(resp);
        } catch (Exception e) {
            System.out.println("error-"+e.getMessage());
        }

        out.flush();
        out.close();
        return null;
    }
}
