package org.geekbrains.JAVA.lection.lec2;

public class StringWork {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - starTime);

        String str1 = "str1";
        String str2 = "str2";
        String str3 = str1.concat(str2); // конкатинация, сложение строк
        System.out.println(str3);
        String str4 = String.join(",", "str1", "str2"); // объединение строк с разделителем
        System.out.println(str4);
        System.out.println(str4.charAt(4)); //получения символа строки по индексу
        System.out.println(str4.lastIndexOf("tr")); // Последний индекс вхождения подстроки - 6
        System.out.println(str4.indexOf("tr")); // Первый индекс вхождения подстроки - 1
        System.out.println(str4.startsWith("str")); // Начинается ли строка с подстроки (True\False)
        System.out.println(str4.endsWith("1")); //  ЗАканчивается ли подстрока строкой (True\False)
        System.out.println(str4.replace(",", "%%%")); //  Замена одной подстроки на другую


        String str5 = "  s t r i n g   ";
        System.out.println(str5.trim()); //удаляет начальные и конечные пробелы
        System.out.println(str5.substring(2, 5)); //возвращает подстроку (начало конец по индексу)
        System.out.println(str5.toUpperCase()); // в верхний регистр, lower - в нижний
        System.out.println(str1.compareTo(str1)); // сравнивает строки и возвращает int 0 - если идентичны, >0 если (аргумент) меньше строки, <0 если (аргумент) больше строки
        System.out.println(str1.equals(str2)); // сравнивает строки, возвращает true/false
        System.out.println(str1.equalsIgnoreCase("STR1")); // сравнивает строки без учета регистра, возвращает true/false
        System.out.println(str1.regionMatches(1, "tr", 0, 2)); //сравнивает str1 и подстроку tr, 1-отступ для сравнения в str1, 0- отступ для сравнения tr, 2-количество символов для сравнения

        String[] name = {"С", "е", "р", "г", "е", "й"};
        System.out.println(String.join("", name)); // Использование для массива строк

    }
}
