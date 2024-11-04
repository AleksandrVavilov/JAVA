package org.geekbrains.JAVA.HW.OOP.HW1.Service;

import org.geekbrains.JAVA.HW.OOP.HW1.Trees.Tree;

import java.io.IOException;

public interface FileOperation {
    void saveToFile(Tree tree, String fileName) throws IOException;

    Tree loadFromFile(String fileName) throws IOException, ClassNotFoundException;

}

