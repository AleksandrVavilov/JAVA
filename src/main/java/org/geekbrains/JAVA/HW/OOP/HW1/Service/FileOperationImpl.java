package org.geekbrains.JAVA.HW.OOP.HW1.Service;

import org.geekbrains.JAVA.HW.OOP.HW1.Trees.FamilyTree;

import java.io.*;

public class FileOperationImpl implements FileOperation {
    @Override
    public void saveToFile(FamilyTree familyTree, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) { //object Преобразует объект в байты, файл запись в файл, блок трай сам закроет поток
            oos.writeObject(familyTree); //непосредственно команда записи в файл
        }
    }

    @Override
    public FamilyTree loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream((new FileInputStream(fileName)))) { //обжект преобразует байты в объект, файл читает из файла
            return (FamilyTree) ois.readObject();
        }
    }
}
