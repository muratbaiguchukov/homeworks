package com.company.task7;

public class District extends Locality {
    public District(String name, int population, String supervisor) {

        super(name, population, supervisor);
    }

    @Override
    public String toString() {
        return "District{" + "name=" + name + ", population=" + population + ", supervisor=" + supervisor + '}';
    }
}
