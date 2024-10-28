package org.geekbrains.JAVA.OOP.sem2.student_group;

import org.geekbrains.JAVA.OOP.sem2.student.comparators.CompareStudentAge;
import org.geekbrains.JAVA.OOP.sem2.student.comparators.CompareStudentByName;
import org.geekbrains.JAVA.OOP.sem2.student_group.iterators.StudentGroupIterator;
import org.geekbrains.JAVA.OOP.sem2.student.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> list;

    public StudentGroup() {
        list = new ArrayList<>();
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
//        return new StudentGroupIterator(list);
        return list.listIterator();
    }

    public List<Student> getList() {
        return list;
    }

    public void sortByName() {
        list.sort(new CompareStudentByName());

    }

    public void sortByAge() {
        list.sort(new CompareStudentAge());
    }
}
