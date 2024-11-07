package org.geekbrains.JAVA.HW.OOP.HW5.view;

import org.geekbrains.JAVA.HW.OOP.HW5.Entitys.Person;
import org.geekbrains.JAVA.HW.OOP.HW5.Entitys.Entity;
import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;

import java.util.List;

public interface TreeView<T extends Entity> {
    void displayMessage(String message);

    void displayPersons(List<T> person);

    String getUserInput();

    void setPresenter(TreePresenter presenter);
}
