package org.geekbrains.JAVA.lection.lec2;

public class Task1 {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - starTime);
    }
}
