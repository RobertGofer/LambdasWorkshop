package com.robert;

import java.util.ArrayList;
import java.util.List;

public class Books {

    public static List<Book> all() {
        List<Book> books = new ArrayList<>();
        books.add((new Book("Java podstawy", "Horstmann", 2019)));
        books.add((new Book("Java rusz głową", "Jakiś tam gościu", 2019)));
        books.add((new Book("Html, CSS, JavaScript", "Jakiś tam Panicz", 2019)));
        books.add((new Book("Podstawy testowania", "nie wiem", 2019)));
        return books;
    }
}
