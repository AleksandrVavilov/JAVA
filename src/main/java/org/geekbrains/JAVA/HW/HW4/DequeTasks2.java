package org.geekbrains.JAVA.HW.HW4;
/*
Реализуйте метод removeAllOccurrences в классе DequeTasks, который
принимает Deque<String> и строку value. Метод должен удалить все
вхождения строки value из очереди.
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;

public class DequeTasks2 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Первый");
        deque.add("Второй");
        deque.add("Третий");
        deque.add("Первый");
        deque.add("Второй");
        deque.add("Третий");
        deque.add("Первый");
        deque.add("Второй");
        deque.add("Третий");
        deque.add("Первый");
        deque.add("Второй");
        deque.add("Первый");
        deque.add("Первый");
        System.out.println(deque);
        System.out.println(removeAllOccurrences(deque, "Первый"));
    }

    public static Deque<String> removeAllOccurrences(Deque<String> deque, String value) {
//        ArrayList<String> str = new ArrayList<>();
//        str.add(value);
//        deque.removeAll(str);
        deque.removeIf(element -> element.equals(value)); //-> условие (удалить элемент если элемент экв. значению
        return deque;
    }
}
