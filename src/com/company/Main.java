package com.company;

import com.company.task4.Circle;

//import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int count = 0;
        Circle[] circles = new Circle[10];

        for ( int i = 0; i < 10; i++) {
            circles[i] = new Circle(i+1);
        }

        for(Circle circle: circles) {
            if(circle.y() % 3 == 0) {
                count +=1;

            }
        }
        System.out.println(count);



            }
        }





