package org.geekbrains.JAVA.lection.lec3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2809); //добавляем элемент в список
        list.add(2810);
        list.add(2811);
        list.add(2812);
        System.out.println(list.get(2)); // возвращает по индексу
        System.out.println(list.indexOf(2810)); //первое вхождение или -1
        System.out.println(list.lastIndexOf(999)); // такого нет значит -1
        System.out.println(list.remove(1)); // удаление по идексу и возврат
        list.set(0, 2807); //присвоили нулевому значение
        list.sort(Comparator.reverseOrder()); //обратная сортировка
        System.out.println(list.subList(0, 2)); //получение элементов по позиции от до

        System.out.println();
//toArray(), toArray(type array) преобразование в массив, массив типа
//        list.clear(); // Очистка списка
        System.out.println(list.toString()); //преобразованеи в строку
        System.out.println(list.containsAll(list)); //проверяем включение всех элементов из коллекции
//        System.out.println(list.removeAll(list)); //удаляет все элементы (коллекции) из коллекции
        System.out.println(list.containsAll(list)); //оставляет все элементы (коллекции) из коллекции находит пересечение
        System.out.println();
        int[] arr = new int[]{11, 21, 31};
        System.out.println(Arrays.asList(arr)); // массив в список
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }


        System.out.println();

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
