package org.geekbrains.JAVA.HW.OOP.HW1.People.Comparators;

import org.geekbrains.JAVA.HW.OOP.HW1.People.People;

import java.util.Comparator;

public class ComparePeopleAge implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
