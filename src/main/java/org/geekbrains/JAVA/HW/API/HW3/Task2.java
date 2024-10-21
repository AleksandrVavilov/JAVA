package org.geekbrains.JAVA.HW.API.HW3;

import java.util.ArrayList;
import java.util.Arrays;
//Напишите метод, который принимает целочисленный массив и возвращает
//        новый массив, содержащий только уникальные элементы из исходного
//массива.

public class Task2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 5, 7, 7, 5, 2, 1};

        System.out.println(Arrays.toString(getUniqueElem(a)));

    }

    public static int[] getUniqueElem(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!temp.contains(arr[i])) temp.add(arr[i]);
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }
        return result;
    }
}
