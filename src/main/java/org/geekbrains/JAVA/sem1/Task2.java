package org.geekbrains.JAVA.sem1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        LocalTime time = LocalTime.now();
        if (time.getHour() >= 5 && time.getHour() <= 11) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (time.getHour() >= 12 && time.getHour() < 18) {
            System.out.println("Добрый день, " + name + "!");
        } else if (time.getHour() >= 18 && time.getHour() < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }
        scanner.close();

    }
}