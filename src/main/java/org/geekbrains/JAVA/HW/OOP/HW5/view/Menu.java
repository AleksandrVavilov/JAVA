package org.geekbrains.JAVA.HW.OOP.HW5.view;

import org.geekbrains.JAVA.HW.OOP.HW5.command.*;
import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Command> commandList;

    public Menu(TreePresenter treePresenter) {
        commandList = new ArrayList<>();
        commandList.add(new AddPerson(treePresenter));
        commandList.add(new ShowAllPerson(treePresenter));
        commandList.add(new SortPersonByName(treePresenter));
        commandList.add(new SortPersonByAge(treePresenter));
        commandList.add(new Save(treePresenter));
        commandList.add(new Load(treePresenter));
        commandList.add(new Finish(treePresenter));
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
