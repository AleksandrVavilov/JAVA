package org.geekbrains.JAVA.API.sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(0, 100)); //
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.sort(arr, Comparator.reverseOrder());
        System.out.println(arr);
    }
}
