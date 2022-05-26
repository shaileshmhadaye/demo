package com.example.demo.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(0,1,0,0,0,0));
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(1,1,1,0,0,0));
        int sum = 0;
        for (int i=0; i<=3; i++){
            for(int j=0; j<=3; j++){
                int temp = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) +
                        arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) +
                        arr.get(i+2).get(j+2);
                if (temp > sum){
                    sum = temp;
                }
            }
        }
        System.out.println(sum);
        bufferedReader.close();
    }
}


/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){
        String line = "<h1>Nayeem loves counseling</h1>";
        if (line.contains("<") && line.contains("/>")) {
            while (!line.isEmpty() && !line.equals("None")) {
                int closingTagIndex = line.indexOf(">");
                String tag = line.substring(line.indexOf("<") + 1, closingTagIndex);
                if (line.contains("</" + tag + ">")) {
                    int i = line.lastIndexOf("</" + tag + ">");
                    line = line.substring(closingTagIndex + 1, i);
                } else {
                    line = "None";
                }
                if (line.isEmpty()) {
                    line = "None";
                }
            }
        }else {
            line = "None";
        }
        System.out.println(line);
    }

}*/


/*
import java.util.Scanner;

public class Solution {

    */
/*static boolean isAnagram(String a, String b) {
        int[] visited = new int[a.length()];
        int k=0;
        if(a.length() == b.length()){
            int n = a.length();
            a = a.toLowerCase();
            b = b.toLowerCase();
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    if((a.charAt(i) == b.charAt(j)) && visited[j] == 0){
                        visited[j] = 1;
                        k++;
                        break;
                    }
                }
            }
            return k == n;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = "anagramm";
        String b = "marganaa";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }*//*

}*/
