package org.geekbrains.JAVA.HW.OOP.HW5.presenter;

import org.geekbrains.JAVA.HW.OOP.HW5.model.Person;
import org.geekbrains.JAVA.HW.OOP.HW5.Service.FileOperation;
import org.geekbrains.JAVA.HW.OOP.HW5.Service.FileOperationImpl;
import org.geekbrains.JAVA.HW.OOP.HW5.model.Tree;
import org.geekbrains.JAVA.HW.OOP.HW5.view.*;

import java.io.IOException;

public class TreePresenter {
    private Tree<Person> familyTree;
    private MessageView mview;
    private PersonView pview;
    private InputView iview;
    private FileOperation<Person> fileOperation;
    private boolean exit;
    private Menu menu = new Menu(this);

    public TreePresenter(Tree<Person> familyTree, MessageView mview, PersonView pview, InputView iview, FileOperationImpl<Person> fileOperation) {
        this.familyTree = familyTree;
        this.mview = mview;
        this.pview = pview;
        this.iview = iview;
        this.fileOperation = fileOperation;
//        this.view.setPresenter(this);
        exit = true;
    }

    public void addPerson() {
        System.out.println("Введите имя");
        String name = iview.getUserInput();
        System.out.println("Введите возраст");
        String ageString = iview.getUserInput();
        int age = Integer.parseInt(ageString);
        System.out.println("Введите пол");
        String sexString = iview.getUserInput();
        Person person = new Person(name, sexString, age);
        familyTree.addEntity(person);
        mview.displayMessage("Добавлен новый член семьи: " + name);

    }

    public void showAllPersons() {
        pview.displayPersons(familyTree.getMembers());
    }

    public void sortPersonByName() {
        familyTree.sortByName();
        mview.displayMessage("Люди отсортированы по имени: ");
        showAllPersons();
    }

    public void sortPersonByAge() {
        familyTree.sortByAge();
        mview.displayMessage("Люди отсортированы по возрасту: ");
        showAllPersons();
    }

    public void saveTree() {
        System.out.println("Задайте имя файла");
        String fileName = iview.getUserInput();
        try {
            fileOperation.saveToFile(familyTree, fileName);
            mview.displayMessage("Дерево сохранено в файл: " + fileName);
        } catch (IOException e) {
            mview.displayMessage("Ошибка записи файла: " + e.getMessage());
        }
    }

    public void loadTree() {
        System.out.println("Задайте имя файла");
        String fileName = iview.getUserInput();
        try {
            familyTree = fileOperation.loadFromFile(fileName);
            mview.displayMessage("Дерево загружено из файла: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            mview.displayMessage("Ошибка загрузки дерева: " + e.getMessage());
        }
    }

    public void start() {
        while (exit) {
            printMenu();
            execute();
        }
    }

    private void printMenu() {
        mview.displayMessage(menu.menu());
    }

    private void execute() {
        String line = iview.getUserInput();
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


