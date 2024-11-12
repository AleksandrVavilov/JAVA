package org.geekbrains.JAVA.OOP.sem7.decorator;

public class JuniorDev implements Developer {
    @Override
    public void makeJob() {
        writeCode();
    }

    private void writeCode() {
        System.out.println("Пишем код");
    }

}
