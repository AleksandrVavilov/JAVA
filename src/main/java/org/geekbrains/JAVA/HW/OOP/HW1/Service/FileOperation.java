package org.geekbrains.JAVA.HW.OOP.HW1.Service;

import org.geekbrains.JAVA.HW.OOP.HW1.Trees.FamilyTree;

import java.io.IOException;

public interface FileOperation {
    void saveToFile(FamilyTree familyTree, String fileName) throws IOException;

    FamilyTree loadFromFile(String fileName) throws IOException, ClassNotFoundException;

}

