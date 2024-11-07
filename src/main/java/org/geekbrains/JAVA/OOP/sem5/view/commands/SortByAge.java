package org.geekbrains.JAVA.OOP.sem5.view.commands;

import org.geekbrains.JAVA.OOP.sem5.view.ConsoleUi;

public class SortByAge extends Command {
    public SortByAge(ConsoleUi consoleUi) {
        super(consoleUi);
        descriptions = "Отсортировать по возрасту";

    }

    @Override
    public void execute() {
        consoleUi.sortByAge();
    }
}
