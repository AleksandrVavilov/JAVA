package org.geekbrains.JAVA.OOP.sem5.presenter;

import org.geekbrains.JAVA.OOP.sem5.model.service.Service;
import org.geekbrains.JAVA.OOP.sem5.view.View;

public class Presenter {
    private final View view;
    private final Service service;

    public Presenter(View consoleView) {
        service = new Service();
        view = consoleView;
    }

    public void addStudent(String name, int age) {
        service.addPerson(name, age);
        view.printAnswer("Студент добавлен в список!");
    }

    public void printStudentInfo() {
        view.printAnswer(service.PersonGroupInfo());
    }

    public void sortByName() {
        service.sortByName();
        printStudentInfo();
    }

    public void sortByAge() {
        service.sortByAge();
        printStudentInfo();
    }
}
