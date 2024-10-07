package org.geekbrains.JAVA.HW.HW4;

import java.util.LinkedList;
import java.util.List;

/*
Реализуйте MyStack с использованием LinkedList с методами:
● push(String element) - добавляет элемент на вершину стека
● pop() - возвращает элемент с вершины и удаляет его
● peek() - возвращает элемент с вершины, не удаляя
● getElements() - возвращает все элементы стека
 */
public class MyStack {
    private LinkedList<String> stack = new LinkedList<>();

    public void push(String element) {
        stack.addFirst(element);
    }

    public String peek() {
        return stack.getFirst();
    }

    public String pop() {
        return stack.removeFirst();
    }

    public LinkedList<String> getElements() {
        return stack;
    }
    
}
