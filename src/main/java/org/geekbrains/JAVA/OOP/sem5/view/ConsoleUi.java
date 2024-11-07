package org.geekbrains.JAVA.OOP.sem5.view;

import org.geekbrains.JAVA.OOP.sem5.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUi implements View {

    private final Scanner scanner;
    private final Presenter presenter;
    private boolean exit;
    private Menu menu;

    public ConsoleUi() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        exit = true;
        menu = new Menu(this);
    }

    @Override
    public void start() {
        while (exit) {
            printMenu();
            execute();
        }
    }

    private void printMenu() {
        printAnswer(menu.menu());
    }

    private void execute() {
        String line = scanner.nextLine();
        if (checkTextForInt(line)) {
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)) {
                menu.execute(numCommand);
            }
        }
    }

    private boolean checkCommand(int numCommand) {
        if (numCommand <= menu.getSize()) {
            return true;
        } else {
            showError();
            return false;
        }
    }

    private boolean checkTextForInt(String text) {
        if (text.matches("[0-9]+")) {
            return true;
        } else {
            showError();
            return false;
        }
    }

    public static void showError() {
        System.out.println("Неверный ввод команды! Попробуйте снова");
    }

    public void finish() {
        exit = false;
        System.out.println("Всего доброго!");
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void printStudentGroup() {
        presenter.printStudentInfo();
    }

    public void addStudent() {
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите возраст");
        String ageString = scanner.nextLine();
        int age = Integer.parseInt(ageString);
        presenter.addStudent(name, age);
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}


