package com.example.demo.hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestBigDecimal {
    public static void main(String[] args) {
        //Input
        int n = 9;
        String[] s = new String[]{"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
        //Write your code here
        String temp;
        for (int i = 0; i < n; i++) {
            BigDecimal a = new BigDecimal(s[i]);
            Arrays.stream(s).forEach(System.out::print);
            for (int j = 0; j < n; j++) {
                BigDecimal b = new BigDecimal(s[j]);
                if(a.compareTo(b) == 1){
                    System.out.println(a+"("+s[i]+") is greater than ("+s[j]+")"+b);
                    temp = s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
            System.out.println();
        }
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
