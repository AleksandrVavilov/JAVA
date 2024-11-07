package org.geekbrains.JAVA.HW.OOP.HW5.Service;

import org.geekbrains.JAVA.HW.OOP.HW1.Entitys.Entity;
import org.geekbrains.JAVA.HW.OOP.HW5.view.Tree;

import java.io.*;

public class FileOperationImpl<T extends org.geekbrains.JAVA.HW.OOP.HW5.Entitys.Entity> implements FileOperation<T> {
    @Override
    public void saveToFile(Tree<T> tree, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) { //object Преобразует объект в байты, файл запись в файл, блок трай сам закроет поток
            oos.writeObject(tree); //непосредственно команда записи в файл
        }
    }

    @Override
    public Tree<T> loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream((new FileInputStream(fileName)))) { //обжект преобразует байты в объект, файл читает из файла
            return (Tree<T>) ois.readObject();
        }
    }
}
