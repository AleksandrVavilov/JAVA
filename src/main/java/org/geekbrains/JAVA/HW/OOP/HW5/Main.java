package org.geekbrains.JAVA.HW.OOP.HW5;


import org.geekbrains.JAVA.HW.OOP.HW5.Entitys.Person;
import org.geekbrains.JAVA.HW.OOP.HW5.Service.FileOperation;
import org.geekbrains.JAVA.HW.OOP.HW5.Service.FileOperationImpl;
import org.geekbrains.JAVA.HW.OOP.HW5.presenter.TreePresenter;
import org.geekbrains.JAVA.HW.OOP.HW5.view.ConsoleTreeView;
import org.geekbrains.JAVA.HW.OOP.HW5.view.Tree;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Tree<Person> familyTree = new Tree<>();
        ConsoleTreeView view = new ConsoleTreeView();
        FileOperationImpl<Person> fileOperations = new FileOperationImpl<>();
        TreePresenter presenter = new TreePresenter(familyTree, view, fileOperations);
        presenter.start();
    }
}