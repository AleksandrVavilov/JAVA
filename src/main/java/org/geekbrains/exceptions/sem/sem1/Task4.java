package org.geekbrains.exceptions.sem.sem1;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 5, null, 0, 2, 0, 2, 1, null, 1, 0};
        List<Integer> nullElements = checkArray(array);
        if (nullElements.size() > 0)
            System.out.println("В массиве обнаружены пустые элементы по индексам" + nullElements);
        else System.out.println("Пустых элементов не обнаружено");
    }

    public static List checkArray(Integer[] arr) {
        List<Integer> nullElem = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) nullElem.add(i);
        }
        return nullElem;
    }
}
