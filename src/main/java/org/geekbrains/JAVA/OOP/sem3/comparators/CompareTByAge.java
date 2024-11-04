package org.geekbrains.JAVA.OOP.sem3.comparators;

import org.geekbrains.JAVA.OOP.sem3.group.StudyElement;

import java.util.Comparator;

public class CompareTByAge<E extends StudyElement> implements Comparator<E> {

    @Override
    public int compare(E o1, E o2) {
//        return o1.getAge() - o2.getAge();
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
