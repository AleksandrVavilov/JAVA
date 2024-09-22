package org.geekbrains.sem1;

//Дана строка. Поменять местами ее половины.
public class Task3 {
    public static void main(String[] args) {
        String str = "qweasdr";
        String result = str.substring(str.length() / 2) + str.substring(0, str.length() / 2);
        System.out.println("result = " + result);
    }
}
