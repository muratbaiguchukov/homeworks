package com.company.task4;

public class Circle {
    public final static double PI = 3.14;
    public int radius;

    public Circle(int radius) {

        this.radius = radius;
    }

    public int getRadius() {

        return radius;
    }

    public void setRadius(int radius) {

        this.radius = radius;
    }

    public double y() {

        return PI * radius * 2;
    }
}




