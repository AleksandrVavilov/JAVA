package org.geekbrains.JAVA.OOP.sem5.view.commands;

import org.geekbrains.JAVA.OOP.sem5.view.ConsoleUi;

public class AddStudent extends Command {
    public AddStudent(ConsoleUi consoleUi) {
        super(consoleUi);
        descriptions = "Создать студента";

    }

    @Override
    public void execute() {
        consoleUi.addStudent();
    }
}
