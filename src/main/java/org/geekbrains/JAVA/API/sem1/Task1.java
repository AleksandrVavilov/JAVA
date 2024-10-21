package org.geekbrains.JAVA.API.sem1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd.MMMM.yyyy, HH:mm:ss");
        System.out.println(form.format(LocalDateTime.now()));

    }
}
