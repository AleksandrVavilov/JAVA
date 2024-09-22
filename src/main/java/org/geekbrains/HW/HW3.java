package org.geekbrains.HW;

public class HW3 {
    public static void main(String[] args) {
        int a = 10;
        char op = '!';
        int b = 3;
        System.out.println(calculate(op, a, b));
        if (op != '+' && op != '-' && op != '*' && op != '/') {
            System.out.println("Некорректный оператор: " + op);
        }
    }

    static double calculate(char op, int a, int b) {
        // Введите свое решение ниже
        double result = 0;
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            result = a / b;
        }
        return result;
    }
}
