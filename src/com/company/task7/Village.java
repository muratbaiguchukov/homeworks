package com.company.task7;

public class Village extends Locality {

    public Village(String name, int population, String supervisor) {
        super(name, population, supervisor);
    }

    @Override
    public String toString() {
        return "Village{" + "name=" + name + ", population=" + population + ", supervisor=" + supervisor + '}';

    }
}
