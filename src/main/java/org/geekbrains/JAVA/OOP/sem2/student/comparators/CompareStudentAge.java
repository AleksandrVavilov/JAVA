package org.geekbrains.JAVA.OOP.sem2.student.comparators;

import org.geekbrains.JAVA.OOP.sem2.student.Student;

import java.util.Comparator;

public class CompareStudentAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
//        return o1.getAge() - o2.getAge();
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
