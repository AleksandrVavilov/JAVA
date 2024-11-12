package org.geekbrains.JAVA.HW.OOP.CheckPoint.command;


import org.geekbrains.JAVA.HW.OOP.CheckPoint.presenter.NotebookPresenter;

public class Save extends Command {

    public Save(NotebookPresenter notebookPresenter) {
        super(notebookPresenter);
        descriptions = "Записать блокнот в файл";

    }

    @Override
    public void execute() {
        notebookPresenter.saveNotes();
    }
}