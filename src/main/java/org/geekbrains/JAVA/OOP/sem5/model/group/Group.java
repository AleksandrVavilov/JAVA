package org.geekbrains.JAVA.OOP.sem5.model.group;

import org.geekbrains.JAVA.OOP.sem3.comparators.CompareTByAge;
import org.geekbrains.JAVA.OOP.sem3.comparators.CompareTByName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group<T extends StudyElement> implements Iterable<T> {
    private List<T> list;

    public Group() {
        list = new ArrayList<>();
    }

    public void addPerson(T person) {
        list.add(person);
    }

    @Override
    public Iterator<T> iterator() {
//        return new StudentGroupIterator(list);
        return list.listIterator();
    }

    public List<T> getList() {
        return list;
    }

    public void sortByName() {
        list.sort(new CompareTByName<>());

    }

    public void sortByAge() {
        list.sort(new CompareTByAge<>());
    }
}
