package org.geekbrains.JAVA.HW.OOP.HW5.view;

import org.geekbrains.JAVA.HW.OOP.HW5.model.Entity;

import java.util.List;

public interface PersonView<T extends Entity> {
    void displayPersons(List<T> person);

//    void setPresenter(TreePresenter presenter);
}
