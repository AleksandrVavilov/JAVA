package org.geekbrains.JAVA.HW.OOP.HW5.view;

import org.geekbrains.JAVA.HW.OOP.HW5.Entitys.Entity;
import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;

import java.util.List;


public class ConsoleTreeView<T extends Entity> implements TreeView<T> {
//    private TreePresenter presenter;


    @Override
    public void displayMessage(String message) {
        System.out.println(message);

    }

    @Override
    public void displayPersons(List<T> persons) {
        for (T person : persons) {
            System.out.println(person.getName() + ", возраст " + person.getAge());

        }
    }

//    @Override
//    public void setPresenter(TreePresenter presenter) {
//        this.presenter = presenter;
//
//    }


}