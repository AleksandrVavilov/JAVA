package org.geekbrains.sem1;

import java.util.Scanner;

//Дан массив целых чисел. Верно ли, что массив является симметричным.
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //TODO : ввод с консоли
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Наш массив: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        if (isSimmetr(arr)) {
            System.out.println(" - симметричный!");
        } else {
            System.out.println(" - не симметричный!");
        }
    }

    private static boolean isSimmetr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
