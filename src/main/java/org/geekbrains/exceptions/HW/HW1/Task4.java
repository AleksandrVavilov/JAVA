package org.geekbrains.exceptions.HW.HW1;

/*Реализуйте метод findAndReplace, который принимает массив строк, строку
для поиска и строку для замены. Если искомая строка не найдена, добавьте
сообщение об ошибке в список. Верните новый массив строк с выполненной
заменой.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task4 {
    public static void main(String[] args) {
        List<String> errors = new ArrayList<>();
        String find = "Саша";
        String replace = "Маша";
        String[] array = {"Шла", "Саша", "по", "шоссе", "и", "сосала", "сушку"};
        String[] result = new Answer1().findAndReplace(array, find, replace, errors);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
        if (!errors.isEmpty()) System.out.println("Список ошибок:" + errors.toString());
        else System.out.println("Ошибок не обнаружено!");

    }
}

class Answer1 {
    public static String[] findAndReplace(String[] arr, String find, String replace, List<String> err) {
        boolean flag = false;
        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            if (arr[i].equals(find)) {
                result[i] = replace;
                flag = true;
            } else {
                result[i] = arr[i];
            }
        }
        if (flag == false) err.add("Искомая строка " + find + " не найдена");
        else System.out.println("Строка заменена!");
        return result;
    }
}

