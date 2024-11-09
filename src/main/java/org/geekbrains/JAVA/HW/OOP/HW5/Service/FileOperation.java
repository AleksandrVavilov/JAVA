package org.geekbrains.JAVA.HW.OOP.HW5.Service;

import org.geekbrains.JAVA.HW.OOP.HW5.model.Entity;
import org.geekbrains.JAVA.HW.OOP.HW5.model.Tree;

import java.io.IOException;

public interface FileOperation<T extends Entity> {
    void saveToFile(Tree<T> tree, String fileName) throws IOException;

    Tree<T> loadFromFile(String fileName) throws IOException, ClassNotFoundException;

}

