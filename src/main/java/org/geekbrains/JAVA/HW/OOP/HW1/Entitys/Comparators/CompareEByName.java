package org.geekbrains.JAVA.HW.OOP.HW1.Entitys.Comparators;

import org.geekbrains.JAVA.HW.OOP.HW1.Entitys.Entity;

import java.util.Comparator;

public class CompareEByName<E extends Entity> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
