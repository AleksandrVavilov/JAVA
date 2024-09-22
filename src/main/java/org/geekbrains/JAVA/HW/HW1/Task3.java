package org.geekbrains.JAVA.HW.HW1;

//Напишите метод sumDigits, который принимает целое число n и возвращает сумму его цифр.
public class Task3 {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(123456));
    }

    public static int sumOfDigit(int n) {
        if (n < 0) return -1;
        if (n < 10 && n > 0) return n;
        int result = 0;
        while (n != 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
