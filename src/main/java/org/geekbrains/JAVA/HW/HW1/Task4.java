package org.geekbrains.JAVA.HW.HW1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(findMaxOfThree(15, 25, 10));
    }

    public static int findMaxOfTwo(int a, int b) {
        if (a >= b) return a;
        else return b;
    }

    public static int findMaxOfThree(int a, int b, int c) {
        return findMaxOfTwo(findMaxOfTwo(a, b), c);
    }

}
