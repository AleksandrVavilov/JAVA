package org.geekbrains.JAVA.HW.API.HW4;

import java.util.LinkedList;

/*
Реализуйте метод countOccurrences в классе ListUtils, который
принимает LinkedList<String> и строку, и возвращает количество
вхождений строки в список.
 */
public class ListUtils {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Яблоко");
        ll.add("Банан");
        ll.add("Арбуз");
        ll.add("Банан");
        ll.add("Яблоко");
        ll.add("Банан");
        ll.add("Персик");
        System.out.println(countOccurrences(ll, "Банан"));
        System.out.println(ll);

    }


    public static int countOccurrences(LinkedList<String> list, String value) {
        LinkedList<String> copy = new LinkedList<>();
        copy.addAll(list);
        int count = 0;
        for (int i = 0; i < copy.size(); i++) {
            if (copy.contains(value)) {
                count++;
                copy.remove(value);
            }
        }
        return count;
    }
}
