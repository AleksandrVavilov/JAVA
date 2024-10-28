package org.geekbrains.JAVA.HW.OOP.HW1.Trees.Iteratos;


import org.geekbrains.JAVA.HW.OOP.HW1.People.People;

import java.util.Iterator;
import java.util.List;

public class PesonIterator implements Iterator<People> {
    private int index;
    private List<People> list;

    public PesonIterator(List<People> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public People next() {
        return list.get(index++);
    }
}
