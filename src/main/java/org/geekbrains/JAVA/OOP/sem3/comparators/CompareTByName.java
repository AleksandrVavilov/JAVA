package org.geekbrains.JAVA.OOP.sem3.comparators;

import org.geekbrains.JAVA.OOP.sem3.group.StudyElement;

import java.util.Comparator;

public class CompareTByName<E extends StudyElement> implements Comparator<E> {

    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

