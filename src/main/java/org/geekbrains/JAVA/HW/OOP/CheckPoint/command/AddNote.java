package org.geekbrains.JAVA.HW.OOP.CheckPoint.command;


import org.geekbrains.JAVA.HW.OOP.CheckPoint.presenter.NotebookPresenter;

public class AddNote extends Command {

    public AddNote(NotebookPresenter notebookPresenter) {
        super(notebookPresenter);
        descriptions = "Добавить запись";

    }

    @Override
    public void execute() {
        notebookPresenter.addNote();
    }
}