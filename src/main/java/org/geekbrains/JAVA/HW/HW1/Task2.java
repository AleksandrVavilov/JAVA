package org.geekbrains.JAVA.HW.HW1;

//Напишите метод printEvenNums ,который выведет на экран все четные числа в промежутке от 1 до 100, каждое на новой строке.
public class Task2 {
    public static void main(String[] args) {
        printEvenNums();
    }

    public static void printEvenNums() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
