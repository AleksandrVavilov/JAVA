package org.geekbrains.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива. Необходимо удалить из списка четные числа и вернуть результирующий.

Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>

Примеры.
Исходный массив:

        1, 2, 3, 4, 5, 6, 7, 8, 9
Результат:

        [1, 3, 5, 7, 9]
Исходный массив:

        2, 4, 6, 8
Результат:

        []*/
public class HW7 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2, 4, 6, 8, 9, 10};
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr);
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i)) % 2 == 0) {
                list.remove(i);
                i--; //ВАЖНО сместиться влево т.к. длина массива стала меньше
            }
        }
        System.out.println(list);
    }
}
