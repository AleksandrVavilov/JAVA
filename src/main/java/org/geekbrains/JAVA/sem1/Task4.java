package org.geekbrains.JAVA.sem1;

import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("Hello World");
        fw.flush();
        fw.close();

    }
}
