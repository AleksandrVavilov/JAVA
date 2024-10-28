package org.geekbrains.JAVA.OOP.sem2.service;

import org.geekbrains.JAVA.OOP.sem2.student.Student;
import org.geekbrains.JAVA.OOP.sem2.student_group.StudentGroup;

public class Service {
    private int GenStudentId;
    StudentGroup studentGroup = new StudentGroup();

    public Service() {
        this.studentGroup = new StudentGroup();
    }

    public void addStudent(String name, int age) {
        Student student = new Student(GenStudentId++, name, age);
        studentGroup.addStudent(student);

    }

    public String studentGroupInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список студентов:\n");
        for (Student student : studentGroup) {
            sb.append(student);
            sb.append("\n");
        }

//        Iterator<Student> iterator = studentGroup.iterator();
//        while (iterator.hasNext()) {
//            Student new_student = iterator.next();
//            sb.append(new_student);
//            sb.append("\n");
//        }

        return sb.toString();
    }

    public void sortByName() {
        studentGroup.sortByName();
    }

    public void sortByAge() {
        studentGroup.sortByAge();
    }
}
