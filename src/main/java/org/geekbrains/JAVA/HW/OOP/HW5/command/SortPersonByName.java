package org.geekbrains.JAVA.HW.OOP.HW5.command;

import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;

public class SortPersonByName extends Command {

    public SortPersonByName(TreePresenter treePresenter) {
        super(treePresenter);
        descriptions = "Отсортировать по имени";

    }

    @Override
    public void execute() {
        treePresenter.sortPersonByName();
    }
}