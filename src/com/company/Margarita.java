package com.company;


        class Margarita extends Pizza{
        public boolean meat;

        public Margarita(int price, int weight, boolean meat) {
            super(price, weight);
            this.meat = meat;
        }

        @Override
        public String toString() {
            return "Margarita{" + "price=" + prise + ", weight=" + weight + ", meat=" + meat + '}';
        }
    }

