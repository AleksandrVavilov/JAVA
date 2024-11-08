package org.geekbrains.JAVA.HW.OOP.HW5.command;

import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;

public class Load extends Command {

    public Load(TreePresenter treePresenter) {
        super(treePresenter);
        descriptions = "Загрузить дерево из файла";

    }

    @Override
    public void execute() {
        treePresenter.loadTree();
    }
}