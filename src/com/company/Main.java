package com.company;

import com.company.task4.Circle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(6.5);
        circle.getRadius();
        double m = circle.sum1();
        System.out.print(m);

        double s = Circle.sum2(3.14, 6.5);
        System.out.println(s);


    }
}
