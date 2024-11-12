package org.geekbrains.JAVA.OOP.sem7.decorator;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new JuniorDev();
        Developer developer2 = new MiddleDev(developer1);

        developer2.makeJob();
    }
}
