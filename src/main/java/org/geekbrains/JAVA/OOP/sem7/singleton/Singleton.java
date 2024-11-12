package org.geekbrains.JAVA.OOP.sem7.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    ;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton instance is working!");
    }
}