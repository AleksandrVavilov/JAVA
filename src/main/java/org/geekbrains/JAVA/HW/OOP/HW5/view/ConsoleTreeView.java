package org.geekbrains.JAVA.HW.OOP.HW5.view;

import org.geekbrains.JAVA.HW.OOP.HW5.Entitys.Entity;
import org.geekbrains.JAVA.HW.OOP.HW5.Entitys.Person;
import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;

import java.util.List;
import java.util.Scanner;

public class ConsoleTreeView<T extends Entity> implements TreeView<T> {
    private TreePresenter presenter;
    private Scanner scanner;

    public ConsoleTreeView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);

    }

    @Override
    public void displayPersons(List<T> persons) {
        for (T person : persons) {
            System.out.println(person.getName() + ", age" + person.getAge());

        }
    }

    @Override
    public String getUserInput() {
        return scanner.nextLine();
    }

    @Override
    public void setPresenter(TreePresenter presenter) {
        this.presenter = presenter;

    }
}
