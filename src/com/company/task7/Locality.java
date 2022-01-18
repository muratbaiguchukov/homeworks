package com.company.task7;

abstract class Locality {

    public String name;
    public int population;
    public String supervisor;

    public Locality(String name, int population, String supervisor) {
        this.name = name;
        this.population = population;
        this.supervisor = supervisor;
    }

    public void search() {

        System.out.println("Руководитель" + supervisor);
    }
}
