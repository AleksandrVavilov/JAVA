package org.geekbrains.JAVA.lection.lec4.Ex003Math.Client;

import java.util.Scanner;

import org.geekbrains.JAVA.lection.lec4.Ex003Math.Core.Views.View;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    }

    ;

    @Override
    public void set(String value) {
        System.out.println(value);

    }
}
