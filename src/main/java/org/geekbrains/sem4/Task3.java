package org.geekbrains.sem4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*Реализовать консольное приложение, которое:
        1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> list = new ArrayDeque<>();
        boolean programStatus = true;

        while (programStatus) {
            System.out.println("Доступые команды 'exit', 'print', 'revert'");
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                programStatus = false;
            }
            if (input.equals("print")) {
                if (list.isEmpty()) {
                    System.out.println("Cписок пуст");
                } else {
                    Deque<String> temp = new ArrayDeque<>(list);
                    for (int i = 0; i < temp.size(); i++) {
                        System.out.println(list.pop());
                    }
                    list = temp;
                }
            } else if (input.equals("revert")) {
                if (list.isEmpty()) {
                    System.out.println("Cписок пуст");
                } else {
                    String removed = list.pop();
                    System.out.println("Удалено: " + removed);
                }
            } else {
                list.push(input);
            }
        }
    }
}
