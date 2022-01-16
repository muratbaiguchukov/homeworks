package com.company;

import com.company.task4.Circle;

public class Main {

        public static void main(String[] args) {
                Pepperoni pepperoni = new Pepperoni(32, 2, true);
                pepperoni.make();
                pepperoni.deliver();

                Margarita margarita = new Margarita(25, 1, false);
                margarita.make();
                margarita.deliver();

                la_Finta la_finta = new la_Finta(35, 2, true);
                la_finta.make();
                la_finta.deliver();
        }
}






