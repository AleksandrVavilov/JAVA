package org.geekbrains.JAVA.HW.API.HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Реализуйте метод, который принимает на вход массив строк и возвращает
//        новый массив, содержащий только строки, длина которых больше 3 символов.
public class Task3 {
    public static void main(String[] args) {
        String[] str = new String[]{"cat", "elephant", "dog", "giraffe"};
        System.out.println(Arrays.toString(clearStr(str)));
    }

    private static String[] clearStr(String[] str) {
        ArrayList<String> arr = new ArrayList<>();
        for (String s : str) {
            if (s.length() > 3) arr.add(s);
        }
        return arr.toArray(new String[arr.size()]);
    }
}

