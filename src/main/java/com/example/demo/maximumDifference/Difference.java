package com.example.demo.maximumDifference;

public class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        this.elements = a;
    }

    public void computeDifference(){
        maximumDifference = 0;
        int dif = 0;
        for(int i=0; i<elements.length; i++){
            for (int j=i+1; j<elements.length; j++){
                dif = Math.abs(elements[i] - elements[j]);
                if (dif > maximumDifference)
                    maximumDifference = dif;
            }
        }
    }
}
