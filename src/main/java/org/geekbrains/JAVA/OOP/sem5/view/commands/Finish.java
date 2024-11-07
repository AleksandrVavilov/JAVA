package org.geekbrains.JAVA.OOP.sem5.view.commands;

import org.geekbrains.JAVA.OOP.sem5.view.ConsoleUi;

public class Finish extends Command {
    public Finish(ConsoleUi consoleUi) {
        super(consoleUi);
        descriptions = "Выход";

    }

    @Override
    public void execute() {
        consoleUi.finish();
    }
}
