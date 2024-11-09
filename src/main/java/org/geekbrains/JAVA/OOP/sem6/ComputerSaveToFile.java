package org.geekbrains.JAVA.OOP.sem6;

public class ComputerSaveToFile implements Save {
    @Override
    public void save() {
        System.out.println("Данные записаны в файл");
    }

    @Override
    public void load() {
        System.out.println("Данные считаны из файла");
    }
}
