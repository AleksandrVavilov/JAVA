package org.geekbrains.JAVA.sem4;

public class TaskTest {
    public static void main(String[] args) {
        GBStack stack = new GBStack();
        stack.push(10);
        stack.push(30);
        stack.push(20);
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
