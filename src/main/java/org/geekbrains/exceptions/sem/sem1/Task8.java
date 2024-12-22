package org.geekbrains.exceptions.sem.sem1;

//Реализуйте метод, принимающий в качестве аргументов двумерный массив.
//Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
//детализировать какие строки со столбцами не требуется.
//Как бы вы реализовали подобный метод?

public class Task8 {
    public static void main(String[] args) {
        int[][] twoDimArray = {{1, 1}, {1, 1, 3}, {1, 2, 3}};
        if (CheckArray(twoDimArray) == true) System.out.println("Количество строк и столбцов равны");
        else System.out.println("Колисчетво строк и столбцов не равны");
    }

    public static boolean CheckArray(int[][] a) {
        int rows = a.length;
        if (rows == 0) return true;
        for (int i = 0; i < rows; i++) {
            if (a[i].length != rows) return false;
        }
        return true;
    }
}