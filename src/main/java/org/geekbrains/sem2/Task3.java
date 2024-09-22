package org.geekbrains.sem2;

import java.util.Scanner;

/*Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd
выход: abcd*/
public class Task3 {
    public static void main(String[] args) {
        String str = "aabbbccddddee";
        printstr(str);
        System.out.println(getShortString(str));
    }

    private static void printstr(String str) {
        StringBuilder res = new StringBuilder();
        res.append(str.charAt(0));
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                res.append(str.charAt(i + 1));
            }
        }
        System.out.println(res.toString());
    }

    /**
     * Это решение быстрее
     *
     * @param str
     * @return
     */
    private static String getShortString(String str) {
        char c = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        for (char item : str.toCharArray()) {
            if (item != c) {
                c = item;
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
