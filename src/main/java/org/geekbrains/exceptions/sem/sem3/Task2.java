package org.geekbrains.exceptions.sem.sem3;
/*
Создайте метод doSomething(), который может быть источником одного из
типов checked exceptions (тело самого метода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое
вызвал метод doSomething().
 */

import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            System.out.println("Исключение ввода-вывода");
        }
    }

    public static void doSomething() throws IOException {
        throw new IOException();
    }
}
