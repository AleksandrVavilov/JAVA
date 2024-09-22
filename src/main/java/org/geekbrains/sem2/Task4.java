package org.geekbrains.sem2;

import java.util.Scanner;

/*Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает
boolean значение).*/
public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите строку для проверки на полиндром: ");
        Scanner scaner = new Scanner(System.in);
        String str = scaner.nextLine().replaceAll("\\s", "").toLowerCase(); //исключили пробелы и привели к нижнему регистру
        if (str.equals(new StringBuilder(str).reverse().toString())) { //созд переврнутую строку и проверили на идентичность начальной
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
  /*      System.out.println(itspoly(str));
    }

    private static boolean itspoly(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;*/
    }
}
