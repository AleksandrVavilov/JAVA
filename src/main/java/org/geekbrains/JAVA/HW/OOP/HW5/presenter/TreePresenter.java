package org.geekbrains.JAVA.HW.OOP.HW5.presenter;

import org.geekbrains.JAVA.HW.OOP.HW5.Entitys.Entity;
import org.geekbrains.JAVA.HW.OOP.HW5.Entitys.Person;
import org.geekbrains.JAVA.HW.OOP.HW5.Service.FileOperation;
import org.geekbrains.JAVA.HW.OOP.HW5.Service.FileOperationImpl;
import org.geekbrains.JAVA.HW.OOP.HW5.view.Tree;
import org.geekbrains.JAVA.HW.OOP.HW5.view.TreeView;

import java.io.IOException;
import java.util.List;

public class TreePresenter<T extends Entity> {
    private Tree<Person> familyTree;
    private TreeView view;
    private FileOperation<Person> fileOperation;

    public TreePresenter(Tree<Person> familyTree, TreeView view, FileOperationImpl<Person> fileOperation) {
        this.familyTree = familyTree;
        this.view = view;
        this.fileOperation = fileOperation;
        this.view.setPresenter(this);
    }

    public void addPerson(String name, String sex, int age) {
        Person person = new Person(name, sex, age);
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

    public void saveTree(String fileName) {
        try {
            fileOperation.saveToFile(familyTree, fileName);
            view.displayMessage("Дерево сохранено в файл: " + fileName);
        } catch (IOException e) {
            view.displayMessage("Ошибка записи файла: " + e.getMessage());
        }
    }

    public void loadTree(String fileName) {
        try {
            familyTree = fileOperation.loadFromFile(fileName);
            view.displayMessage("Дерево загружено из файла: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            view.displayMessage("Ошибка загрузки дерева: " + e.getMessage());
        }
    }

    public void handleUserInput() {
        while (true) {
            view.displayMessage("Введите команду (add, list, sortByName, sortByAge, save, load, exit):");
            String command = view.getUserInput();
            switch (command) {
                case "add":
                    view.displayMessage("Введите имя:");
                    String name = view.getUserInput();
                    view.displayMessage("Введите возраст:");
                    int age = Integer.parseInt(view.getUserInput());
                    view.displayMessage("Введите пол:");
                    String sex = view.getUserInput();
                    addPerson(name, sex, age);
                    break;
                case "list":
                    showAllPersons();
                    break;
                case "sortByName":
                    familyTree.sortByName();
                    break;
                case "sortByAge":
                    familyTree.sortByAge();
                    break;
                case "save":
                    view.displayMessage("Задайте имя:");
                    saveTree(view.getUserInput());
                    break;
                case "load":
                    view.displayMessage("Задайте имя:");
                    loadTree(view.getUserInput());
                    break;
                case "exit":
                    return;
                default:
                    view.displayMessage("Неизвестная команда");
            }

        }
    }

}
