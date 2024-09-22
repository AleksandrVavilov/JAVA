package org.geekbrains.HW;

import java.util.ArrayList;
import java.util.Collections;

/*Реализуйте метод, который принимает на вход целочисленный массив arr:
        - Создаёт список ArrayList, заполненный числами из исходого массива arr.
        - Сортирует список по возрастанию и выводит на экран.
        - Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
        - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - массив целых чисел.

        Пример.
Исходный массив:

        4, 2, 7, 5, 1, 3, 8, 6, 9
Результаты:

        [1, 2, 3, 4, 5, 6, 7, 8, 9]
Minimum is 1
Maximum is 9*/
public class HW8 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Minimum is " + Collections.min(list));
        System.out.println("Maximum is " + Collections.max(list));
        System.out.println("Average is " + average(list));

    }

    static double average(ArrayList<Integer> list) {

        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum / list.size();
    }
}
