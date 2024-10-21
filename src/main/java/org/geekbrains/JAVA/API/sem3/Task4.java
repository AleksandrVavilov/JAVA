package org.geekbrains.JAVA.API.sem3;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    static List<ArrayList<String>> library = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList joke = new ArrayList<String>();
        joke.add("true");
        joke.add("ttt");
        joke.add(11);
        joke.add(12);
        for (int i = 0; i < joke.size(); i++) {
            if (joke.get(i) instanceof Integer) {
                joke.remove(i--);
            }
        }
        System.out.println(joke);
        ArrayList<String> poetry = new ArrayList<>();
        poetry.add(("Поэзия"));
        poetry.add(("Бородино"));
        poetry.add(("Евгений онегин"));
        addBook(poetry);
        addBook(poetry);
        System.out.println(library);

    }

    public static void addBook(ArrayList<String> books) {
        library.add(books);

    }
}
