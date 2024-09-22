package org.geekbrains.sem4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*Реализовать консольное приложение, которое:
        1. Принимает от пользователя строку вида
text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на
позицию num.
        3. Если введено print~num, выводит строку из позиции num в связном
списке и удаляет её из списка.*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> l1 = new LinkedList<>();
        while (true) {
            System.out.println("Введите строку формата text~num или print~num, где num позиция в списке, text - текст для добавления, print - для печати  и удаления ");
            System.out.println("Для выхода введите exit");
            String inp = scanner.nextLine();
            if (inp.equals("exit")) {
                break;
            }
            String[] input = inp.split("~");
            Integer num = Integer.parseInt(input[1]);
            if (!("print".equals(input[0]))) {
                if (l1.size() >= num) {
                    l1.add(num, input[0]);
                } else {
                    System.out.println("Такой позиции еще нет в списке, новый элемент помещен в конец");
                    l1.add(input[0]);
                }
            } else if (l1.size() >= num) {
                System.out.println((l1.get(Integer.parseInt((input[1])))));
                l1.remove(Integer.parseInt((input[1])));
            } else {
                System.out.println("Такой позиции еще нет в списке");
            }
        }

    }
}
