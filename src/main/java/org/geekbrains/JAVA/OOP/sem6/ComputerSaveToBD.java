package org.geekbrains.JAVA.OOP.sem6;

public class ComputerSaveToBD implements Save {
    @Override
    public void save() {
        System.out.println("Данные записаны в БД");
    }

    @Override
    public void load() {
        System.out.println("Данные считаны из БД");
    }
}
