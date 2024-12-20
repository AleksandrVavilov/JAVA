package org.geekbrains.JAVA.HW.OOP.HW1.Entitys.Comparators;

import org.geekbrains.JAVA.HW.OOP.HW1.Entitys.Entity;

import java.util.Comparator;

public class CompareEAge<E extends Entity> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
