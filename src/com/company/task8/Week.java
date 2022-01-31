package com.company.task8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Days days = Days.Monday;
        Days days1 = Days.Tuesday;
        Days days2 = Days.Wednesday;
        Days days3 = Days.Thursday;
        Days days4 = Days.Friday;
        Days days5 = Days.Saturday;
        Days days6 = Days.Sunday;

        System.out.println("Введите любой день недели");
        Scanner scan = new Scanner(System.in);
        String sсan = scan.nextLine();

        switch (days) {
            case Monday:
                System.out.println("Понедельник");
                break;
            case Tuesday:
                System.out.println("Вторник");
                break;
            case Wednesday:
                System.out.println("Среда");
                break;
            case Thursday:
                System.out.println("Четверг");
                break;
            case Friday:
                System.out.println("Пятница");
                break;
            case Saturday:
                System.out.println("Суббота");
                break;
            case Sunday:
                System.out.println("Воскреспенье");
                break;
        }
    }
}
