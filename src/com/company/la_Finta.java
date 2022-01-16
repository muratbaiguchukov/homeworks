package com.company;

    public class la_Finta extends Pizza {
        public boolean mushrooms;

        public la_Finta(int price, int weight, boolean mushrooms) {
            super(price, weight);
            this.mushrooms = mushrooms;
        }

        @Override
        public String toString() {
            return "la_Finta{" + "price=" + prise + ", weight=" + weight + ", mushrooms=" + mushrooms + '}';

        }
    }