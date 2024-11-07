package org.geekbrains.JAVA.HW.OOP.HW5;

import org.geekbrains.JAVA.HW.OOP.HW5.Entitys.Entity;
import org.geekbrains.JAVA.HW.OOP.HW5.Entitys.Person;
import org.geekbrains.JAVA.HW.OOP.HW5.Service.FileOperation;
import org.geekbrains.JAVA.HW.OOP.HW5.Service.FileOperationImpl;

import java.io.IOException;
import java.util.Scanner;

public class CommandManager {
    private org.geekbrains.JAVA.HW.OOP.HW5.view.Tree<Entity> Tree;
    private Scanner scanner;
    private FileOperation fileOps;

    public CommandManager(org.geekbrains.JAVA.HW.OOP.HW5.view.Tree<Entity> Tree) {
        this.Tree = Tree;
        this.scanner = new Scanner(System.in);
        this.fileOps = new FileOperationImpl();
    }

    public void start() {
        while (true) {
            System.out.println("Введите цифру команды (1 - add, 2 - list, 3 - sortByName, 4 - sortByAge,  5 - save, 6 - load,  7 - exit): ");
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    addEntity();
                    break;
                case "2":
                    System.out.println(this.Tree);
                    break;
                case "3":
                    this.Tree.sortByName();
                    System.out.println(this.Tree);
                    break;
                case "4":
                    try {
                        System.out.println("Введите название файла в формате 'Tree.dat'");
                        String fileName = scanner.nextLine();
                        fileOps.saveToFile(this.Tree, fileName);
                        System.out.println("Tree " + fileName + " saved to file.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "5":
                    org.geekbrains.JAVA.HW.OOP.HW5.view.Tree loadTree = null;
                    try {
                        System.out.println("Введите название файла в формате 'Tree.dat'");
                        String fileName = scanner.nextLine();
                        loadTree = fileOps.loadFromFile(fileName);
                        System.out.println("Tree " + fileName + " loaded from file.");
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (loadTree != null) {
                        this.Tree = loadTree;
                        System.out.println(Tree);
                    }
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Неизвестная команда");
            }


        }
    }

    private void addEntity() {
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите пол: ");
        String sex = scanner.nextLine();
        this.Tree.addEntity(new Person(name, sex, age));
    }
}
