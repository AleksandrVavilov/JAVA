package org.geekbrains.JAVA.HW.API.HW1;

//Напишите метод factorial,который принимает число n и возвращает его факториал.Если число n < 0,метод должен вернуть -1.
public class Task1 {
    public static void main(String[] args) {
        System.out.println(factorial(20));
    }

    public static long factorial(int n) {
        if (n < 0) return -1;
        if (n == 1 || n == 0) return 1;
        else {
            long res = 1;
            for (int i = 2; i <= n; i++) {
                res *= i;
            }
            return res;
        }
    }
}
