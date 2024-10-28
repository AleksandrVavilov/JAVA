package org.geekbrains.JAVA.OOP.sem2.student.comparators;

import org.geekbrains.JAVA.OOP.sem2.student.Student;

import java.util.Comparator;

public class CompareStudentByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

