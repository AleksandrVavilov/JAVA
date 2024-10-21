package org.geekbrains.JAVA.HW.API.HW4;

import java.util.LinkedList;

/**
 * Дан LinkedList с несколькими элементами. В методе
 * removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
 * которых нечетная. Используйте LinkedList и стандартные методы.
 */
public class LLTasks {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("apple");
        ll.add("banana");
        ll.add("app");
        ll.add("pear");
        ll.add("grape");
        removeOddLengthStrings(ll);
    }

    public static void removeOddLengthStrings(LinkedList<String> ll) {
        for (int i = 0; i < ll.size(); i++) {
            if (!(ll.get(i).length() % 2 == 0)) {
                ll.remove(i);
                i--;
            }
        }
        System.out.println(ll);
    }
}
