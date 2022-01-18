package com.company.task6;

public class ThirdTask {
    public static void main(String[] args) {
        Book[] artBooks = new Book[2];
        Book firstArtBook = new Book(1, "Капитанская дочка", "Пушкин А.С.", 1836);
        Book secondArtBook = new Book(1, "Бородино", "Лермонтов", 1836);

        artBooks[0] = firstArtBook;
        artBooks[1] = secondArtBook;

        //ArtDepartment artDepartment = new ArtDepartment(artBooks);

        Book[] techBooks = new Book[2];
        Book firstTechBook = new Book(1, "Чистый код", "Боб Мартин", 2005);

        techBooks[0] = firstTechBook;
       //techBooks[1] = secondTechBook;

      //  TechnicalDepartment technicalDepartment = new TechnicalDepartment(techBooks, true);

        //artDepartment.showGeneralInfo();
        System.out.println();

        //technicalDepartment.showGeneralInfo();
        System.out.println();

        //artDepartment.findByAuthor("Лермонтов");

    }
}
