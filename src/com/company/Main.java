package com.company;

import com.company.task3.Credit;

public class Main {

    public static void main(String[] args) {
        Credit credit = new Credit();
        Credit cre1 = new Credit("Иванов", 10000, "one year", 15);
        cre1.Id = "Иванов";
        cre1.amount = 10000;
        cre1.period = "one year";
        cre1.percentage = 15;

        System.out.println("Ура");
    }
}
