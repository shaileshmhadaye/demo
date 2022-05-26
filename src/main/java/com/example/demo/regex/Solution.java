package com.example.demo.regex;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution {

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
*/
        String[][] array = new String[][]{
                {"riya", "riya@gmail.com"},{"julia", "julia@julia.me"},{"tanya", "tanya@gmail.com"},{"julia", "sjulia@gmail.com"},{"samantha", "samantha@gmail.com"}
        };
        ArrayList<String> names = new ArrayList<>();

        for (int NItr = 0; NItr < 5; NItr++) {
            String[] firstNameEmailID = /*scanner.nextLine().split(" ")*/array[NItr];
            System.out.println(Arrays.stream(firstNameEmailID).collect(Collectors.toList()));

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            if(validateFirstName(firstName) && validateEmailID(emailID) && emailID.contains("@gmail.com")){
                names.add(firstName);
            }
        }
        Collections.sort(names);
        names.forEach(System.out::println);

        //scanner.close();
    }

    public static boolean validateFirstName(String firstName){
        String regex = "^[a-z]{0,20}$";
        Pattern p = Pattern.compile(regex);
        if (firstName == null) {
            return false;
        }

        Matcher m = p.matcher(firstName.trim());

        return m.matches();
    }

    public static boolean validateEmailID(String emailID){
        String regex = "^[a-z]+@[a-z]+\\.[a-z]+$";
        Pattern p = Pattern.compile(regex);
        if (emailID == null) {
            return false;
        }

        Matcher m = p.matcher(emailID.trim());

        return emailID.length()<=50 && m.matches();
    }
}
