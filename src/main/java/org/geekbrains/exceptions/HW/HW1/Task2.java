package org.geekbrains.exceptions.HW.HW1;

//Реализуйте метод mergeAndValidateArrays, который принимает два
//        массива целых чисел. Метод должен объединить массивы и вернуть новый
//        массив. Если длины массивов не равны, выбрасывайте исключение
//        IllegalArgumentException. Если хотя бы один элемент объединенного
//        массива отрицательный, выбрасывайте исключение RuntimeException с
//        сообщением "Обнаружен отрицательный элемент".


import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 2};
        int[] a2 = {3, 5, 3};
        try {
            System.out.println(Arrays.toString(mergeAndValidateArrays(a1, a2)));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] mergeAndValidateArrays(int[] a1, int[] a2) {
        if (a1.length != a2.length) throw new IllegalArgumentException("Длины массивов не равны!");
        int[] res = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] < 0) throw new RuntimeException("Обнаружен отрицательный элемент " + a1[i]);
            res[i] = a1[i];
            for (int i1 = 0; i1 < a2.length; i1++) {
                if (a2[i] < 0) throw new RuntimeException("Обнаружен отрицательный элемент " + a2[i]);
                res[i + a1.length] = a2[i];
            }
        }
        return res;
    }
}
