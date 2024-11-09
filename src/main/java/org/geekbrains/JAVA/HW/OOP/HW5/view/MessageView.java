package org.geekbrains.JAVA.HW.OOP.HW5.view;

import org.geekbrains.JAVA.HW.OOP.HW5.model.Entity;

public interface MessageView<T extends Entity> {
    void displayMessage(String message);

//    void setPresenter(TreePresenter presenter);
}
