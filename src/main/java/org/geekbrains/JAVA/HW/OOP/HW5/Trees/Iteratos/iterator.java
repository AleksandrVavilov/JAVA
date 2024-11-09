package org.geekbrains.JAVA.HW.OOP.HW5.Trees.Iteratos;


import org.geekbrains.JAVA.HW.OOP.HW5.model.Entity;

import java.util.Iterator;
import java.util.List;

public class iterator<T extends Entity> implements Iterator<T> {
    private int index;
    private List<T> list;

    public iterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}
