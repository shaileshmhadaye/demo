package com.example.demo.inheritanceExample;

class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate(){
        char grade = 0;
        int sum = 0;
        for (int i : testScores){
            sum += i;
        }
        int average = sum / testScores.length;
        if (average >=90 && average <=100) grade = 'O';
        if (average >=80 && average <90) grade = 'E';
        if (average >=70 && average <80) grade = 'A';
        if (average >=55 && average <70) grade = 'P';
        if (average >=40 && average <55) grade = 'D';
        if (average <40) grade = 'T';
        return grade;
    }
}
