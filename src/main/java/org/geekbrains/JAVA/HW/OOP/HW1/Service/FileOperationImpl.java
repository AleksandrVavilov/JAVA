package org.geekbrains.JAVA.HW.OOP.HW1.Service;

import org.geekbrains.JAVA.HW.OOP.HW1.Trees.Tree;

import java.io.*;

public class FileOperationImpl implements FileOperation {
    @Override
    public void saveToFile(Tree tree, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) { //object Преобразует объект в байты, файл запись в файл, блок трай сам закроет поток
            oos.writeObject(tree); //непосредственно команда записи в файл
        }
    }

    @Override
    public Tree loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream((new FileInputStream(fileName)))) { //обжект преобразует байты в объект, файл читает из файла
            return (Tree) ois.readObject();
        }
    }
}
