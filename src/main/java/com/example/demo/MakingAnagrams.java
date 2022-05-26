package com.example.demo;

import java.io.*;
import java.util.*;

public class MakingAnagrams {

    static int makeAnagram(String a, String b) {
        int count=0;
        int m = a.length();
        int n = b.length();

        System.out.println("m="+m+" and n="+n);
        for(int i=0; i<m; i++){
            char letter = a.charAt(i);
            for(int j=0; j<n; j++){
                if(letter == b.charAt(j)) {
                    for (int k=i+1; k<m-1; k++){
                        if (letter == a.charAt(k)){
                            count--;
                            break;
                        }
                    }
                    System.out.println(letter);
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
        int result = (m-count) + (n-count);
        return result;

    }

    public static void main(String[] args) {

        String a = "bugexikjevtubidpulaelsbcqlupwetzyzdvjphn";

        String b = "lajoipfecfinxjspxmevqxuqyalhrsxcvgsdxxkacspbchrbvvwnvsdtsrdk";

        int res = makeAnagram(a, b);
        System.out.println(res);
    }
}
