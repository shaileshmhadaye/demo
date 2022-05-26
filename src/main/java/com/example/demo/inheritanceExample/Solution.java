package com.example.demo.inheritanceExample;

class Solution {
    public static void main(String[] args) {
        Student s = new Student("firstName", "lastName", 12, new int[]{100, 90});
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
