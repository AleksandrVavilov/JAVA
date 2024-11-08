package org.geekbrains.JAVA.HW.OOP.HW5.command;

import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;
import org.geekbrains.JAVA.HW.OOP.HW5.view.ConsoleTreeView;

public class Finish extends Command {
    public Finish(TreePresenter treePresenter) {
        super(treePresenter);
        descriptions = "Выход";

    }

    @Override
    public void execute() {
        treePresenter.finish();
    }
}
