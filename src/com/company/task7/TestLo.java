package com.company.task7;

public class TestLo {

    public static void main(String[] args) {


        Town town = new Town("Moskau", 12000000, "Cобянин", ());
        Town town1 = new Town("London", 9000000, "Sadic Han", 8);
        Town town2 = new Town("New-York", 8500000, "Eric Adams", 5);
        town.search();

        Village village = new Village("Сокулук", 24000, "Баланчаев");
        Village village1 = new Village("Беловодское", 21000, "Тукунчоев");
        village.search();

    }
}


