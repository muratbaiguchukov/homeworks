package com.company.task7;

public class Supervisor extends Locality{
    String surname;

    public Supervisor(String name, int population, String supervisor, String surname) {
        super(name, population, supervisor);
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Supervisor{" + "name=" + name + ", population=" + population + ", supervisor=" + surname + '}';

    }
}
