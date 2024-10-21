package org.geekbrains.JAVA.HW.API.HW5;
/*
Реализуйте программу для работы с простым справочником студентов.
Программа должна иметь следующие функции:
● addStudent(String name, Integer grade): Добавляет или
обновляет запись о студенте с именем name и оценкой grade. Если
студент уже существует, обновляет его оценку.
● findStudent(String name): Находит оценки студента по его имени.
Если студент существует, возвращает список его оценок. Если нет —
пустой список.
● getAllStudents(): Возвращает весь справочник студентов в виде
HashMap, где ключи — имена студентов, а значения — списки их оценок.
● removeStudent(String name): Удаляет запись о студенте по имени
из справочника. Если запись не существует, ничего не происходит.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentDir {
    public void main(String[] args) {
        addStudent("Vasya", 2);
        addStudent("Vasya", 3);
        addStudent("Vasya", 4);
        addStudent("Vasya", 5);
        addStudent("Petr", 2);
        addStudent("Petr", 3);
        addStudent("Petr", 4);
        addStudent("Petr", 5);
        addStudent("Ivan", 2);
        addStudent("Ivan", 3);
        addStudent("Ivan", 4);
        addStudent("Ivan", 5);
        System.out.println(findStudent("Ivan"));
        System.out.println(findStudent("Iva"));
        System.out.println(getAllStudents());
        removeStudent("Petr");
        System.out.println(getAllStudents());


    }

    private HashMap<String, ArrayList<Integer>> studentMap = new HashMap<>();

    public void addStudent(String name, Integer grade) {
        studentMap.computeIfAbsent(name, k -> new ArrayList<>()).add(grade); //нужно вернуть арлист, создали новый, а затем добавили в него значение
    }

    public ArrayList<Integer> findStudent(String name) {
        return studentMap.getOrDefault(name, new ArrayList<>()); //возвращает ключ, а если его нет то новый пустой список
    }

    public HashMap<String, ArrayList<Integer>> getAllStudents() {
        return studentMap;
    }

    public void removeStudent(String name) {
        studentMap.remove(name);
    }


}
