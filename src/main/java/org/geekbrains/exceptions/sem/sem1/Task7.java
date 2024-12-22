package org.geekbrains.exceptions.sem.sem1;
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива и
//        возвращающий новый массив, каждый элемент которого равен сумме элементов двух
//        входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3, 5};
        try {
            System.out.println(Arrays.toString(ResultArray(a, b)));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] ResultArray(int[] a, int[] b) throws IllegalArgumentException {
        int[] result = new int[a.length];
        if (a.length != b.length) throw new IllegalArgumentException("Массивы разной длины!");
        for (int i = 0; i < a.length; i++) {
            result[i] = (a[i] + b[i]);
        }
        return result;
    }
}
