package org.geekbrains.JAVA.OOP.sem5.view.commands;

import org.geekbrains.JAVA.OOP.sem5.view.ConsoleUi;

public class GetStudentInfo extends Command {
    public GetStudentInfo(ConsoleUi consoleUi) {
        super(consoleUi);
        descriptions = "Получить список студентов";

    }

    @Override
    public void execute() {
        consoleUi.printStudentGroup();
    }
}
