package org.geekbrains.sem1;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //TODO : ввод с консоли
        System.out.println("Введите количество чисел:");
        int n = scanner.nextInt();
        int k = getK(scanner, n);
        if (k < n - 1) {
            System.out.println("k = " + k);
        } else {
            System.out.println("В последовательности нет отрицательных чисел");
        }
    }

    /**
     * @param scanner
     * @param n
     * @return
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел,
     * после которых следует отрицательное число.
     */
    private static int getK(Scanner scanner, int n) {
        int k = 0;
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        int b;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Введите последующее число:");
            b = scanner.nextInt();
            if (a > 0 && b < 0) {
                return k + 1;
            }
            a = b;
            k++;
        }
        return k;
    }
}
