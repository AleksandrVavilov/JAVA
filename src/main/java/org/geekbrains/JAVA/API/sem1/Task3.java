package org.geekbrains.JAVA.API.sem1;

public class Task3 {
    public static void main(String[] args) {
        String s = "Добро пожаловать на курс по Java";
        String[] s1 = s.split(" ");
        for (int i = s1.length - 1; i >= 0; i--) {
            System.out.print(s1[i] + " ");

        }
    }
}
