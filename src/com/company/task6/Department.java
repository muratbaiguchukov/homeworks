package com.company.task6;

import java.awt.print.Book;

abstract class Department {
    private final String name;

    public Book[] books;

    public Department(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public void addBook(Book[] books) {

        this.books = books;
        }

        public void showBooks() {
        for (Book book: books) {
            System.out.println(book.toString());
        }
        }

        public void showGeneralInfo() {
        showBooks();
            System.out.println("Название отдела: " + name);
        }

        public void findByAuthor(String author) {
        for (Book book : books) {
            //if (book.author.equalsignoreCase(author)) {
                System.out.println(book);
            }
        }


        public int bookAmount() {

        return books.length;
        }

        //@Override
    //public String toString() {
            //return "Department{" + "name='" + name + '\" + ", booksAmount=" + bookAmount() + '}';
        }


