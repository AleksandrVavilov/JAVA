package org.geekbrains.JAVA.sem5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */
public class Task1 {
    private static final Map<Integer, String> passportToName = new TreeMap<>();

    public static void run() {
        Map<Integer, String> pasToName =
                Map.of(
                        123456, "Иванов",
                        321456, "Васильев",
                        1234123, "Петров",
                        334345, "Васильев",
                        1243545656, "Иванова",
                        324326, "Иванов"
                );
//        System.out.println(pasToName);
        passportToName.put(123456, "Иванов");
        passportToName.put(321456, "Васильев");
        passportToName.put(1234123, "Петров");
        passportToName.put(334345, "Васильев");
        passportToName.put(1243545656, "Иванова");
        passportToName.put(324326, "Иванов");
        System.out.println(passportToName);
        for (Map.Entry<Integer, String> entry : passportToName.entrySet()) {
            if (entry.getValue().equals("Иванов")) {
                System.out.println(entry);
            }
        }
    }
}



