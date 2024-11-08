package org.geekbrains.JAVA.HW.OOP.HW5.presenter;

import org.geekbrains.JAVA.HW.OOP.HW5.Entitys.Person;
import org.geekbrains.JAVA.HW.OOP.HW5.Service.FileOperation;
import org.geekbrains.JAVA.HW.OOP.HW5.Service.FileOperationImpl;
import org.geekbrains.JAVA.HW.OOP.HW5.view.Menu;
import org.geekbrains.JAVA.HW.OOP.HW5.view.Tree;
import org.geekbrains.JAVA.HW.OOP.HW5.view.TreeView;

import java.io.IOException;
import java.util.Scanner;

public class TreePresenter {
    private Tree<Person> familyTree;
    private TreeView view;
    private FileOperation<Person> fileOperation;
    private Scanner scanner;
    private boolean exit;
    private Menu menu = new Menu(this);

    public TreePresenter(Tree<Person> familyTree, TreeView view, FileOperationImpl<Person> fileOperation) {
        this.scanner = new Scanner(System.in);
        this.familyTree = familyTree;
        this.view = view;
        this.fileOperation = fileOperation;
//        this.view.setPresenter(this);
        exit = true;
    }

    public void addPerson() {
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите возраст");
        String ageString = scanner.nextLine();
        int age = Integer.parseInt(ageString);
        System.out.println("Введите пол");
        String sexString = scanner.nextLine();
        Person person = new Person(name, sexString, age);
        familyTree.addEntity(person);
        view.displayMessage("Добавлен новый член семьи: " + name);

    }

    public void showAllPersons() {
        view.displayPersons(familyTree.getMembers());
    }

    public void sortPersonByName() {
        familyTree.sortByName();
        view.displayMessage("Люди отсортированы по имени: ");
        showAllPersons();
    }

    public void sortPersonByAge() {
        familyTree.sortByAge();
        view.displayMessage("Люди отсортированы по возрасту: ");
        showAllPersons();
    }

    public void saveTree() {
        System.out.println("Задайте имя файла");
        String fileName = scanner.nextLine();
        try {
            fileOperation.saveToFile(familyTree, fileName);
            view.displayMessage("Дерево сохранено в файл: " + fileName);
        } catch (IOException e) {
            view.displayMessage("Ошибка записи файла: " + e.getMessage());
        }
    }

    public void loadTree() {
        System.out.println("Задайте имя файла");
        String fileName = scanner.nextLine();
        try {
            familyTree = fileOperation.loadFromFile(fileName);
            view.displayMessage("Дерево загружено из файла: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            view.displayMessage("Ошибка загрузки дерева: " + e.getMessage());
        }
    }

    public void start() {
        while (exit) {
            printMenu();
            execute();
        }
    }

    private void printMenu() {
        view.displayMessage(menu.menu());
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

}


