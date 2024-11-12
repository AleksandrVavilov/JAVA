package org.geekbrains.JAVA.HW.OOP.CheckPoint.command;

import org.geekbrains.JAVA.HW.OOP.CheckPoint.presenter.NotebookPresenter;

public abstract class Command {
    String descriptions;
    NotebookPresenter notebookPresenter;

    public String getDescriptions() {
        return descriptions;
    }

    public Command(NotebookPresenter notebookPresenter) {
        this.notebookPresenter = notebookPresenter;
    }

    public abstract void execute();

}

