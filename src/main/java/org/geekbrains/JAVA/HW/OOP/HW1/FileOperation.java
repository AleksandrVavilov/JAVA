package org.geekbrains.JAVA.HW.OOP.HW1;

import java.io.IOException;

public interface FileOperation {
    void saveToFile(FamilyTree familyTree, String fileName) throws IOException;

    FamilyTree loadFromFile(String fileName) throws IOException, ClassNotFoundException;

}

