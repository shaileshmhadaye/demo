package com.example.demo;

public class ValidationUtil {
    public static final String amountRegex = "^\\d+(\\.\\d{1,2})?$";
    public static final String alphabetRegex = "^[A-Za-z ]+$";
    public static final String alphaNumericRegex = "^[a-zA-Z0-9]*$";
    public static final String numericRegex = "^[0-9]*$";
    public static final String alphabetsWithSplChars = "^[ a-zA-Z0-9_=]*$";

    public static Boolean validateAmount(String amount){
        return amount.matches(amountRegex);
    }

    public static Boolean validateOnlyAlphabets(String var){
        return var.matches(alphabetRegex);
    }

    public static Boolean validateAlphaNumeric(String var){
        return var.matches(alphaNumericRegex);
    }

    public static Boolean validateNumeric(String var){
        return var.matches(numericRegex);
    }

    public static Boolean validateAlphaNumWithSplChars(String var){
        return var.matches(alphabetsWithSplChars);
    }
}
