package com.company;

public class Main {

    public static void main(String[] args) {
        Student roman = new Student();
        System.out.println("Student Roman year of enrollment: " + roman.year_of_enrollment + "studying for " +  roman.course +  "he is " + roman.age + "years old");
        Student vlad = new Student();
        vlad.course = 3;
        vlad.year_of_enrollment = 2019;
        vlad.age = 20;
        System.out.println("Student Vlad year of enrollment: " + vlad.year_of_enrollment + " studying for " +  vlad.course +  " he is " + vlad.age + " years old ");
        Student igor = new Student();
        igor.course = 5;
        igor.year_of_enrollment = 2017;
        igor.age = 22;
        System.out.println("Student Igor year of enrollment: " + igor.year_of_enrollment + " studying for " +  igor.course +  " he is " + igor.age + " years old ");



    }
}
