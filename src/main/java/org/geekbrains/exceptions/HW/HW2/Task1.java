package org.geekbrains.exceptions.HW.HW2;
/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и
возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(inputFloat());

    }

    public static float inputFloat() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        while (!in.hasNextFloat()) {
            System.out.println("Некорректный ввод, попробуйте еще раз!");
            in.nextLine();
        }
        return in.nextFloat();
    }

}
