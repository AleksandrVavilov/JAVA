package org.geekbrains.sem2;

import java.util.Scanner;

/*Дано четное число N (>0) и символы c1 и c2.
        Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество повторений: ");
        int n = scanner.nextInt();
        shuffleline(n);
    }

    private static void shuffleline(int n) {
        String c1 = "c1";
        String c2 = "c2";
        String result = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += c1;
            } else {
                result += c2;
            }
        }
        System.out.println(result);
    }
}
