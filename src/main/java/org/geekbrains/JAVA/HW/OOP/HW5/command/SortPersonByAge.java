package org.geekbrains.JAVA.HW.OOP.HW5.command;

import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;

public class SortPersonByAge extends Command {

    public SortPersonByAge(TreePresenter treePresenter) {
        super(treePresenter);
        descriptions = "Отсортировать по возрасту";

    }

    @Override
    public void execute() {
        treePresenter.sortPersonByAge();
    }
}