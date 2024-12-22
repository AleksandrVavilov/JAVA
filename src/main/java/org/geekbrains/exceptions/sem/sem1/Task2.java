package org.geekbrains.exceptions.sem.sem1;
//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//Необходимо посчитать и вернуть сумму элементов этого массива.
//При этом накладываем на метод 2 ограничения: метод может работать только с
//квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
//только значение 0 или 1.
//Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
//ошибке.
public class Task2 {
    public static void main(String[] args) {
        int[][] twoDimArray = {{1, 1}, {1, 1}};
        System.out.println(SumArrayDigit(twoDimArray));
    }

    public static int SumArrayDigit(int[][] a) {
        int sum = 0;
        for (int[] row : a) {
            if (a.length != row.length) throw new RuntimeException("Массив не квадратный");
        }
        for (int[] row : a) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] != 0 && row[i] != 1) {
                    throw new RuntimeException("Значения в массиве отличны от 1 и 0");
                }
            }
        }
        for (int[] row : a) {
            for (int i = 0; i < row.length; i++) {
                sum += row[i];
            }
        }
        return sum;
    }
}
