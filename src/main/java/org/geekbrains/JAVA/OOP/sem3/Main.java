package org.geekbrains.JAVA.OOP.sem3;

import org.geekbrains.JAVA.OOP.sem3.service.Service;
import org.geekbrains.JAVA.OOP.sem3.student.Student;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student(1, "Паша", 18);
//        Student student2 = new Student(2, "Маша", 19);
//        StudentGroup studentGroup = new StudentGroup();
//        studentGroup.addEntity(student1);
//        studentGroup.addEntity(student2);
//        Student student3 = new Student(2, "Витя", 20);
        Service<Student> student = new Service();
        student.addPerson("Паша", 18);
        student.addPerson("Маша", 19);
        student.addPerson("Даша", 20);
        System.out.println(student.PersonGroupInfo());
        student.sortByName();
        System.out.println(student.PersonGroupInfo());
        student.sortByAge();
        System.out.println(student.PersonGroupInfo());
    }

}
