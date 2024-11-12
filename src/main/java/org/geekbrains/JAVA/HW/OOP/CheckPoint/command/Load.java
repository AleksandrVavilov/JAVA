package org.geekbrains.JAVA.HW.OOP.CheckPoint.command;


import org.geekbrains.JAVA.HW.OOP.CheckPoint.presenter.NotebookPresenter;

public class Load extends Command {

    public Load(NotebookPresenter notebookPresenter) {
        super(notebookPresenter);
        descriptions = "Загрузить блокнот из файла";

    }

    @Override
    public void execute() {
        notebookPresenter.loadNotes();
    }
}