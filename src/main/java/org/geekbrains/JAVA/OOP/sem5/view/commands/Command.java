package org.geekbrains.JAVA.OOP.sem5.view.commands;

import org.geekbrains.JAVA.OOP.sem5.view.ConsoleUi;

public abstract class Command {
    String descriptions;
    ConsoleUi consoleUi;

    public String getDescriptions() {
        return descriptions;
    }

    public Command(ConsoleUi consoleUi) {
        this.consoleUi = consoleUi;
    }

    public abstract void execute();

}

