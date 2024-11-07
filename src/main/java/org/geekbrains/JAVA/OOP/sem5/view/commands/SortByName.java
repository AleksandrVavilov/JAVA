package org.geekbrains.JAVA.OOP.sem5.view.commands;

import org.geekbrains.JAVA.OOP.sem5.view.ConsoleUi;

public class SortByName extends Command {
    public SortByName(ConsoleUi consoleUi) {
        super(consoleUi);
        descriptions = "Отсортировать по имени";

    }

    @Override
    public void execute() {
        consoleUi.sortByName();
    }
}
