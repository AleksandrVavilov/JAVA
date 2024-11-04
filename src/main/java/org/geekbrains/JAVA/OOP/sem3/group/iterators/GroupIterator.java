package org.geekbrains.JAVA.OOP.sem3.group.iterators;

import org.geekbrains.JAVA.OOP.sem3.group.StudyElement;

import java.util.Iterator;
import java.util.List;

public class GroupIterator<T extends StudyElement> implements Iterator<T> {
    private int index;
    private List<T> list;

    public GroupIterator(List<T> list) {
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
