package org.geekbrains.JAVA.HW.HW3;

import java.util.Arrays;

//Напишите метод, который принимает массив целых чисел и возвращает
//среднее значение элементов массива, округленное до ближайшего целого
//числа.
public class Task4 {
    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 7, 5, 1};
        System.out.println(aMean(a));

    }

    private static int aMean(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int result = (int) Math.ceil((double) sum / a.length);
        //        System.out.println((int) Math.round((double) sum / a.length));
        return result;
    }
}
