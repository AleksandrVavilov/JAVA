package org.geekbrains.JAVA.HW.OOP.HW5.command;

import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;

public class Save extends Command {

    public Save(TreePresenter treePresenter) {
        super(treePresenter);
        descriptions = "Сохранить дерево в файл";

    }

    @Override
    public void execute() {
        treePresenter.saveTree();
    }
}