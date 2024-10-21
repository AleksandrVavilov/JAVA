package org.geekbrains.JAVA.HW.API.HW4;
/*
Реализуйте метод rotateDeque в классе DequeTasks, который принимает
Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
позиций. Если n отрицательное, повернуть влево.
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTasks {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.add(6);
        System.out.println("Исходник: " + deque);
        System.out.println("Результат: " + rotateDeque(deque, -999999999));
    }

    public static Deque<Integer> rotateDeque(Deque<Integer> deq, int n) {
        if (deq.isEmpty()) throw new RuntimeException("Очередь пуста");
        n = n % deq.size();
        if (n < 0) {
            n += deq.size();  //хороший метод исключить второй цикл, значения при -2 == значениям при 4
        }
        if (n > 0) {
            while (n > 0) {
                deq.addFirst(deq.removeLast());
                n--;
            }
        }
//        if (n < 0) {
//            while (n < 0) {
//                deq.addLast(deq.removeFirst());
//                n++;
//            }
//        }
        return deq;
    }
}
