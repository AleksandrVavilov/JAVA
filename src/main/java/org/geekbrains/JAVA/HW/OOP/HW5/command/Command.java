package org.geekbrains.JAVA.HW.OOP.HW5.command;

import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;
import org.geekbrains.JAVA.HW.OOP.HW5.view.ConsoleTreeView;

public abstract class Command {
    String descriptions;
    TreePresenter treePresenter;

    public String getDescriptions() {
        return descriptions;
    }

    public Command(TreePresenter treePresenter) {
        this.treePresenter = treePresenter;
    }

    public abstract void execute();

}

