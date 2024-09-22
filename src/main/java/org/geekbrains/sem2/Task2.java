package org.geekbrains.sem2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        String c1 = "c1";
        String c2 = "c2";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество повторений: ");
        int n = scanner.nextInt();
        String result = (c1 + c2).repeat(n / 2);
        System.out.println(result);
/*        extracted(n, c1, c2);
    }

    private static void extracted(int n, String c1, String c2) throws Exception {
        if (n <= 0 || n % 2 == 1) {
            throw new Exception("Не валидное значение n");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }
        System.out.println(sb);*/
    }
}
