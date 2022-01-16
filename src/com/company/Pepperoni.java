package com.company;


    public class Pepperoni extends Pizza {
        public boolean spicy;
        String recipe2 = "not spicy";

        public Pepperoni(int price, int weight, boolean spicy) {
            super(price, weight);
            this.spicy = spicy;
        }

        @Override
        public String toString() {
            return "Pepperoni{" + "price=" + prise + ", weight =" + weight + ", spice =" + spicy + '}';
        }
    }
