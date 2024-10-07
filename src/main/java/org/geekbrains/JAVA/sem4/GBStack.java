package org.geekbrains.JAVA.sem4;

import java.util.EmptyStackException;

/**
 * Реализовать стэк с помощью массива.
 * Нужно реализовать методы:
 * size() возвр размер,
 * isEmpty() - пуст ли стек,
 * push() - добавить элемент на вершину,
 * peek() - вернуть верхний элемент,
 * pop() - возвращает верхний и удаляет его.
 */
public class GBStack {
    private int size = 0;
    private int capacity = 2;
    private int top = -1;
    private int[] stack = new int[capacity];

    private void addCapacity() {
        capacity *= 2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, size); // что копируем, с какой позиции, куда, с какой пизиции вставляем, размер
        stack = newStack; //в этот момент сборщик сам удалит старый массив
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(int value) {
        if (isFull()) {
            addCapacity();
        }
        stack[++top] = value;
        size++;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty"); //или вернуть null
        return stack[top];
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        size--;
        capacity--;
        return stack[top--];
    }

    private boolean isFull() {
        return size == capacity;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            builder.append(stack[i]).append(", ");
        }
        builder.delete(builder.length() - 2, builder.length());
        return String.format("[%s]", builder);
    }
}
