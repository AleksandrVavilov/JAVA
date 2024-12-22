package org.geekbrains.exceptions.sem.sem1;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
//        значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
//        например:
//        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1 в
//        качестве кода ошибки.
//        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        3. если вместо массива пришел null, метод вернет -3
//        4. придумайте свои варианты исключительных ситуаций и верните соответствующие
//        коды ошибок.
//        Напишите метод, в котором реализуете взаимодействие с пользователем. То есть, этот
//        метод запросит искомое число у пользователя, вызовет первый метод, обработает
//        возвращенное значение и покажет читаемый результат пользователю. Например, если
//        вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int minLength = 3;
        AskUser(a, minLength);
    }

    public static int SearchElement(int[] array, int minLength, int value) {
        if (array == null) {
            return -3;
        }
        if (array.length < minLength) {
            return -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return i;
                }
            }
            return -2;
        }

    }

    public static void AskUser(int[] array, int min) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите искомое число: ");
        int value = in.nextInt();
        int result = SearchElement(array, min, value);
        if (result == -3) System.out.println("Массив не инициализирован!");
        if (result == -2) System.out.println("Искомый элемент не найден");
        if (result == -1) System.out.println("Размер массива меньше минимального!");
        if (result >= 0) System.out.println("Индекс искомого элемента=" + result);
    }
}

