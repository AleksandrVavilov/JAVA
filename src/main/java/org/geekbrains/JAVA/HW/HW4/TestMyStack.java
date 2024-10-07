package org.geekbrains.JAVA.HW.HW4;

import org.geekbrains.JAVA.sem4.GBStack;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        System.out.println(stack.getElements());
        System.out.println(stack.peek());
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
