package org.geekbrains.exceptions.HW.HW2;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        if (scanner.nextLine().isEmpty()) {
            throw new RuntimeException("Пустую строку вводить нельзя!");
        }
        scanner.close();
    }
}
