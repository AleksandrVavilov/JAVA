package org.geekbrains.exceptions.sem.sem1;

//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//Необходимо посчитать и вернуть сумму элементов этого массива.
//При этом накладываем на метод 2 ограничения: метод может работать только с
//квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
//только значение 0 или 1.
//Если нарушается одно из условий, метод должен вернуть код ошибки.
//Программа должна корректно обработать код ошибки и вывести соответствующее
//сообщение пользователю.
//Сравнить такой вариант обработки исключений с предыдущим.
//Какое преимущество у исключений перед
//кодами ошибок вы можете назвать
//в данном случае?

public class Task3 {
    public static void main(String[] args) {
        int[][] twoDimArray = {{1, 1}, {1, 1}};
        int result = SumArrayDigit(twoDimArray);
        if (result == -1) System.out.println("Массив не квадратный");
        else if (result == -2) System.out.println("Значения в массиве отличны от 1 и 0");
        else System.out.println(result);
    }

    public static int SumArrayDigit(int[][] a) {
        int sum = 0;
        for (int[] row : a) {
            if (a.length != row.length) return -1;
        }
        for (int[] row : a) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] != 0 && row[i] != 1) return -2;
            }
        }
        for (int[] row : a) {
            for (int i : row) {
                sum += i;
            }
        }
        return sum;
    }
}
