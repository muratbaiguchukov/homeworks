package com.company.task7;

public class Town extends Locality {

    District[] district;

    public Town(String name, int population, String supervisor, District[] district) {
        super(name, population, supervisor);
        this.district = district;
    }

    @Override
    public String toString() {
        return "Town(" + "name=" + name + ", population=" + population + ", supervisor=" + supervisor + ", district=" + district + ")";
    }
}
