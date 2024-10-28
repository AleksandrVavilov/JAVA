package org.geekbrains.JAVA.OOP.sem2;

import org.geekbrains.JAVA.OOP.sem2.service.Service;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student(1, "Паша", 18);
//        Student student2 = new Student(2, "Маша", 19);
//        StudentGroup studentGroup = new StudentGroup();
//        studentGroup.addStudent(student1);
//        studentGroup.addStudent(student2);
//        Student student3 = new Student(2, "Витя", 20);
        Service service = new Service();
        service.addStudent("Паша", 18);
        service.addStudent("Маша", 19);
        service.addStudent("Даша", 20);
        System.out.println(service.studentGroupInfo());
        service.sortByName();
        System.out.println(service.studentGroupInfo());
        service.sortByAge();
        System.out.println(service.studentGroupInfo());
    }

}
