package org.geekbrains.JAVA.OOP.sem3.service;

import org.geekbrains.JAVA.OOP.sem3.group.StudyElement;
import org.geekbrains.JAVA.OOP.sem3.student.Student;
import org.geekbrains.JAVA.OOP.sem3.group.Group;

public class Service<T extends StudyElement> {
    private int GenId;
    Group<StudyElement> Group = new Group();

    public Service() {
        this.Group = new Group();
    }

    public void addPerson(String name, int age) {
        StudyElement person = new Student(GenId++, name, age);
        Group.addPerson(person);

    }

    public String PersonGroupInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список людей:\n");
        for (StudyElement person : Group) {
            sb.append(person);
            sb.append("\n");
        }

//        Iterator<Student> iterator = Group.iterator();
//        while (iterator.hasNext()) {
//            Student new_student = iterator.next();
//            sb.append(new_student);
//            sb.append("\n");
//        }

        return sb.toString();
    }

    public void sortByName() {
        Group.sortByName();
    }

    public void sortByAge() {
        Group.sortByAge();
    }
}
