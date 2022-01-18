package com.company;

import java.util.Scanner;

public class TestBi {



    public class Main {
        public static void main(String[] args) {
            int point;
            Scanner scanner = new Scanner(System.in);
            do {

                System.out.println("-------------Добавить-------------------");
                System.out.println("1. Добавить книги в худ отдел");
                System.out.println("2. Добавить книги в юр отдел");
                System.out.println("3. Добавить книги в  тех отдел");
                System.out.println("-------------Показать-------------------");
                System.out.println("4. Показать книги худ отдела");
                System.out.println("5. Показать книги юр отдела");
                System.out.println("6. Показать книги тех отдела");
                System.out.println("--------------------------------------");
                System.out.println("7. Показать всю информацию худ отдела");
                System.out.println("8. Показать всю информацию юр отдела");
                System.out.println("9. Показать всю информацию тех отдела");
                System.out.println("---------------Поиск книги по автору--------------");
                System.out.println("10. Поиск книги по автору в худ отделе");
                System.out.println("11. Поиск книги по автору в юр отделе");
                System.out.println("12. Поиск книги по автору в тех отделе");
                point = scanner.nextInt();

                switch (point){

                }
            } while (point != 0);
        }
    }
}
