package org.geekbrains.JAVA.HW.OOP.CheckPoint.command;


import org.geekbrains.JAVA.HW.OOP.CheckPoint.presenter.NotebookPresenter;

public class ShowNotesForWeek extends Command {

    public ShowNotesForWeek(NotebookPresenter notebookPresenter) {
        super(notebookPresenter);
        descriptions = "Показать записи за неделю";

    }

    @Override
    public void execute() {
        notebookPresenter.showNotesForWeek();
    }
}