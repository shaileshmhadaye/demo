package com.example.demo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingClouds {
    static int jumpingOnClouds(int[] c) {
        int jumpCount = 0;
        System.out.println(c.length);
        int i = 0;
        while (c.length-1 > i){
            if(c.length > i+2 && c[i+2] == 0){
                jumpCount++;
                i+=2;
            }
            else{
                jumpCount++;
                i+=1;
            }
            System.out.println("cloud number="+i);
        }
        return jumpCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int[] c = new int[]{0,0,0,0,1,0};
        int result = jumpingOnClouds(c);
        System.out.println(result);

        scanner.close();
    }

}
