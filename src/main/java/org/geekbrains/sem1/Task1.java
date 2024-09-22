package org.geekbrains.sem1;
/*Для заданного целого числа n вернуть разницу между произведением его цифр и суммой его цифр.
Пример 1:
Вход: n = 234
Выход: 15
Пояснение:
Произведение цифр = 2 * 3 * 4 = 24
Сумма цифр = 2 + 3 + 4 = 9
Результат = 24 - 9 = 15
Пример 2:
Вход: n = 4421
Выход: 21
Пояснение:
Произведение цифр = 4 * 4 * 2 * 1 = 32
Сумма цифр = 4 + 4 + 2 + 1 = 11
Результат = 32 - 11 = 21
ТАКИЕ КОММЕНТАРИЕ В ИДЕАЛЕ НУЖНО УДАЛЯТЬ*/


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //TODO : ввод с консоли
        System.out.println("Введите исходное число:");
        int n = scanner.nextInt();
        int result = getSumMinusPr(n);
        System.out.println("result = " + result);
    }

    /**
     * @param n начальное значение
     * @return произведение минус сумма
     * @apiNote доп описание
     */
    private static int getSumMinusPr(int n) {
        int sum = 0;
        int pr = 1;

        while (n != 0) {
            sum += n % 10;
            pr *= n % 10;
            n /= 10;
        }
        return pr - sum;
    }
}