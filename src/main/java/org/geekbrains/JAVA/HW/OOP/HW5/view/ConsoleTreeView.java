package org.geekbrains.JAVA.HW.OOP.HW5.view;

import org.geekbrains.JAVA.HW.OOP.HW5.model.Entity;

import java.util.List;
import java.util.Scanner;


public class ConsoleTreeView<T extends Entity> implements MessageView<T>, PersonView<T>, InputView {
    //    private TreePresenter presenter;
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
//            System.out.println(person.getName() + ", возраст " + person.getAge());
            System.out.println(person);

        }
    }

    @Override
    public String getUserInput() {
        return scanner.nextLine();
    }

//    @Override
//    public void setPresenter(TreePresenter presenter) {
//        this.presenter = presenter;
//
//    }


}