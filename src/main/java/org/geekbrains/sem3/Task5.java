package org.geekbrains.sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.*/
public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList( //преобразование одинаковых по типу элементов в список и заполнение листа
                "Java", "42", "Python", "36"
        ));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) { //пока есть ссылка на следующий элемент продолжаем счет
            String elem = iterator.next(); //метод некст возвращает значение
            try { //пробуем распарсить
                Integer.parseInt(elem); // распарится ли даннный элемент в инт или нет
                iterator.remove(); // если да то ремув
            } catch (NumberFormatException ex) { //исключение если нет
            }
        }
        System.out.println("list = " + list);
    }
}
