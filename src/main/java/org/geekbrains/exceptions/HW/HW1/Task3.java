package org.geekbrains.exceptions.HW.HW1;

//Реализуйте метод subArraysWithExceptionHandling, который принимает
//два массива целых чисел. Метод должен возвращать новый массив, где
//каждый элемент является разностью соответствующих элементов двух входных
//массивов. Если длины массивов не равны, выбрасывайте
//IllegalArgumentException с сообщением "Массивы разной длины". Если
//результат разности оказывается отрицательным, выбрасывайте
//RuntimeException с сообщением "Отрицательный результат разности".


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.geekbrains.exceptions.HW.HW1.Task2.mergeAndValidateArrays;

public class Task3 {
    public static void main(String[] args) {
        List<String> errors = new ArrayList<>();
        int[] a1 = {10, 30, 10};
        int[] a2 = {3, 5, 3};
        int[] result = new Answer().subArraysWithExceptionHandling(a1, a2, errors);
        System.out.println(Arrays.toString(result));
        if (!errors.isEmpty()) System.out.println("Список ошибок:" + errors.toString());
        else System.out.println("Ошибок не обнаружено!");
    }
}

class Answer {
    public static int[] subArraysWithExceptionHandling(int[] a1, int[] a2, List<String> err) {
        if (a1.length != a2.length) {
            err.add("Длины массивов не равны!");
            return new int[0];
        }
        int[] res = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            res[i] = a1[i] - a2[i];
            if (res[i] < 0) err.add("Отрицательный результат разности на элементе по индексу " + i);
        }
        return res;
    }
}
