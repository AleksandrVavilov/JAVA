package org.geekbrains.JAVA.HW.OOP.HW1.People.Comparators;

import org.geekbrains.JAVA.HW.OOP.HW1.People.People;

import java.util.Comparator;

public class ComparePeoplebyName implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
