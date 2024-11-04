package org.geekbrains.JAVA.OOP.sem4;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    List<T> list;

    public Storage() {
        list = new ArrayList<>();
    }

    void add(T item) {
        list.add(item);
    }

    T get(int index) {
        return list.get(index);
    }

    void remove(int index) {
        list.remove(index);
    }


    int size() {
        return list.size();
    }

}
