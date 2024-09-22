package org.geekbrains.HW;

public class HW2 {
    public static void main(String[] args) {
        printPrimeNums();
    }

    /**
     * Напишите функцию printPrimeNums,
     * которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
     */
    public static void printPrimeNums() {
        // Напишите свое решение ниже
        System.out.println(2);
        for (int i = 2; i < 1000; i++) {
            if (isSimple(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSimple(int i) {
        for (int j = 2; j < (Math.pow(i, 0.5) + 1); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
