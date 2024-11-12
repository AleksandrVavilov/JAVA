package org.geekbrains.JAVA.HW.OOP.CheckPoint.view;

import org.geekbrains.JAVA.HW.OOP.CheckPoint.command.*;
import org.geekbrains.JAVA.HW.OOP.CheckPoint.presenter.NotebookPresenter;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Command> commandList;

    public Menu(NotebookPresenter notebookPresenter) {
        commandList = new ArrayList<>();
        commandList.add(new AddNote(notebookPresenter));
        commandList.add(new ShowNotesForDay(notebookPresenter));
        commandList.add(new ShowNotesForWeek(notebookPresenter));
        commandList.add(new Save(notebookPresenter));
        commandList.add(new Load(notebookPresenter));
    }

    public String menu() {
        System.out.println("Добрый день! Выберите одно из действий: ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            sb.append(i + 1);
            sb.append(". ");
            sb.append(commandList.get(i).getDescriptions());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void execute(int choice) {
        Command command = commandList.get(choice - 1);
        command.execute();
    }

    public int getSize() {
        return commandList.size();
    }

}
