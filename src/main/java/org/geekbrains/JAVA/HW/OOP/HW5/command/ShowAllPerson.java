package org.geekbrains.JAVA.HW.OOP.HW5.command;

import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;

public class ShowAllPerson extends Command {

    public ShowAllPerson(TreePresenter treePresenter) {
        super(treePresenter);
        descriptions = "Показать все дерево";

    }

    @Override
    public void execute() {
        treePresenter.showAllPersons();
    }
}