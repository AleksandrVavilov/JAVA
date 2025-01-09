package org.geekbrains.exceptions.sem.sem2;

public class Task2 {
    public static void main(String[] args) {
        String[][] arr = {{"", "2", "3", "4"}, {"1", "2", "3"}};
        System.out.println(sum2d(arr));

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        int val = 0;
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        val = Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        System.out.println("элемент по индексу " + i + " и " + j + " пропущен, не является числом");
                    }
                    sum += val;
                }
            }
        }
        return sum;
    }
}
