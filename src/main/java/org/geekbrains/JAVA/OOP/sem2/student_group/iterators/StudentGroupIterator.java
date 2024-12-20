package org.geekbrains.JAVA.OOP.sem2.student_group.iterators;

import org.geekbrains.JAVA.OOP.sem2.student.Student;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int index;
    private List<Student> list;

    public StudentGroupIterator(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Student next() {
        return list.get(index++);
    }
}
