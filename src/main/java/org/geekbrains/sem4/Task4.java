package org.geekbrains.sem4;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

/*1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
        2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди.*/
public class Task4 {
    public static void main(String[] args) {
        String[] str = {"str1", "str2", "str3" };
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            stack.push(str[i]);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); //добавили в конец, распечатали последний и удалили
        }
        System.out.println();
        ArrayDeque<String> arDeq = new ArrayDeque<>();
        for (int i = 0; i < str.length; i++) {
            arDeq.offer(str[i]);
        }
        while (!arDeq.isEmpty()) {
            System.out.println(arDeq.poll()); // добавили в конец, распечатали первый и удалили
        }
    }
}
