package org.geekbrains.exceptions.sem.sem2;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[strings.length - 1];
            test();
            int а = 1 / 0;
            inputStream = new FileInputStream(" sdafgdsaf ");
        } catch (StackOverflowError error) {
            System.out.println("Стек переполнен!");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println(" Я все равно выполнился !");
        }
        System.out.println(" Я жив !");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
