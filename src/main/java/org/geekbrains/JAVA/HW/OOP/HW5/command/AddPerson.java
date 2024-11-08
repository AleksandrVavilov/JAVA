package org.geekbrains.JAVA.HW.OOP.HW5.command;

import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;
import org.geekbrains.JAVA.OOP.sem5.view.ConsoleUi;

public class AddPerson extends Command {

    public AddPerson(TreePresenter treePresenter) {
        super(treePresenter);
        descriptions = "Добавить человека";

    }

    @Override
    public void execute() {
        treePresenter.addPerson();
    }
}