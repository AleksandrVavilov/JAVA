package org.geekbrains.JAVA.HW.OOP.CheckPoint.command;


import org.geekbrains.JAVA.HW.OOP.CheckPoint.presenter.NotebookPresenter;

public class ShowNotesForDay extends Command {

    public ShowNotesForDay(NotebookPresenter notebookPresenter) {
        super(notebookPresenter);
        descriptions = "Показать записи за день";

    }

    @Override
    public void execute() {
        notebookPresenter.showNotesForDay();
    }
}