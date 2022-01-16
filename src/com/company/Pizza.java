package com.company;

    abstract class Pizza {

        static int orderNumber = 0;
        public int prise;
        public int weight;
        {
            orderNumber+=1;
        }

        public Pizza(int prise, int weight) {
            this.prise = prise;
            this.weight = weight;
        }

        public void make() {

            System.out.println("Готовится пицца №" + orderNumber);
        }

        public void deliver() {

            System.out.println(this);
        }


    }

