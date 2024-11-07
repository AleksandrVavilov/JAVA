package org.geekbrains.JAVA.OOP.sem5.view;

import org.geekbrains.JAVA.OOP.sem5.view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Command> commandList;

    public Menu(ConsoleUi consoleUi) {
        commandList = new ArrayList<>();
        commandList.add(new AddStudent(consoleUi));
        commandList.add(new GetStudentInfo(consoleUi));
        commandList.add(new SortByName(consoleUi));
        commandList.add(new SortByAge(consoleUi));
        commandList.add(new Finish(consoleUi));
    }

    String menu() {
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
