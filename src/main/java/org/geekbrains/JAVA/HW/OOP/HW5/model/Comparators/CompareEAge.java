package org.geekbrains.JAVA.HW.OOP.HW5.model.Comparators;

import org.geekbrains.JAVA.HW.OOP.HW5.model.Entity;

import java.util.Comparator;

public class CompareEAge<E extends Entity> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
